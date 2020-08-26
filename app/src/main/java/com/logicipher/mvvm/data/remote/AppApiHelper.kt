package com.logicipher.mvvm.data.remote

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
class AppApiHelper @Inject constructor(apiHeader: ApiHeader) : ApiHelper {
    private val mApiHeader: ApiHeader

    init {
        mApiHeader = apiHeader
    }
}
