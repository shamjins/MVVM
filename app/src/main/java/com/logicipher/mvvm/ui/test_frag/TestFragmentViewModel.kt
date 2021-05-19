package com.logicipher.mvvm.ui.test_frag

import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.ui.base.BaseViewModel
import com.logicipher.mvvm.utils.rx.SchedulerProvider

/**
 * Created by Shamji N S on 5/19/2021.
 */
class TestFragmentViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<TestFragmentNavigator>(dataManager, schedulerProvider) {
}