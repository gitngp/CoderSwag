package com.nunogp.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Toast
import com.nunogp.coderswag.Adapters.CategoryAdapter
import com.nunogp.coderswag.Model.Category
import com.nunogp.coderswag.R
import com.nunogp.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter//ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter sends data to listview
        //adapter = ArrayAdapter(this,
        //android.R.layout.simple_list_item_1,
        //DataService.categories)
        adapter = CategoryAdapter(this, DataService.categories)
        //id
        category_listView.adapter = adapter

        //fazer ação quando carrega item na listview
        //category_listView.setOnItemClickListener { adapterView, view, i, l ->
        //    val category = DataService.categories[i]
        //   Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT ).show()
        //}
        
    }
}