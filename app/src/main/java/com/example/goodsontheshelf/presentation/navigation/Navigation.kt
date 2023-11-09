package com.example.goodsontheshelf.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.goodsontheshelf.presentation.models.navigation.Screens
import com.example.goodsontheshelf.presentation.screens.goods.GoodsMainScreen
import com.example.goodsontheshelf.presentation.screens.detail.InfoScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Screens.GoodsMainScreen.id
    ) {
        composable(Screens.GoodsMainScreen.id) {
            GoodsMainScreen(onProductClicked = { product -> navController.navigate("${Screens.InfoScreen.id}/${product.brandName}/${product.imageId}") })
        }

        composable(
            route = "${Screens.InfoScreen.id}/{brandName}/{image}",
            arguments = listOf(navArgument("brandName") { type = NavType.StringType },
                navArgument("image") { type = NavType.StringType })
        ) {
            val brandName = it.arguments?.getString("brandName")
            val image = it.arguments?.getString("image")
            InfoScreen(brandName = brandName, image = image)
        }
    }
}