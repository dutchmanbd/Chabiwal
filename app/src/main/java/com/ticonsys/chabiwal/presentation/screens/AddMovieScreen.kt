package com.ticonsys.chabiwal.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ticonsys.chabiwal.presentation.components.TopBar

@Composable
fun AddMovieScreen(
    openDrawer: () -> Unit,
    onSearchClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(
            title = "Add Movie",
            isShownSearch = true,
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() },
            onSearchClicked = {
                onSearchClicked()
            }
        )
        Column {

        }
    }
}