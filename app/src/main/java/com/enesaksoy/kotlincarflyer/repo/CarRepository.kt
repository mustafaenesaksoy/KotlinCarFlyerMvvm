package com.enesaksoy.kotlincarflyer.repo

import android.net.Uri
import com.enesaksoy.kotlincarflyer.model.Car
import com.enesaksoy.kotlincarflyer.util.Resource
import com.google.firebase.auth.AuthResult
import com.google.firebase.firestore.DocumentReference

interface CarRepository {

    suspend fun signIn(email : String, password : String) : Resource<AuthResult>

    suspend fun signUp(email : String, password : String) : Resource<AuthResult>

    suspend fun upload(selectedUri : Uri, brand : String, address : String, phoneNumber : String) : Resource<DocumentReference>

}