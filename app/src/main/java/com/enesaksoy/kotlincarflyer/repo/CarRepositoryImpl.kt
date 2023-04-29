package com.enesaksoy.kotlincarflyer.repo

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import com.enesaksoy.kotlincarflyer.model.Car
import com.enesaksoy.kotlincarflyer.util.Resource
import com.google.android.gms.tasks.Task
import com.google.firebase.Timestamp
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.tasks.await
import java.util.UUID
import javax.inject.Inject

class CarRepositoryImpl @Inject constructor(private val auth: FirebaseAuth,
                                            private val storage : FirebaseStorage,
                                            private val firestore : FirebaseFirestore
                                            ) : CarRepository {



    override suspend fun signIn(email : String, password : String): Resource<AuthResult> {
        if(email.equals("") || password.equals("")){
            return Resource.error("Email and password cannot be left blank.",null)
        }
        return try {
            val result = auth.signInWithEmailAndPassword(email, password).await()
            Resource.success(result)
        }catch (e : Exception){
            Resource.error("User Error",null)
        }
    }

    override suspend fun signUp(email : String, password : String): Resource<AuthResult> {
        if(email.equals("") || password.equals("")){
            return Resource.error("Email and password cannot be left blank.",null)
        }
        return try {
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            Resource.success(result)
        }catch (e : Exception){
            Resource.error("User Error",null)
        }
    }

    override suspend fun upload(
        selectedUri: Uri,
        brand: String,
        address: String,
        phoneNumber: String
    ): Resource<DocumentReference> {
        if(brand.equals("") || address.equals("") || phoneNumber.equals("")){
            return Resource.error("cannot be left blank.",null)
        }

        return try {
            val uuid = UUID.randomUUID()
            val fileName = "${uuid}.jpg"
            val reference = storage.reference.child("Images").child(fileName)
            if(selectedUri != null){
                reference.putFile(selectedUri).await()
                val uri = reference.downloadUrl.await()
                val url = uri.toString()
                val carMap = HashMap<String, Any>()
                carMap.put("email",auth.currentUser?.email!!)
                carMap.put("url",url)
                carMap.put("brand",brand)
                carMap.put("address",address)
                carMap.put("phoneNumber",phoneNumber)
                carMap.put("date",Timestamp.now())
                var documentReference = firestore.collection("CarFlyer").add(carMap).await()
                return Resource.success(documentReference)
            }
            Resource.error("Error",null)
        }catch (e: Exception){
            Resource.error(e.toString(),null)
        }
    }
}