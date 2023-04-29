package com.enesaksoy.kotlincarflyer.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.enesaksoy.kotlincarflyer.databinding.FeedRowBinding
import com.enesaksoy.kotlincarflyer.model.Car
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class FeedAdapter @Inject constructor(private val glide : RequestManager): RecyclerView.Adapter<FeedAdapter.FeedHolder>() {

    private var OnItemClickListener : ((Car) -> Unit)? = null
    val diffutil = object : DiffUtil.ItemCallback<Car>(){
        override fun areItemsTheSame(oldItem: Car, newItem: Car): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Car, newItem: Car): Boolean {
            return oldItem == newItem
        }
    }

    private val carList = AsyncListDiffer(this,diffutil)

    var cars : List<Car>
    get() = carList.currentList
    set(value) = carList.submitList(value)
    class FeedHolder (val binding : FeedRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedHolder {
        val binding = FeedRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FeedHolder(binding)
    }

    override fun getItemCount(): Int {
        return cars.size
    }
    fun setOnItemClickListener(listener : ((Car) -> Unit)){
        OnItemClickListener = listener
    }
    override fun onBindViewHolder(holder: FeedHolder, position: Int) {
        val car = cars.get(position)
        holder.binding.rowAddressText.text = car.address
        holder.binding.rowBrandText.text = car.brand
        holder.binding.rowPhoneNumberText.text = car.phoneNumber
        glide.load(car.url).into(holder.binding.rowFlyerImageView)
        holder.itemView.setOnClickListener {
            OnItemClickListener?.let {
                it(car)
            }
        }
    }
}