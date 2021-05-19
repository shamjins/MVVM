package com.logicipher.mvvm.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.logicipher.mvvm.BR
import com.logicipher.mvvm.R
import com.logicipher.mvvm.ViewModelProviderFactory
import com.logicipher.mvvm.databinding.ActivityMainBinding
import com.logicipher.mvvm.ui.base.BaseActivity
import com.logicipher.mvvm.ui.test_frag.TestFragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by Shamji N S on 5/19/2021.
 */
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), MainNavigator,
HasSupportFragmentInjector{
    private val TAG = "MainActivity"

    @Inject
    lateinit var factory: ViewModelProviderFactory

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private var mBinding: ActivityMainBinding? = null
    private var mViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = getViewDataBinding()
        mBinding?.viewModel = mViewModel
        mViewModel?.setNavigator(this)

        addListeners()
    }

    private fun addListeners() {
        mBinding?.btnLoadFragment?.setOnClickListener(View.OnClickListener {
            loadTestFragment()
        })
    }

    private fun loadTestFragment() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(TestFragment.TAG)
            .add(R.id.container, TestFragment.getInstance())
            .commit()
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModel(): MainViewModel {
        mViewModel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)
        return mViewModel as MainViewModel
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }
}