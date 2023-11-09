package com.example.goodsontheshelf.data.network.models.request

import com.google.gson.annotations.SerializedName


data class Region(

    @SerializedName("levels") var levels: ArrayList<String?> = arrayListOf(),
    @SerializedName("lat") var lat: Double? = null,
    @SerializedName("lng") var lng: Double? = null

)