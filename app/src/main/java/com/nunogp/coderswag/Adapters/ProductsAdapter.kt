package com.nunogp.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nunogp.coderswag.Model.Product
import com.nunogp.coderswag.R

//2 <>
//3 secionado PrductsHolder alt+enter implement members selecionar todos 3
//4 (contrext, products)                                                                model.product
class ProductsAdapter(val context: Context, val products: List<Product>, val itemClick : (Product)-> Unit): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    //1selecionado RecycleView alt+enter add constrocter parameters from viewholder (View!)
    //inner class ProductHolder: RecyclerView.ViewHolder{
    inner class ProductHolder(itemView: View?, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView!!) {
        //5 productImage layout ID
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct (product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text=product.title
            productPrice?.text=product.price
            itemView.setOnClickListener { itemClick(product) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        //6 criar view pela 1º vez         inflate atatchtoroot viewgroup
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_file, parent, false)
        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
       //6
        holder?.bindProduct(products[position], context)
    }
}