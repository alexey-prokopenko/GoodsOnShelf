package com.example.goodsontheshelf.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.goodsontheshelf.R
import com.example.goodsontheshelf.presentation.navigation.Navigation
import com.example.goodsontheshelf.presentation.theme.Typography


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoodsApp(
    modifier: Modifier = Modifier,
) {

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        style = Typography.headlineLarge
                    )
                }
            )
        },
        content = { paddingValues ->
            Surface(
                modifier = modifier
                    .fillMaxSize()
                    .padding(paddingValues),
            ) {
                Navigation()
            }
        }

    )
}