package com.ticonsys.chabiwal.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ticonsys.chabiwal.presentation.components.TopBar

@Composable
fun HomeScreen(
    openDrawer: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(
            title = "Home",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() }
        )
        LazyColumn {
            repeat(10) {
                item {
                    MovieCard()
                }
            }
        }
    }
}

@Composable
fun MovieCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        elevation = 6.dp,
        shape = RoundedCornerShape(6.dp)
    ) {

    }
}

