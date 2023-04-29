package com.enesaksoy.kotlincarflyer.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u001a\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/enesaksoy/kotlincarflyer/view/UploadFragment;", "Landroidx/fragment/app/Fragment;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "binding", "Lcom/enesaksoy/kotlincarflyer/databinding/UploadFragmentBinding;", "permissionLauncher", "", "selectedUri", "Landroid/net/Uri;", "viewModel", "Lcom/enesaksoy/kotlincarflyer/viewmodel/UploadViewModel;", "getArgument", "", "observeOn", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "registerLauncher", "setSelectImage", "app_debug"})
public final class UploadFragment extends androidx.fragment.app.Fragment {
    private final com.bumptech.glide.RequestManager glide = null;
    private com.enesaksoy.kotlincarflyer.databinding.UploadFragmentBinding binding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> permissionLauncher;
    private android.net.Uri selectedUri;
    private com.enesaksoy.kotlincarflyer.viewmodel.UploadViewModel viewModel;
    
    @javax.inject.Inject()
    public UploadFragment(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getArgument() {
    }
    
    private final void observeOn() {
    }
    
    public final void setSelectImage(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void registerLauncher() {
    }
}