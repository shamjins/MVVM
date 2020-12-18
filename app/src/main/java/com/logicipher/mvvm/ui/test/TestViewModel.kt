package com.logicipher.mvvm.ui.test

import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.ui.base.BaseViewModel
import com.logicipher.mvvm.utils.rx.SchedulerProvider

/**
 * Created by Shamji N S on 25-11-2020.
 */
public class TestViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<TestNavigator>(dataManager, schedulerProvider) {
}