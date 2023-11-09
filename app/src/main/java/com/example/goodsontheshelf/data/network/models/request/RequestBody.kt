package com.example.goodsontheshelf.data.network.models.request

import com.google.gson.annotations.SerializedName


data class RequestBody(

    @SerializedName("region") var region: Region? = Region(),
    @SerializedName("category") var category: ArrayList<Int> = arrayListOf(),
    @SerializedName("limit") var limit: Int? = null,
    @SerializedName("offset") var offset: Int? = null

)