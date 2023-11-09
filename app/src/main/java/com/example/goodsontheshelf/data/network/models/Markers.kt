package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Markers(

    @SerializedName("best_offers") var bestOffers: Boolean? = null,
    @SerializedName("product_of_the_day") var productOfTheDay: Boolean? = null,
    @SerializedName("new_product") var newProduct: Boolean? = null,
    @SerializedName("top_sales") var topSales: Boolean? = null

)