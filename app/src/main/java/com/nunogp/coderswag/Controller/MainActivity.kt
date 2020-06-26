package com.nunogp.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.nunogp.coderswag.Adapters.CategoryAdapter
import com.nunogp.coderswag.Adapters.CategoryRecycleAdapter
import com.nunogp.coderswag.Model.Category
import com.nunogp.coderswag.R
import com.nunogp.coderswag.Services.DataService
import com.nunogp.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter : CategoryAdapter//ArrayAdapter<Category>
    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter sends data to listview
        //adapter = ArrayAdapter(this,
        //android.R.layout.simple_list_item_1,
        //DataService.categories)
        //adapter = CategoryAdapter(this, DataService.categories)
        //adapter = CategoryRecycleAdapter(this, DataService.categories)
        adapter = CategoryRecycleAdapter(this, DataService.categories ){
            categoryItem -> //Toast.makeText(this, " ${categoryItem.title} ", Toast.LENGTH_SHORT).show()
            //passar para activity_products com data 
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, categoryItem.title)
            startActivity(productIntent)
        }
        //id
        categoryListView.adapter = adapter

        //para recycleview
        val layoutManager = LinearLayoutManager(this)
        //design id
        categoryListView.layoutManager = layoutManager
        //opcional optimization se cells not change size
        categoryListView.setHasFixedSize(true)

        //fazer ação quando carrega item na listview
        //categoryListView.setOnItemClickListener { adapterView, view, i, l ->
          //  val category = DataService.categories[i]
            //Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT ).show()
      // }

        //click listener item recycle view
    }
}