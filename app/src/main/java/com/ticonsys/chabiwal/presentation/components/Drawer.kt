package com.ticonsys.chabiwal.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ticonsys.chabiwal.R


sealed class NavScreen(val route: String, val title: String) {
    object Home : NavScreen("home", "Home")
    object AddMovie : NavScreen("add_movie", "Add Movie")
}

private val screens = listOf(
    NavScreen.Home,
    NavScreen.AddMovie
)


@Composable
fun Drawer(
    modifier: Modifier = Modifier,
    onDestinationClick: (route: String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 48.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "App Icon"
        )

        screens.forEach { screen ->
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = screen.title,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.clickable {
                    onDestinationClick(screen.route)
                }
            )
        }
    }
}