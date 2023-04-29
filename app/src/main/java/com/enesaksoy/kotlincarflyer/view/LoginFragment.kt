package com.enesaksoy.kotlincarflyer.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.enesaksoy.kotlincarflyer.R
import com.enesaksoy.kotlincarflyer.databinding.LoginFragmentBinding
import com.enesaksoy.kotlincarflyer.util.Status
import com.enesaksoy.kotlincarflyer.viewmodel.LoginViewModel
import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject


class LoginFragment @Inject constructor(private val auth: FirebaseAuth): Fragment(R.layout.login_fragment) {
    private lateinit var binding : LoginFragmentBinding
    private lateinit var viewModel : LoginViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LoginFragmentBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity()).get(LoginViewModel::class.java)
        binding.signInButton.setOnClickListener {
            viewModel.signIn(binding.emailText.text.toString(),binding.passwordText.text.toString())
        }
        binding.signUpButton.setOnClickListener {
            viewModel.signUp(binding.emailText.text.toString(),binding.passwordText.text.toString())
        }
        if(auth.currentUser != null){
            val action = LoginFragmentDirections.actionLoginFragmentToFeedFragment()
            Navigation.findNavController(requireView()).navigate(action)
        }
        observeOn()
    }

    private fun observeOn(){
        viewModel.getsignMsg.observe(viewLifecycleOwner, Observer {
            if(it.status == Status.SUCCESS){
                if(auth.currentUser != null){
                    val action = LoginFragmentDirections.actionLoginFragmentToFeedFragment()
                    Navigation.findNavController(requireView()).navigate(action)
                }
            }else if(it.status == Status.ERROR){
                Toast.makeText(requireContext(),it.message,Toast.LENGTH_SHORT).show()
            }
        })
    }
}