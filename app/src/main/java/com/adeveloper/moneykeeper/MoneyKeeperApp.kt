package com.adeveloper.moneykeeper

import android.app.Application
import com.adeveloper.moneykeeper.manager.DebugLoggingManager
import com.adeveloper.moneykeeper.manager.ReleaseLoggingManager
import com.google.firebase.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class MoneyKeeperApp : Application() {

    @Inject lateinit var releaseLoggingManager: ReleaseLoggingManager
    @Inject lateinit var debugLoggingManager: DebugLoggingManager

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(debugLoggingManager)
        } else {
            Timber.plant(releaseLoggingManager)
        }
    }
}