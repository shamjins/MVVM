package com.logicipher.mvvm.data.local.preference
import android.content.Context
import android.content.SharedPreferences
import com.logicipher.mvvm.di.PreferenceInfo
import javax.inject.Inject

/**
 * Created by Shamji N S on 20-08-2020.
 */
class AppPreferencesHelper @Inject constructor(
    context: Context,
    @PreferenceInfo prefFileName: String?
) :
    PreferenceHelper {
    private val mPrefs: SharedPreferences

    companion object {
        private const val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
    }

    init {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)
    }
}

