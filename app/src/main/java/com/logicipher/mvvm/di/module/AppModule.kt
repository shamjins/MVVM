package com.logicipher.mvvm.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.logicipher.mvvm.data.AppDataManager
import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.data.local.database.AppDatabase
import com.logicipher.mvvm.data.local.database.AppDbHelper
import com.logicipher.mvvm.data.local.database.DbHelper
import com.logicipher.mvvm.data.local.preference.AppPreferencesHelper
import com.logicipher.mvvm.data.local.preference.PreferenceHelper
import com.logicipher.mvvm.data.remote.ApiHeader
import com.logicipher.mvvm.data.remote.ApiHelper
import com.logicipher.mvvm.data.remote.AppApiHelper
import com.logicipher.mvvm.di.ApiInfo
import com.logicipher.mvvm.di.DatabaseInfo
import com.logicipher.mvvm.di.PreferenceInfo
import com.logicipher.mvvm.utils.AppConstants
import com.logicipher.mvvm.utils.rx.AppSchedulerProvider
import com.logicipher.mvvm.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */

@Module
public class AppModule {
    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }

    @Provides
    @ApiInfo
    fun provideApiKey(): String {
        return "BuildConfig.API_KEY"
    }

    @Provides
    @Singleton
    fun provideAppDatabase(
        @DatabaseInfo dbName: String?,
        context: Context?
    ): AppDatabase {
        return Room.databaseBuilder<AppDatabase>(context!!, AppDatabase::class.java, dbName!!)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return AppConstants.DB_NAME
    }

    @Provides
    @Singleton
    fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }

    @Provides
    @PreferenceInfo
    fun providePreferenceName(): String {
        return AppConstants.PREF_NAME
    }

    @Provides
    @Singleton
    fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferenceHelper {
        return appPreferencesHelper
    }

    private val id: Long = 10

    @Provides
    @Singleton
    fun provideProtectedApiHeader(
        @ApiInfo apiKey: String?,
        preferencesHelper: PreferenceHelper?
    ): ApiHeader.ProtectedApiHeader {
        return ApiHeader.ProtectedApiHeader(
            "apiKey",
            id,
            "preferencesHelper.getAccessToken()"
        )
    }

    @Provides
    fun provideSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }
}
