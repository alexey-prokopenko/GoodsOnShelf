package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Offers(

    @SerializedName("data") var data: ArrayList<DataOffers> = arrayListOf(),
    @SerializedName("count") var count: Int? = null

)