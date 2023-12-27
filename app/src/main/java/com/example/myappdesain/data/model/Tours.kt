package com.example.myappdesain.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tours(
    val id: Long,
    val name: String,
    val description: String,
    val picture: Int,
    val city: String,
    val rating: Double,
    val address: String,
    val ticket: Int
) : Parcelable