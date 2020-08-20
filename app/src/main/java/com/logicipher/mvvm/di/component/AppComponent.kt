package com.logicipher.mvvm.di.component

import android.app.Application
import com.logicipher.mvvm.MvvmApp
import com.logicipher.mvvm.di.builder.ActivityBuilder
import com.logicipher.mvvm.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
open interface AppComponent {
    fun inject(app: MvvmApp?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application?): Builder?
        fun build(): AppComponent?
    }
}
