package com.example.goodsontheshelf.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.goodsontheshelf.domain.CatalogRepository
import com.example.goodsontheshelf.presentation.models.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class GoodsViewModel @Inject constructor(
    private val catalogRepository: CatalogRepository
) : ViewModel() {

    var goodsUiState: GoodsUiState by mutableStateOf(GoodsUiState.Loading)
        private set

    init {
        getGoods()
    }

    fun getGoods() {
        viewModelScope.launch {
            goodsUiState = GoodsUiState.Loading
            goodsUiState =
                try {
                    GoodsUiState.Success(
                        goodsSearch = catalogRepository.getGoods(),
                        sum = catalogRepository.getCurrentSum()
                    )
                } catch (e: IOException) {
                    GoodsUiState.Error
                } catch (e: HttpException) {
                    GoodsUiState.Error
                }
        }
    }
}

sealed interface GoodsUiState {
    data class Success(
        val goodsSearch: List<Product>,
        val sum: String
    ) : GoodsUiState

    object Error : GoodsUiState
    object Loading : GoodsUiState
}