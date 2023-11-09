package com.example.goodsontheshelf.data

import com.example.goodsontheshelf.data.network.CatalogService
import com.example.goodsontheshelf.data.network.models.request.Region
import com.example.goodsontheshelf.data.network.models.request.RequestBody
import com.example.goodsontheshelf.domain.CatalogRepository
import com.example.goodsontheshelf.presentation.models.Product
import javax.inject.Inject


class CatalogRepositoryImpl @Inject constructor(
    private val catalogService: CatalogService
) : CatalogRepository {
    private val body = RequestBody(
        region = Region(
            levels = arrayListOf(
                "0c5b2444-70a0-4932-980c-b4dc0d3f02b5", null, null
            ), lat = 55.693394, lng = 37.557502
        ),
        category = arrayListOf(460),
        limit = 5,
        offset = 0
    )

    private var currentSum: Double = ZERO_SUM
    override suspend fun getGoods(): List<Product> = catalogService.goodsSearch(
        body
    ).data.map {
        currentSum += it.price ?: ZERO_SUM
        Product(
            title = it.name,
            price = it.price.toString(),
            imageId = it.images.first(),
            brandName = it.brandName
        )
    }

    override suspend fun getCurrentSum(): String = currentSum.toString()

    companion object{
        const val ZERO_SUM = 0.0
    }

}