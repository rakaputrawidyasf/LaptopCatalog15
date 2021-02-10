package com.example.laptopcatalog15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.laptopcatalog15.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val CATALOG_ITEM = "catalog_item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val laptop = intent.getParcelableExtra<Laptop>(CATALOG_ITEM)

        if (laptop != null) {
            laptop.brandModel.also {
                supportActionBar?.title = it
                binding.tvDetailBrandModel.text = it
            }
            binding.imgDetailImage.setImageResource(laptop.image)
            binding.tvDetailPrice.text = laptop.price
            binding.tvDetailDescription.text = laptop.description
            binding.tvDetailSpecification.text = laptop.specification
        }
    }
}