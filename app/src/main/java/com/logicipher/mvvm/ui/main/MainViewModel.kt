package com.logicipher.mvvm.ui.main

import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.ui.base.BaseViewModel
import com.logicipher.mvvm.utils.rx.SchedulerProvider

/**
 * Created by Shamji N S on 21-08-2020.
 */
public  class MainViewModel<T>(dataManager: DataManager?, schedulerProvider: SchedulerProvider?) :
    BaseViewModel<T>(dataManager!!, schedulerProvider!!) {

}
