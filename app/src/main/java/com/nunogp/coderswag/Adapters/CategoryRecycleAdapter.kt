package com.nunogp.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nunogp.coderswag.Model.Category
import com.nunogp.coderswag.R

//3 alt+enter em baixo implement members  selecionar todos 3    //2 <holder> //4 () //5 val context val categotries //unit lambda
class CategoryRecycleAdapter(val context : Context, val categories: List<Category>, val itemClick:(Category) -> Unit): RecyclerView.Adapter<CategoryRecycleAdapter.Holder> (){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
                                                   //inflate atatchtoroot viewgroup
            val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
            return Holder(view, itemClick)
        }

        override fun getItemCount(): Int {
            return categories.count()
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder?.bindCategory(categories[position], context)
        }

        //1 em baixo RecyclerView alt+enter add constroctor parameter
        // inner class holder : RecyclerView.ViewHolder {
        inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView!!) {
            // design
            val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
            val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

            fun bindCategory(category: Category, context: Context){
                val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
                categoryImage?.setImageResource(resourceId)
                categoryName?.text=category.title
                itemView.setOnClickListener { itemClick(category) }
            }
        }

}