package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Promo(

    @SerializedName("actionType") var actionType: String? = null,
    @SerializedName("maxBonusPC") var maxBonusPC: Int? = null,
    @SerializedName("suppliers") var suppliers: ArrayList<Suppliers> = arrayListOf(),
    @SerializedName("showOnSuppliersPage") var showOnSuppliersPage: Boolean? = null,
    @SerializedName("promoId") var promoId: Int? = null,
    @SerializedName("amountInfo") var amountInfo: String? = null,
    @SerializedName("promoSubjectTypes") var promoSubjectTypes: ArrayList<String> = arrayListOf()

)