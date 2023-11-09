package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class DeliveryDays(

    @SerializedName("sunday") var sunday: Boolean? = null,
    @SerializedName("saturday") var saturday: Boolean? = null,
    @SerializedName("tuesday") var tuesday: Boolean? = null,
    @SerializedName("wednesday") var wednesday: Boolean? = null,
    @SerializedName("thursday") var thursday: Boolean? = null,
    @SerializedName("friday") var friday: Boolean? = null,
    @SerializedName("monday") var monday: Boolean? = null

)