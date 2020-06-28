package com.nunogp.coderswag.Controller

import android.content.res.Configuration
import android.media.VolumeShaper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.nunogp.coderswag.Adapters.ProductsAdapter
import com.nunogp.coderswag.R
import com.nunogp.coderswag.Services.DataService
import com.nunogp.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    //de fun getProducts em DataService
    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //Toast.makeText(this, " $categoryType ", Toast.LENGTH_SHORT).show()
        adapter = ProductsAdapter(this, DataService.getProduct(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }
        val extra = resources.configuration.screenWidthDp
        //spanCount num de colunas
        val layoutManager = GridLayoutManager(this, spanCount)
        //ID de activity_products
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}