package com.prinum.kmmsdksample.sdk

import kotlinx.serialization.Serializable

sealed interface SdkNavigation {

    @Serializable
    object Home : SdkNavigation
    @Serializable
    data class Details(val id: String) : SdkNavigation
}