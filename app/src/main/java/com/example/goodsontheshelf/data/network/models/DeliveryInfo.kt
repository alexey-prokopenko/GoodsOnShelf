package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class DeliveryInfo(

    @SerializedName("deliveryPriceData") var deliveryPriceData: DeliveryPriceData? = DeliveryPriceData(),
    @SerializedName("nearestDeliveryDate") var nearestDeliveryDate: String? = null,
    @SerializedName("supplierId") var supplierId: String? = null,
    @SerializedName("nonWorkingDays") var nonWorkingDays: ArrayList<String> = arrayListOf(),
    @SerializedName("deliveryDays") var deliveryDays: DeliveryDays? = DeliveryDays(),
    @SerializedName("needCard") var needCard: Boolean? = null,
    @SerializedName("unloading_terms") var unloadingTerms: ArrayList<UnloadingTerms> = arrayListOf(),
    @SerializedName("orderReturnInfo") var orderReturnInfo: OrderReturnInfo? = OrderReturnInfo(),
    @SerializedName("minOrderCost") var minOrderCost: Int? = null,
    @SerializedName("order_limit") var orderLimit: OrderLimit? = OrderLimit(),
    @SerializedName("paymentInfo") var paymentInfo: PaymentInfo? = PaymentInfo()

)