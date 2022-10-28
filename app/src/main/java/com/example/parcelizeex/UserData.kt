package com.example.parcelizeex

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserData(
    val name: String,
    val age: Int
) : Parcelable