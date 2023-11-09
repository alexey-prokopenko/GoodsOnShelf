package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Weight(

    @SerializedName("val") var value: Int? = null, @SerializedName("um") var um: String? = null

)