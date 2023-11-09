package com.example.goodsontheshelf.presentation.models.navigation

sealed class Screens(open val id: String) {

    object GoodsMainScreen : Screens("goodsScreens")

    object InfoScreen : Screens("infoscreens")
}