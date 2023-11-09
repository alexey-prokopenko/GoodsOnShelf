package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class DeliveryUnit(

    @SerializedName("mult") var mult: Int? = null, @SerializedName("um") var um: String? = null

)