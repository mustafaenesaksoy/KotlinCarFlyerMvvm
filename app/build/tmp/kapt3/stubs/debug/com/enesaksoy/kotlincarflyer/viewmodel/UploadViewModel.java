package com.enesaksoy.kotlincarflyer.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/enesaksoy/kotlincarflyer/viewmodel/UploadViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/enesaksoy/kotlincarflyer/repo/CarRepository;", "(Lcom/enesaksoy/kotlincarflyer/repo/CarRepository;)V", "getUploadMsg", "Landroidx/lifecycle/MutableLiveData;", "Lcom/enesaksoy/kotlincarflyer/util/Resource;", "Lcom/google/firebase/firestore/DocumentReference;", "getuploadMsg", "Landroidx/lifecycle/LiveData;", "getGetuploadMsg", "()Landroidx/lifecycle/LiveData;", "", "selectedUri", "Landroid/net/Uri;", "brand", "", "address", "phoneNumber", "app_debug"})
public final class UploadViewModel extends androidx.lifecycle.ViewModel {
    private final com.enesaksoy.kotlincarflyer.repo.CarRepository repo = null;
    private final androidx.lifecycle.MutableLiveData<com.enesaksoy.kotlincarflyer.util.Resource<com.google.firebase.firestore.DocumentReference>> getUploadMsg = null;
    
    @javax.inject.Inject()
    public UploadViewModel(@org.jetbrains.annotations.NotNull()
    com.enesaksoy.kotlincarflyer.repo.CarRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.enesaksoy.kotlincarflyer.util.Resource<com.google.firebase.firestore.DocumentReference>> getGetuploadMsg() {
        return null;
    }
    
    public final void getUploadMsg(@org.jetbrains.annotations.NotNull()
    android.net.Uri selectedUri, @org.jetbrains.annotations.NotNull()
    java.lang.String brand, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
}