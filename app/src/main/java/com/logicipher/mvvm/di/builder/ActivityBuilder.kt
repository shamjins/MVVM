package com.logicipher.mvvm.di.builder

import com.logicipher.mvvm.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity?


}
