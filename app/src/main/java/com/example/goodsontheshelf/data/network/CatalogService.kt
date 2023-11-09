package com.example.goodsontheshelf.data.network

import com.example.goodsontheshelf.data.network.models.Catalog
import com.example.goodsontheshelf.data.network.models.request.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface CatalogService {

    @POST("catalog")
    suspend fun goodsSearch(@Body body: RequestBody): Catalog
}