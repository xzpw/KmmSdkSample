package com.prinum.kmmsdksample.sdk

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SdkApp() {
    val controller = rememberNavController()
    MaterialTheme {
        CompositionLocalProvider(
            LocalNavigatorProvider provides controller,
        ) {
            Scaffold(contentWindowInsets = WindowInsets.fullscreen) { SdkNavHost(controller) }
        }
    }
}

@Composable
fun HomeScreen(controller: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello from SDK", style = MaterialTheme.typography.titleLarge)
        Button(onClick = {
            controller.navigate(SdkNavigation.Details("Home Screen"))
        }) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Navigate to details", style = MaterialTheme.typography.labelMedium)
            }
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, "Done")
        }
    }
}

@Composable
fun DetailsScreen(id: String) {
    var state by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello form : $id", color = Color.Black, style = MaterialTheme.typography.titleLarge)
        Text(text = "Is Action done: $state", color = Color.Black, style = MaterialTheme.typography.titleLarge)
        Button(
            onClick = {
                scope.launch {
                    delay(1000)
                    state = true
                }
            }
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Do action", style = MaterialTheme.typography.labelMedium)
            }
            Icon(imageVector = Icons.Default.Done, "Done")
        }
    }
}
