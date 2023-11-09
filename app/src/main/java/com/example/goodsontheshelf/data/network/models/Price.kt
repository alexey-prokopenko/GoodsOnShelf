package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Price(

    @SerializedName("delivery_prepaid") var deliveryPrepaid: Double? = null

)