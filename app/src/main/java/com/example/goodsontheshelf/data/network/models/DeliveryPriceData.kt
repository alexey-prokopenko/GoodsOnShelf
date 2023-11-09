package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class DeliveryPriceData(

    @SerializedName("fixed") var fixed: Int? = null,
    @SerializedName("delivery_price_type") var deliveryPriceType: String? = null

)