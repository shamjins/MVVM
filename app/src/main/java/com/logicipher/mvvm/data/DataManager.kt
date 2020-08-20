package com.logicipher.mvvm.data

import com.logicipher.mvvm.data.local.database.DbHelper
import com.logicipher.mvvm.data.local.preference.PreferenceHelper
import com.logicipher.mvvm.data.remote.ApiHelper

/**
 * Created by Shamji N S on 20-08-2020.
 */
public interface DataManager : DbHelper, PreferenceHelper, ApiHelper {
}