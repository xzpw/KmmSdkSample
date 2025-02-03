package com.prinum.kmmsdksample.sdk

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavigatorProvider = staticCompositionLocalOf<NavHostController> {
    throw RuntimeException("Nav controller is not provided")
}