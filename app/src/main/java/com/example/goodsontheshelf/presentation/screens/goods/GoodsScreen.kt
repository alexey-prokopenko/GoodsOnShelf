package com.example.goodsontheshelf.presentation.screens.goods

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.goodsontheshelf.R
import com.example.goodsontheshelf.presentation.models.Product
import com.example.goodsontheshelf.presentation.theme.Typography
import com.example.goodsontheshelf.presentation.utils.BASE_IMAGE_URL
import com.example.goodsontheshelf.presentation.viewmodels.GoodsUiState
import com.example.goodsontheshelf.presentation.viewmodels.GoodsViewModel

@Composable
fun GoodsMainScreen(
    onProductClicked: (Product) -> Unit,
    viewModel: GoodsViewModel = hiltViewModel()
) {
    when (val uiState = viewModel.goodsUiState) {
        is GoodsUiState.Loading -> LoadingScreen()
        is GoodsUiState.Error -> ErrorScreen(retryAction = { viewModel.getGoods() })
        is GoodsUiState.Success -> GoodsScreen(
            goods = uiState.goodsSearch,
            sum = uiState.sum,
            onProductClicked = onProductClicked
        )
    }
}

@Composable
fun GoodsScreen(
    goods: List<Product>,
    sum: String,
    onProductClicked: (Product) -> Unit,
) {
    LazyColumn(
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.size_16)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.size_15))
    ) {
        itemsIndexed(goods) { index, product ->
            if (index == 0) {
                SumHeader(sum = sum)
            }
            GoodsCard(product = product,
                onProductClicked = { onProductClicked(product) })
        }
    }
}


@Composable
fun GoodsCard(
    product: Product,
    onProductClicked: (Product) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.size_4))
            .fillMaxWidth()
            .clickable { onProductClicked(product) },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        )

    ) {
        Row(
            modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.size_20))
        ) {

            AsyncImage(
                modifier = Modifier
                    .width(dimensionResource(id = R.dimen.size_100))
                    .height(dimensionResource(id = R.dimen.size_100))
                    .padding(dimensionResource(id = R.dimen.size_20)),
                model = ImageRequest.Builder(context = LocalContext.current)
                    .data("$BASE_IMAGE_URL${product.imageId}")
                    .crossfade(true)
                    .build(),
                error = painterResource(id = R.drawable.ic_broken_image),
                placeholder = painterResource(id = R.drawable.loading_img),
                contentDescription = stringResource(id = R.string.content_description),
                contentScale = ContentScale.Inside
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                product.title?.let {
                    Text(
                        text = it,
                        style = Typography.labelMedium
                    )
                }

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = dimensionResource(id = R.dimen.size_8)),
                    text =
                    stringResource(id = R.string.rouble_piece, product.price.toString()),
                    style = Typography.labelLarge
                )
            }
        }

        product.brandName?.let {
            Text(
                text = it,
                Modifier
                    .background(Color(0xFFF8F8F8))
                    .padding(
                        start = dimensionResource(id = R.dimen.size_10),
                        top = dimensionResource(id = R.dimen.size_5),
                        dimensionResource(id = R.dimen.size_10),
                        bottom = dimensionResource(id = R.dimen.size_5)
                    )
                    .fillMaxWidth(),
                style = Typography.labelSmall
            )
        }

    }
}


@Composable
fun SumHeader(sum: String) {
    Row(
        modifier = Modifier
            .background(Color(0xFFF8F8F8))
            .fillMaxWidth()
            .padding(
                start = dimensionResource(id = R.dimen.size_15),
                top = dimensionResource(id = R.dimen.size_16),
                bottom = dimensionResource(id = R.dimen.size_13),
                end = dimensionResource(id = R.dimen.size_15)
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = stringResource(id = R.string.sum_string),
            style = Typography.headlineMedium
        )
        Text(
            text = stringResource(id = R.string.rouble, sum),
            style = Typography.headlineMedium
        )
    }
}