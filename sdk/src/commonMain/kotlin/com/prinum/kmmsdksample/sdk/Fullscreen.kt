package com.prinum.kmmsdksample.sdk

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.unit.dp

val WindowInsets.Companion.fullscreen: WindowInsets
    @Composable
    @NonRestartableComposable
    get() = WindowInsets(0.dp)