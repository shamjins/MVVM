package com.logicipher.mvvm.data

import android.content.Context
import com.google.gson.Gson
import com.logicipher.mvvm.data.local.database.DbHelper
import com.logicipher.mvvm.data.local.preference.PreferenceHelper
import com.logicipher.mvvm.data.remote.ApiHelper
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
public class AppDataManager @Inject constructor(
    context: Context,
    dbHelper: DbHelper,
    preferencesHelper: PreferenceHelper,
    apiHelper: ApiHelper,
    gson: Gson
) :
    DataManager {
    private val mApiHelper: ApiHelper
    private val mContext: Context
    private val mDbHelper: DbHelper
    private val mGson: Gson
    private val mPreferencesHelper: PreferenceHelper
    fun setUserAsLoggedOut() {}
    fun updateApiHeader(userId: Long?, accessToken: String?) {}

    companion object {
        private const val TAG = "AppDataManager"
    }

    init {
        mContext = context
        mDbHelper = dbHelper
        mPreferencesHelper = preferencesHelper
        mApiHelper = apiHelper
        mGson = gson
    }
}
