package com.example.laptopcatalog15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laptopcatalog15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var catalogList : ArrayList<Laptop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Best Laptops 2021"

        catalogList.addAll(Catalogs.catalogList)

        binding.rvCatalogs.setHasFixedSize(false)
        binding.rvCatalogs.layoutManager = LinearLayoutManager(this)
        val catalogListAdapter = CatalogListAdapter(catalogList)
        binding.rvCatalogs.adapter = catalogListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val aboutIntent = Intent(this, AboutActivity::class.java)
        startActivity(aboutIntent)
        return super.onOptionsItemSelected(item)
    }
}