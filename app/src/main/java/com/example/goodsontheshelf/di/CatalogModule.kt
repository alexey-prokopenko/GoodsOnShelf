package com.example.goodsontheshelf.di

import com.example.goodsontheshelf.data.CatalogRepositoryImpl
import com.example.goodsontheshelf.data.network.CatalogService
import com.example.goodsontheshelf.domain.CatalogRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object CatalogModule {

    @Provides
    fun provideCatalogRepository(catalogService: CatalogService) : CatalogRepository = CatalogRepositoryImpl(
        catalogService = catalogService
    )
}