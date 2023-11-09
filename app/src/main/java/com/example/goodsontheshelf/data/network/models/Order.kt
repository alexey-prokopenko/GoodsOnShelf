package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Order(

    @SerializedName("asc") var asc: Boolean? = null,
    @SerializedName("type") var type: String? = null

)