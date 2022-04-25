package com.ticonsys.chabiwal.presentation.activities.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ticonsys.chabiwal.presentation.theme.ChabiwalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<MainViewModel>()
            ChabiwalTheme {
                MainScreen()
            }
        }
    }
}
