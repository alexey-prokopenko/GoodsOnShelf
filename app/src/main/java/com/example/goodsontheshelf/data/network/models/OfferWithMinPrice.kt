package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName


data class OfferWithMinPrice(

    @SerializedName("pricelist_updated_date") var pricelistUpdatedDate: String? = null,
    @SerializedName("deliveryInfo") var deliveryInfo: DeliveryInfo? = DeliveryInfo(),
    @SerializedName("pricelist_id") var pricelistId: Int? = null,
    @SerializedName("supplier_user_rating") var supplierUserRating: Double? = null,
    @SerializedName("uuid") var uuid: String? = null,
    @SerializedName("sale_info") var saleInfo: SaleInfo? = SaleInfo(),
    @SerializedName("price") var price: Price? = Price(),
    @SerializedName("supplier_product_id") var supplierProductId: String? = null,
    @SerializedName("supplier_display_name") var supplierDisplayName: String? = null,
    @SerializedName("minOrderCost") var minOrderCost: Int? = null,
    @SerializedName("pricelist_for_compare") var pricelistForCompare: Boolean? = null,
    @SerializedName("supplier_id") var supplierId: String? = null,
    @SerializedName("deliveryUnit") var deliveryUnit: DeliveryUnit? = DeliveryUnit()

)