package com.logicipher.mvvm.ui.test_frag

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.logicipher.mvvm.BR
import com.logicipher.mvvm.R
import com.logicipher.mvvm.ViewModelProviderFactory
import com.logicipher.mvvm.databinding.FragmentTestBinding
import com.logicipher.mvvm.ui.base.BaseFragment
import javax.inject.Inject

/**
 * Created by Shamji N S on 5/19/2021.
 */
class TestFragment : BaseFragment<FragmentTestBinding, TestFragmentViewModel>(),
    TestFragmentNavigator {


    companion object {
        val TAG = "TestFragment"
        fun getInstance(): TestFragment {
            return TestFragment()
        }
    }

    @Inject
    lateinit var factory: ViewModelProviderFactory

    private var mBinding: FragmentTestBinding? = null
    private var mViewModel: TestFragmentViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = viewDataBinding
        mBinding?.viewModel = mViewModel
        mViewModel?.setNavigator(this)
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_test
    }

    override fun getViewModel(): TestFragmentViewModel {
        mViewModel = ViewModelProviders.of(this, factory).get(TestFragmentViewModel::class.java)
        return mViewModel as TestFragmentViewModel
    }
}