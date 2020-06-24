package com.nunogp.coderswag.Model

class Category(val title: String, val image: String){
    //show title in listview
    override fun toString(): String {
        return title
    }
}