package com.nunogp.coderswag.Services

import com.nunogp.coderswag.Model.Category
import com.nunogp.coderswag.Model.Product

object DataService {
    //listof vararg
    val categories = listOf(
        //category de model image nome image
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
        )
    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Sanpback", "$22", "hat4")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Grey Hoodie", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$30", "hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes  Badge Light Gray", "$28", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$23", "shirt4"),
        Product("Devslopes Studios", "$25", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProduct(category : String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}