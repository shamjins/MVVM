package com.logicipher.mvvm.di.builder

import com.logicipher.mvvm.ui.main.MainActivity
import com.logicipher.mvvm.ui.test_frag.TestFragmentProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(
        modules = [
            TestFragmentProvider::class
        ]
    )
    internal abstract fun bindMainActivity(): MainActivity


}
