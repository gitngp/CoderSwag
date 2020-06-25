package com.nunogp.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nunogp.coderswag.Model.Category
import com.nunogp.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>):BaseAdapter() {

    val context = context
    val categories = categories

    //override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
     override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       //to change body of created functions use | settings | File Template
        val categoryView : View
        val holder : ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            //textfield ID categoryName
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
            //println("I exist for the first time.")
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            //println("Go green, recycle!")
        }

        val category =  categories[position]
        //convert image name into id resource
        val resourceId =  context.resources.getIdentifier(category.image, "drawable", context.packageName)
        //imageId categoryName
        holder.categoryImage?.setImageResource(resourceId)
        //println(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
       return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    //made class for view holder
    private class ViewHolder {
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }

}