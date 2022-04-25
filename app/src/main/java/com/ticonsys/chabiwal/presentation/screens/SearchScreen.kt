package com.ticonsys.chabiwal.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SearchScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Text(text = "Search")
        }
    }
}