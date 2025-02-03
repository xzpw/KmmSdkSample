package com.prinum.kmmsdksample.sdk

actual class PublicApi {

    actual fun launchSdkScreen() {
    }

    actual suspend fun getSdkDataSuspend(version: String): SdkData {
        TODO("Not yet implemented")
    }

    actual fun getSdkDataSync(version: String): SdkData {
        TODO("Not yet implemented")
    }
}
