package com.prinum.kmmsdksample.sdk

import android.content.Context
import android.content.Intent
import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

actual class PublicApi(private val context: Context) {

    actual fun launchSdkScreen() {
        context.startActivity(Intent(context, SdkActivity::class.java))
    }

    actual suspend fun getSdkDataSuspend(version: String): SdkData {
        delay(1000)
        return SdkData("Sdk version: $version")
    }

    actual fun getSdkDataSync(version: String): SdkData = runBlocking {
        delay(1000)
        SdkData("Sdk version: $version")
    }
}
