package com.adeveloper.moneykeeper.manager

import com.google.firebase.analytics.FirebaseAnalytics
import timber.log.Timber
import javax.inject.Inject

class ReleaseLoggingManager @Inject constructor(private val analytics: FirebaseAnalytics): Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        //TODO: add logging functionality
    }

}