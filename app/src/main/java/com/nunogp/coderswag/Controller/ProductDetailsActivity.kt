package com.nunogp.coderswag.Controller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nunogp.coderswag.Model.productDetails
import com.nunogp.coderswag.R
import com.nunogp.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*


class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val details = intent.getParcelableExtra<productDetails>(EXTRA_PRODUCT)
        DetailName.text= "Name: ${details.title} "
        detailPrice.text = "Price: ${details.price}"

        var image = details.image
        val resID = resources.getIdentifier(image, "drawable", packageName)
        detailImage.setImageResource(resID)

         buyBtn.setOnClickListener {
            Toast.makeText(this, "You bought a ${details.title}", Toast.LENGTH_SHORT).show()
        }
    }
}