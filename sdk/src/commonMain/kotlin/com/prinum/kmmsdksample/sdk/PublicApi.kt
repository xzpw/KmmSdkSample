package com.prinum.kmmsdksample.sdk

expect class PublicApi {

    fun launchSdkScreen()
    suspend fun getSdkDataSuspend(version: String): SdkData
    fun getSdkDataSync(version: String): SdkData
}
