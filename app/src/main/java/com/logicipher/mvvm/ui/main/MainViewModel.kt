package com.logicipher.mvvm.ui.main

import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.ui.base.BaseViewModel
import com.logicipher.mvvm.utils.rx.SchedulerProvider


/**
 * Created by Shamji N S on 5/19/2021.
 */
class MainViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<MainNavigator>(dataManager, schedulerProvider) {
    private  val TAG = "MainViewModel"

}