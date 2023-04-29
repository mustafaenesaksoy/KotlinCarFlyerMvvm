package com.enesaksoy.kotlincarflyer.view

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.RequestManager
import com.enesaksoy.kotlincarflyer.R
import com.enesaksoy.kotlincarflyer.databinding.UploadFragmentBinding
import com.enesaksoy.kotlincarflyer.util.Status
import com.enesaksoy.kotlincarflyer.viewmodel.UploadViewModel
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class UploadFragment@Inject constructor(private val glide: RequestManager) : Fragment(R.layout.upload_fragment) {
    private lateinit var binding : UploadFragmentBinding
    private lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var permissionLauncher: ActivityResultLauncher<String>
    private var selectedUri : Uri? = null
    private lateinit var viewModel : UploadViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UploadFragmentBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity()).get(UploadViewModel::class.java)
        binding.flyerImageView.setOnClickListener {
            setSelectImage(it)
        }
        binding.saveButton.setOnClickListener {
            viewModel.getUploadMsg(
                selectedUri!!,binding.brandText.text.toString(),
                binding.addressText.text.toString(),
                binding.phoneNumberText.text.toString()
            )
        }
        getArgument()
        registerLauncher()
        observeOn()
    }

    fun getArgument(){
        arguments?.let {
            val info = UploadFragmentArgs.fromBundle(it).info
            if (info.equals("new")){
                binding.flyerImageView.setImageResource(R.drawable.selectimage)
                binding.userEmail.visibility = View.GONE
                binding.phoneNumberText.setText("")
                binding.brandText.setText("")
                binding.addressText.setText("")
                binding.saveButton.visibility= View.VISIBLE
            }else if(info.equals("old")){
                binding.saveButton.visibility = View.GONE
                binding.userEmail.visibility = View.VISIBLE
                arguments?.let {
                    binding.userEmail.text = UploadFragmentArgs.fromBundle(it).email
                    glide.load(UploadFragmentArgs.fromBundle(it).url).into(binding.flyerImageView)
                    binding.brandText.setText(UploadFragmentArgs.fromBundle(it).brand)
                    binding.addressText.setText(UploadFragmentArgs.fromBundle(it).address)
                    binding.phoneNumberText.setText(UploadFragmentArgs.fromBundle(it).phonenumber)
                }
            }
        }
    }

    private fun observeOn(){
        viewModel.getuploadMsg.observe(viewLifecycleOwner, Observer {
            if(it.status == Status.SUCCESS){
                if(it.data != null) {
                    findNavController().popBackStack()
                }
            }else if(it.status == Status.ERROR){
                Toast.makeText(requireContext(),it.message,Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun setSelectImage(view : View){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            if(ContextCompat.checkSelfPermission(requireContext(),Manifest.permission.READ_MEDIA_IMAGES) != PackageManager.PERMISSION_GRANTED) {
                if(ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(),Manifest.permission.READ_MEDIA_IMAGES)){
                    Snackbar.make(requireView(),"Permission needed for gallery",Snackbar.LENGTH_INDEFINITE).setAction("Allow"){
                        permissionLauncher.launch(Manifest.permission.READ_MEDIA_IMAGES)
                    }.show()
                }else{
                    permissionLauncher.launch(Manifest.permission.READ_MEDIA_IMAGES)
                }
            }else{
                val intent = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                activityResultLauncher.launch(intent)
            }
        }else{
            if(ContextCompat.checkSelfPermission(requireContext(),Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                if(ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(),Manifest.permission.READ_EXTERNAL_STORAGE)){
                    Snackbar.make(requireView(),"Permission needed for gallery",Snackbar.LENGTH_INDEFINITE).setAction("Allow"){
                        permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                    }.show()
                }else{
                    permissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                }
            }else{
                val intent = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                activityResultLauncher.launch(intent)
            }
        }

    }

    fun registerLauncher(){
        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result->
            if(result != null){
                val intent = result.data
                if(intent != null){
                 selectedUri = intent.data
                    selectedUri?.let {
                        binding.flyerImageView.setImageURI(it)
                    }
                }
            }
        }

        permissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
            if(it){
                val intent = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                activityResultLauncher.launch(intent)
            }else{
                Toast.makeText(requireContext(),"Permission needed for gallery",Toast.LENGTH_SHORT).show()
            }
        }
    }
}