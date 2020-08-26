package com.logicipher.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.ui.main.MainNavigator
import com.logicipher.mvvm.ui.main.MainViewModel
import com.logicipher.mvvm.utils.rx.SchedulerProvider
import java.lang.IllegalArgumentException
import javax.inject.Inject

/**
 * Created by Shamji N S on 25-08-2020.
 */
public class ViewModelProviderFactory @Inject constructor(
    dataManager: DataManager,
    schedulerProvider: SchedulerProvider
) : NewInstanceFactory() {
    private val dataManager: DataManager
    private val schedulerProvider: SchedulerProvider



    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return super.create(modelClass)

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel<T>(dataManager, schedulerProvider) as T
        }

        throw IllegalArgumentException("Unknown view model" + modelClass.name)
    }

    init {
        this.dataManager = dataManager
        this.schedulerProvider = schedulerProvider
    }
}