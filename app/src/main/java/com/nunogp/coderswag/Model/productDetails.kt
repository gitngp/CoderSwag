package com.nunogp.coderswag.Model

import android.os.Parcel
import android.os.Parcelable

class productDetails(var title: String?, var price: String?, var image: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(price)
        parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<productDetails> {
        override fun createFromParcel(parcel: Parcel): productDetails {
            return productDetails(parcel)
        }

        override fun newArray(size: Int): Array<productDetails?> {
            return arrayOfNulls(size)
        }
    }


}