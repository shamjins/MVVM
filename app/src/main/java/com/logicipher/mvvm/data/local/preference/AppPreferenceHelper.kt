package com.logicipher.mvvm.data.local.preference

import android.content.Context
import com.logicipher.mvvm.data.local.preference.PreferenceHelper
import android.content.SharedPreferences
import com.logicipher.mvvm.di.PreferenceInfo
import javax.inject.Inject

/**
 * Created by Shamji N S on 20-08-2020.
 */
class AppPreferencesHelper : PreferenceHelper{

    private val PREF_KEY_ACCESS_TOKEN : String = "PREF_KEY_ACCESS_TOKEN"

    @Inject
    lateinit var mSharedPreferences: SharedPreferences

    @Inject
    public fun AppPreferencesHelper(context: Context, prefFileName : String) {
        mSharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)
    }

}
