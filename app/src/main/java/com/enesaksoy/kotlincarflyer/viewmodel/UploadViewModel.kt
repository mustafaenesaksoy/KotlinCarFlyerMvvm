package com.enesaksoy.kotlincarflyer.viewmodel

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesaksoy.kotlincarflyer.repo.CarRepository
import com.enesaksoy.kotlincarflyer.util.Resource
import com.google.firebase.firestore.DocumentReference
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class UploadViewModel @Inject constructor(private val repo : CarRepository): ViewModel(){

    private val getUploadMsg = MutableLiveData<Resource<DocumentReference>>()
    val getuploadMsg : LiveData<Resource<DocumentReference>>
        get() = getUploadMsg


    fun getUploadMsg(selectedUri : Uri, brand : String, address : String, phoneNumber : String){
        viewModelScope.launch {
            getUploadMsg.value = repo.upload(selectedUri, brand, address, phoneNumber)
            getUploadMsg.value = Resource.success(null)
        }
    }
}