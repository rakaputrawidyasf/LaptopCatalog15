package com.example.laptopcatalog15

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laptopcatalog15.databinding.ItemLayoutBinding

class CatalogListAdapter(private val catalogs : ArrayList<Laptop>) : RecyclerView.Adapter<CatalogListAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(laptop: Laptop) {
            binding.tvItemBrandModel.text = laptop.brandModel
            binding.tvItemDescription.text = laptop.description
            binding.tvItemPrice.text = laptop.price
            binding.imgItem.setImageResource(laptop.image)

            binding.root.setOnClickListener {
                val detailIntent = Intent(binding.root.context, DetailActivity::class.java)
                detailIntent.putExtra(DetailActivity.CATALOG_ITEM, laptop)
                binding.root.context.startActivity(detailIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val laptop = catalogs[position]
        holder.bind(laptop)
    }

    override fun getItemCount(): Int = catalogs.size
}