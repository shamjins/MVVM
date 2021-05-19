package com.logicipher.mvvm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.logicipher.mvvm.data.DataManager;
import com.logicipher.mvvm.ui.main.MainViewModel;
import com.logicipher.mvvm.ui.test_frag.TestFragmentViewModel;
import com.logicipher.mvvm.utils.rx.SchedulerProvider;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {

    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;

    @Inject
    public ViewModelProviderFactory(DataManager dataManager,
                                    SchedulerProvider schedulerProvider) {
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {

        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(dataManager, schedulerProvider);
        } else if (modelClass.isAssignableFrom(TestFragmentViewModel.class)) {
            return (T) new TestFragmentViewModel(dataManager, schedulerProvider);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}