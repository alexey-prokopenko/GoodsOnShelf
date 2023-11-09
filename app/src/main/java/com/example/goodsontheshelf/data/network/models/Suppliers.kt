package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class Suppliers(

    @SerializedName("supplier_display_name") var supplierDisplayName: String? = null,
    @SerializedName("supplier_id") var supplierId: String? = null

)