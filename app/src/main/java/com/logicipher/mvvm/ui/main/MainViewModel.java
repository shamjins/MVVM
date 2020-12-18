package com.logicipher.mvvm.ui.main;

import com.logicipher.mvvm.data.DataManager;
import com.logicipher.mvvm.ui.base.BaseViewModel;
import com.logicipher.mvvm.utils.rx.SchedulerProvider;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Shamji N S on 22-09-2020.
 */
public class MainViewModel extends BaseViewModel<MainNavigator> {
    private static final String TAG = "MainViewModel";

    public MainViewModel(@NotNull DataManager dataManager, @NotNull SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
