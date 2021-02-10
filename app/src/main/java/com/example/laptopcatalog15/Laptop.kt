package com.example.laptopcatalog15

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Laptop(
    val brandModel : String,
    val description: String,
    val specification : String,
    val price : String,
    val image : Int
) : Parcelable