package com.logicipher.mvvm

import android.app.Activity
import android.app.Application
import com.logicipher.mvvm.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Shamji N S on 20-08-2020.
 */

public class MvvmApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity?>


    override fun activityInjector(): DispatchingAndroidInjector<Activity?>? {
        return activityDispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .application(this)
            ?.build()
            ?.inject(this)

    }

}