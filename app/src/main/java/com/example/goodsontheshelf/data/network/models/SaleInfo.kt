package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class SaleInfo(

    @SerializedName("active_till") var activeTill: Int? = null,
    @SerializedName("second_price") var secondPrice: Double? = null,
    @SerializedName("sale_price") var salePrice: Double? = null

)