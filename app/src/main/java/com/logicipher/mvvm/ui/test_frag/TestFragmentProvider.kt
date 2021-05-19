package com.logicipher.mvvm.ui.test_frag

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Shamji N S on 5/19/2021.
 */
@Module
abstract class TestFragmentProvider  {

    @ContributesAndroidInjector
    abstract fun testFragmentProvider() : TestFragment
}