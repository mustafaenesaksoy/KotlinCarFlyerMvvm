package com.enesaksoy.kotlincarflyer.module

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.enesaksoy.kotlincarflyer.R
import com.enesaksoy.kotlincarflyer.repo.CarRepository
import com.enesaksoy.kotlincarflyer.repo.CarRepositoryImpl
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun injectAuth(): FirebaseAuth{
        return FirebaseAuth.getInstance()
    }

    @Provides
    @Singleton
    fun injectStorage() : FirebaseStorage{
        return FirebaseStorage.getInstance()
    }

    @Provides
    @Singleton
    fun injectFirestore() : FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }

    @Provides
    @Singleton
    fun injectGlide(@ApplicationContext context : Context) = Glide.with(context)
        .setDefaultRequestOptions(
            RequestOptions().error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
        )

    @Provides
    @Singleton
    fun injectRepository(auth: FirebaseAuth,storage: FirebaseStorage,firestore: FirebaseFirestore) : CarRepository{
        return CarRepositoryImpl(auth,storage,firestore)
    }

}