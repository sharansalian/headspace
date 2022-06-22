package io.sharan.headspace.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.sharan.headspace.ui.screens.FocusScreen
import io.sharan.headspace.ui.screens.MeditateScreen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "meditate") {
        composable("meditate") {
            MeditateScreen()
        }

        composable("focus") {
            FocusScreen()
        }
    }

}