package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class OrderReturnInfo(

    @SerializedName("type") var type: String? = null

)