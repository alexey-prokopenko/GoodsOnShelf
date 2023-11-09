package com.example.goodsontheshelf.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.goodsontheshelf.presentation.GoodsApp
import com.example.goodsontheshelf.presentation.theme.GoodsOnTheShelfTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodsOnTheShelfTheme {
                GoodsApp()
            }
        }
    }
}
