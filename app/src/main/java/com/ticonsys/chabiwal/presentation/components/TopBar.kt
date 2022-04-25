package com.ticonsys.chabiwal.presentation.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun TopBar(
    title: String = "",
    isShownSearch: Boolean = false,
    buttonIcon: ImageVector,
    onButtonClicked: () -> Unit = {},
    onSearchClicked: () -> Unit = {}
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                color = MaterialTheme.colors.onBackground
            )
        },
        navigationIcon = {
            IconButton(onClick = { onButtonClicked() }) {
                Icon(
                    buttonIcon,
                    contentDescription = "Menu",
                    tint = MaterialTheme.colors.onBackground
                )
            }
        },
        actions = {
            if (isShownSearch) {
                IconButton(onClick = {
                    onSearchClicked()
                }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = "Search",
                        tint = MaterialTheme.colors.onBackground
                    )
                }
            }
        },
        backgroundColor = MaterialTheme.colors.primaryVariant
    )
}