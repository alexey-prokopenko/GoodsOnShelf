package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class PaymentInfo(

    @SerializedName("isCache") var isCache: Boolean? = null,
    @SerializedName("accountingSystem") var accountingSystem: String? = null,
    @SerializedName("payTypes") var payTypes: ArrayList<String> = arrayListOf(),
    @SerializedName("isCardOnDelivery") var isCardOnDelivery: Boolean? = null,
    @SerializedName("defermentPeriod") var defermentPeriod: Int? = null,
    @SerializedName("isCacheless") var isCacheless: Boolean? = null,
    @SerializedName("isDefermentPayment") var isDefermentPayment: Boolean? = null,
    @SerializedName("payInfos") var payInfos: ArrayList<PayInfos> = arrayListOf(),
    @SerializedName("send_invoice_type") var sendInvoiceType: String? = null

)