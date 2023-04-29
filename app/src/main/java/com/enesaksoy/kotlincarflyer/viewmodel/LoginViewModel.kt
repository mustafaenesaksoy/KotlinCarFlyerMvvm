package com.enesaksoy.kotlincarflyer.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesaksoy.kotlincarflyer.repo.CarRepository
import com.enesaksoy.kotlincarflyer.util.Resource
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor( private val repo : CarRepository): ViewModel() {

    private val getSignMsg = MutableLiveData<Resource<AuthResult>>()
    val getsignMsg : LiveData<Resource<AuthResult>>
    get() = getSignMsg

    fun signIn(email : String, password : String){
        viewModelScope.launch {
            getSignMsg.value = repo.signIn(email, password)
        }
    }

    fun signUp(email : String, password : String){
        viewModelScope.launch {
            getSignMsg.value = repo.signUp(email, password)
        }
    }
}