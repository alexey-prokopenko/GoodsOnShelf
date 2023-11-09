package com.example.goodsontheshelf.presentation.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.goodsontheshelf.R
import com.example.goodsontheshelf.presentation.utils.BASE_IMAGE_URL

@Composable
fun InfoScreen(
    image: String?,
    brandName: String?
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        AsyncImage(
            modifier = Modifier
                .width(dimensionResource(id = R.dimen.size_400))
                .height(dimensionResource(id = R.dimen.size_400))
                .padding(dimensionResource(id = R.dimen.size_20)),
            model = ImageRequest.Builder(context = LocalContext.current)
                .data("$BASE_IMAGE_URL$image")
                .crossfade(true)
                .build(),
            error = painterResource(id = R.drawable.ic_broken_image),
            placeholder = painterResource(id = R.drawable.loading_img),
            contentDescription = stringResource(id = R.string.content_description),
            contentScale = ContentScale.Inside
        )

        Text(text = brandName.toString())
    }
}