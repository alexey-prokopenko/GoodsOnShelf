package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class PayInfos(

    @SerializedName("payType") var payType: String? = null,
    @SerializedName("isDeferment") var isDeferment: Boolean? = null

)