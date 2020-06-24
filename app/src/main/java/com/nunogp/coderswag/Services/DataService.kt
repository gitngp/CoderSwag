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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Sanpback", "$22", "hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$32", "hoodie02"),
        Product("Devslopes Grey Hoodie", "$28", "hoodie03"),
        Product("Devslopes Black Hoodie", "$30", "hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt01"),
        Product("Devslopes  Badge Light Gray", "$28", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
        Product("Devslopes Hustle", "$23", "shirt04"),
        Product("Devslopes Studios", "$25", "shirt05")
    )
}