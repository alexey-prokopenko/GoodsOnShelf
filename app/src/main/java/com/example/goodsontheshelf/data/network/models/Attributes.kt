package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Attributes(

    @SerializedName("bonus_program") var bonusProgram: Boolean? = null,
    @SerializedName("boxing") var boxing: String? = null,
    @SerializedName("weight") var weight: Weight? = Weight(),
    @SerializedName("gross_weight") var grossWeight: GrossWeight? = GrossWeight()

)