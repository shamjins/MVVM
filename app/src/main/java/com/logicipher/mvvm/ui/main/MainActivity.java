package com.logicipher.mvvm.ui.main;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.logicipher.mvvm.BR;
import com.logicipher.mvvm.R;
import com.logicipher.mvvm.ViewModelProviderFactory;
import com.logicipher.mvvm.databinding.ActivityMainBinding;
import com.logicipher.mvvm.ui.base.BaseActivity;

import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;

/**
 * Created by Shamji N S on 22-09-2020.
 */
public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> implements MainNavigator {
    private static final String TAG = "MainActivity";

    @Inject
    ViewModelProviderFactory factory;

    private ActivityMainBinding mBinding;
    private MainViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = getViewDataBinding();
        mBinding.setViewModel(mViewModel);
        mViewModel.setNavigator(this);
        addListeners();
    }

    private void addListeners() {
//        mBinding.btnStartActivity.setOnClickListener();
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        mViewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
        return mViewModel;
    }
}
