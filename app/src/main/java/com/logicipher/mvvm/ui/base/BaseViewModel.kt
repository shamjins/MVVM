package com.logicipher.mvvm.ui.base

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import com.logicipher.mvvm.data.DataManager
import com.logicipher.mvvm.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

/**
 * Created by Shamji N S on 20-08-2020.
 */
abstract class BaseViewModel<N>(
    dataManager: DataManager,
    schedulerProvider: SchedulerProvider
) : ViewModel() {
    private val mDataManager: DataManager
    private val mIsLoading = ObservableBoolean()
    private val mSchedulerProvider: SchedulerProvider
    private val mCompositeDisposable: CompositeDisposable
    private var mNavigator: WeakReference<N>? = null
    override fun onCleared() {
        mCompositeDisposable.dispose()
        super.onCleared()
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return mCompositeDisposable
    }

    fun getDataManager(): DataManager {
        return mDataManager
    }

    fun getIsLoading(): ObservableBoolean {
        return mIsLoading
    }

    fun setIsLoading(isLoading: Boolean) {
        mIsLoading.set(isLoading)
    }

    fun getNavigator(): N? {
        return mNavigator!!.get()
    }

    fun setNavigator(navigator: N) {
        mNavigator = WeakReference(navigator)
    }

    fun getSchedulerProvider(): SchedulerProvider {
        return mSchedulerProvider
    }

    init {
        mDataManager = dataManager
        mSchedulerProvider = schedulerProvider
        mCompositeDisposable = CompositeDisposable()
    }
}
