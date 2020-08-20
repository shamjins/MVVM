package com.logicipher.mvvm.data.remote

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
public class AppApiHelper : ApiHelper {
    private var mApiHeader: ApiHeader? = null

    @Inject
    public fun AppApiHelper(apiHeader: ApiHeader?) {
        mApiHeader = apiHeader
    }


}