package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class GrossWeight(

    @SerializedName("val") var value: Double? = null, @SerializedName("um") var um: String? = null

)