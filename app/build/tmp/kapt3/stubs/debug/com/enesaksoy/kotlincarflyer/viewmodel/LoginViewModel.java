package com.enesaksoy.kotlincarflyer.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/enesaksoy/kotlincarflyer/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/enesaksoy/kotlincarflyer/repo/CarRepository;", "(Lcom/enesaksoy/kotlincarflyer/repo/CarRepository;)V", "getSignMsg", "Landroidx/lifecycle/MutableLiveData;", "Lcom/enesaksoy/kotlincarflyer/util/Resource;", "Lcom/google/firebase/auth/AuthResult;", "getsignMsg", "Landroidx/lifecycle/LiveData;", "getGetsignMsg", "()Landroidx/lifecycle/LiveData;", "signIn", "", "email", "", "password", "signUp", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.enesaksoy.kotlincarflyer.repo.CarRepository repo = null;
    private final androidx.lifecycle.MutableLiveData<com.enesaksoy.kotlincarflyer.util.Resource<com.google.firebase.auth.AuthResult>> getSignMsg = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.enesaksoy.kotlincarflyer.repo.CarRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.enesaksoy.kotlincarflyer.util.Resource<com.google.firebase.auth.AuthResult>> getGetsignMsg() {
        return null;
    }
    
    public final void signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}