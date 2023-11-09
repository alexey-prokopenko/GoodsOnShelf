package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class OrderLimit(

    @SerializedName("min_sku_count") var minSkuCount: Int? = null

)