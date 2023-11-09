package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Catalog(

    @SerializedName("result") var result: Int? = null,
    @SerializedName("data") var data: ArrayList<Data> = arrayListOf(),
    @SerializedName("order") var order: ArrayList<Order> = arrayListOf()

)