package com.enesaksoy.kotlincarflyer.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.enesaksoy.kotlincarflyer.R
import com.enesaksoy.kotlincarflyer.adapter.FeedAdapter
import com.enesaksoy.kotlincarflyer.databinding.FeedFragmentBinding
import com.enesaksoy.kotlincarflyer.util.Status
import com.enesaksoy.kotlincarflyer.viewmodel.FeedViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject


class FeedFragment  @Inject constructor(
    private val auth : FirebaseAuth,
    private val adapter : FeedAdapter
    ) : Fragment(R.layout.feed_fragment) ,MenuProvider{
    private lateinit var binding : FeedFragmentBinding
    private lateinit var viewModel : FeedViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FeedFragmentBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity()).get(FeedViewModel::class.java)
        requireActivity().addMenuProvider(this,viewLifecycleOwner)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
        viewModel.getDataMsg()
        observeOn()
        adapter.setOnItemClickListener {
            val action = FeedFragmentDirections.actionFeedFragmentToUploadFragment()
                .setInfo("old")
                .setAddress(it.address)
                .setPhonenumber(it.phoneNumber)
                .setBrand(it.brand)
                .setEmail(it.email)
                .setUrl(it.url)
            Navigation.findNavController(requireView()).navigate(action)
        }
    }

    private fun observeOn(){
        viewModel.getdataMsg.observe(viewLifecycleOwner, Observer {
            if(it.status == Status.SUCCESS){
                if(it.data != null) {
                    adapter.cars = it.data!!
                    adapter.notifyDataSetChanged()
                }
            }else if(it.status == Status.ERROR){
                Toast.makeText(requireContext(),it.message,Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.item_menu,menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        if (menuItem.itemId == R.id.addCarFlyer){
            val action = FeedFragmentDirections.actionFeedFragmentToUploadFragment().setInfo("new")
            Navigation.findNavController(requireView()).navigate(action)
            return true
        }else if(menuItem.itemId == R.id.signOut){
            auth.signOut()
            findNavController().popBackStack()
            return true
        }
        return false
    }
}