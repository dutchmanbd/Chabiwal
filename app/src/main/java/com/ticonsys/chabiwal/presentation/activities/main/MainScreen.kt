package com.ticonsys.chabiwal.presentation.activities.main

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ticonsys.chabiwal.presentation.components.Drawer
import com.ticonsys.chabiwal.presentation.components.NavScreen
import com.ticonsys.chabiwal.presentation.screens.AddMovieScreen
import com.ticonsys.chabiwal.presentation.screens.HomeScreen
import com.ticonsys.chabiwal.presentation.screens.SearchScreen
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Surface(
        color = MaterialTheme.colors.background
    ) {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        val openDrawer = {
            scope.launch {
                drawerState.open()
            }
        }

        ModalDrawer(
            drawerState = drawerState,
            gesturesEnabled = drawerState.isOpen,
            drawerContent = {
                Drawer(onDestinationClick = { route ->
                    scope.launch {
                        drawerState.close()
                    }
                    navController.navigate(route) {
                        launchSingleTop = true
                        popUpTo(navController.graph.startDestinationId)
                    }
                })
            }
        ) {
            NavHost(navController = navController, startDestination = NavScreen.Home.route) {
                composable(NavScreen.Home.route) {
                    HomeScreen {
                        openDrawer()
                    }
                }
                composable(NavScreen.AddMovie.route) {
                    AddMovieScreen(
                        openDrawer = {
                            openDrawer()
                        },
                        onSearchClicked = {
                            navController.navigate("search")
                        }
                    )
                }
                composable("search"){
                    SearchScreen()
                }
            }
        }
    }
}