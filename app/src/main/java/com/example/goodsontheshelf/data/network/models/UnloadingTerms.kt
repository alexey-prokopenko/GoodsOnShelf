package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class UnloadingTerms(

    @SerializedName("cost_to_tradepoint") var costToTradepoint: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("cost_to_floor") var costToFloor: String? = null,
    @SerializedName("type") var type: String? = null

)