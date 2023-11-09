package com.example.goodsontheshelf.domain

import com.example.goodsontheshelf.presentation.models.Product

interface CatalogRepository {

    suspend fun getGoods(): List<Product>

    suspend fun getCurrentSum(): String
}