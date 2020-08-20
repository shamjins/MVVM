package com.logicipher.mvvm.data.local.database

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
public class AppDbHelper : DbHelper {

    private val appDatabase : AppDatabase

    @Inject
    constructor(appDatabase: AppDatabase) {
        this.appDatabase = appDatabase
    }
}