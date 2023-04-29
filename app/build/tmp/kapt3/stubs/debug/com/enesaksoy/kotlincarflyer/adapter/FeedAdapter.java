package com.enesaksoy.kotlincarflyer.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u001a\u0010!\u001a\u00020\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/enesaksoy/kotlincarflyer/adapter/FeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/enesaksoy/kotlincarflyer/adapter/FeedAdapter$FeedHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "OnItemClickListener", "Lkotlin/Function1;", "Lcom/enesaksoy/kotlincarflyer/model/Car;", "", "carList", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "cars", "getCars", "()Ljava/util/List;", "setCars", "(Ljava/util/List;)V", "diffutil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffutil", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "FeedHolder", "app_debug"})
public final class FeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.enesaksoy.kotlincarflyer.adapter.FeedAdapter.FeedHolder> {
    private final com.bumptech.glide.RequestManager glide = null;
    private kotlin.jvm.functions.Function1<? super com.enesaksoy.kotlincarflyer.model.Car, kotlin.Unit> OnItemClickListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.enesaksoy.kotlincarflyer.model.Car> diffutil = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.enesaksoy.kotlincarflyer.model.Car> carList = null;
    
    @javax.inject.Inject()
    public FeedAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.enesaksoy.kotlincarflyer.model.Car> getDiffutil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.enesaksoy.kotlincarflyer.model.Car> getCars() {
        return null;
    }
    
    public final void setCars(@org.jetbrains.annotations.NotNull()
    java.util.List<com.enesaksoy.kotlincarflyer.model.Car> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.enesaksoy.kotlincarflyer.adapter.FeedAdapter.FeedHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.enesaksoy.kotlincarflyer.model.Car, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.enesaksoy.kotlincarflyer.adapter.FeedAdapter.FeedHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/enesaksoy/kotlincarflyer/adapter/FeedAdapter$FeedHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/enesaksoy/kotlincarflyer/databinding/FeedRowBinding;", "(Lcom/enesaksoy/kotlincarflyer/databinding/FeedRowBinding;)V", "getBinding", "()Lcom/enesaksoy/kotlincarflyer/databinding/FeedRowBinding;", "app_debug"})
    public static final class FeedHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.enesaksoy.kotlincarflyer.databinding.FeedRowBinding binding = null;
        
        public FeedHolder(@org.jetbrains.annotations.NotNull()
        com.enesaksoy.kotlincarflyer.databinding.FeedRowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.enesaksoy.kotlincarflyer.databinding.FeedRowBinding getBinding() {
            return null;
        }
    }
}