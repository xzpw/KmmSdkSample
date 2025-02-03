package com.prinum.kmmsdksample.sdk

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun SdkNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = SdkNavigation.Home,
    ) {
        composable<SdkNavigation.Home> { HomeScreen(navController) }
        composable<SdkNavigation.Details> { backStackEntry ->
            val data = backStackEntry.toRoute<SdkNavigation.Details>()
            DetailsScreen(data.id)
        }
    }
}