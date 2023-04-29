package com.enesaksoy.kotlincarflyer.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesaksoy.kotlincarflyer.model.Car
import com.enesaksoy.kotlincarflyer.repo.CarRepository
import com.enesaksoy.kotlincarflyer.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel@Inject constructor(private val repo : CarRepository,private val firestore: FirebaseFirestore) : ViewModel(){


    private val getDataMsg = MutableLiveData<Resource<List<Car>>>()
    val getdataMsg : LiveData<Resource<List<Car>>>
    get() = getDataMsg

    fun getDataMsg(){
        firestore.collection("CarFlyer").orderBy("date", Query.Direction.DESCENDING).addSnapshotListener { value, error ->
            if(error != null){
                getDataMsg.value = Resource.error(error.localizedMessage,null)
            }else{
                if(value != null){
                    val documents = value.documents
                    val list = ArrayList<Car>()
                    for(document in documents){
                        val email = document.get("email") as String
                        val url = document.get("url") as String
                        val brand = document.get("brand") as String
                        val address = document.get("address") as String
                        val phoneNumber = document.get("phoneNumber") as String
                        val car = Car(email, url,brand, address, phoneNumber)
                        list.add(car)
                    }
                    getDataMsg.value = Resource.success(list)
                }
            }
        }
    }

}