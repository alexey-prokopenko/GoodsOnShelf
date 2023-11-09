package com.example.goodsontheshelf.data.network.models

import com.google.gson.annotations.SerializedName

data class DataOffers(

    @SerializedName("offers") var offers: Offers? = Offers(),
    @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
    @SerializedName("brand_name") var brandName: String? = null,
    @SerializedName("uuid") var uuid: String? = null,
    @SerializedName("tags") var tags: ArrayList<String> = arrayListOf(),
    @SerializedName("sale_info") var saleInfo: SaleInfo? = SaleInfo(),
    @SerializedName("promo") var promo: ArrayList<Promo> = arrayListOf(),
    @SerializedName("price") var price: Price? = null,
    @SerializedName("has_case_sale") var hasCaseSale: Boolean? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("seo_name") var seoName: String? = null,
    @SerializedName("attributes") var attributes: Attributes? = Attributes(),
    @SerializedName("category_ids") var categoryIds: ArrayList<Int> = arrayListOf(),
    @SerializedName("markers") var markers: Markers? = Markers(),
    @SerializedName("brand") var brand: Int? = null,
    @SerializedName("favorite") var favorite: Boolean? = null,
    @SerializedName("offer_with_min_price") var offerWithMinPrice: OfferWithMinPrice? = OfferWithMinPrice()

)
