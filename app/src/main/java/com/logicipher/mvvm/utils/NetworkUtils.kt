package com.logicipher.mvvm.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Shamji N S on 20-08-2020.
 */
object NetworkUtils {
    fun isNetworkConnected(context: Context): Boolean {
        val cm =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (cm != null) {
            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting
        }
        return false
    }
}
