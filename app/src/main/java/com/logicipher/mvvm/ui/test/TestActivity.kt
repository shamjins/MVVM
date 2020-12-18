package com.logicipher.mvvm.ui.test

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.logicipher.mvvm.BR
import com.logicipher.mvvm.R
import com.logicipher.mvvm.ViewModelProviderFactory
import com.logicipher.mvvm.databinding.ActivityTestBinding
import com.logicipher.mvvm.ui.base.BaseActivity
import com.logicipher.mvvm.ui.main.MainViewModel
import javax.inject.Inject

/**
 * Created by Shamji N S on 25-11-2020.
 */
public class TestActivity : BaseActivity<ActivityTestBinding, TestViewModel>(), TestNavigator {
    private val TAG = "TestActivity"

    @Inject
    lateinit var factory: ViewModelProviderFactory
    private var mViewModel: TestViewModel? = null
    private var mBinding: ActivityTestBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = getViewDataBinding();
        mBinding?.viewModel = mViewModel
        mViewModel?.setNavigator(this)

    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }

    override fun getViewModel(): TestViewModel {
        mViewModel = ViewModelProviders.of(this, factory).get(TestViewModel::class.java);
        var testViewModel: TestViewModel = mViewModel as TestViewModel
        return testViewModel;
    }
}