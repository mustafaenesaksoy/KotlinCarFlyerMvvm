package com.enesaksoy.kotlincarflyer.view

import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.enesaksoy.kotlincarflyer.adapter.FeedAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class FragmentFactory @Inject constructor(
    private val auth : FirebaseAuth,
    private val adapter : FeedAdapter,
    private val glide: RequestManager
    ): androidx.fragment.app.FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            LoginFragment::class.java.name -> LoginFragment(auth)
            FeedFragment::class.java.name -> FeedFragment(auth,adapter)
            UploadFragment::class.java.name -> UploadFragment(glide)
            else -> super.instantiate(classLoader, className)
        }
    }
}