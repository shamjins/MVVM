package com.logicipher.mvvm.ui.main
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.logicipher.mvvm.BR
import com.logicipher.mvvm.R
import com.logicipher.mvvm.ViewModelProviderFactory
import com.logicipher.mvvm.databinding.ActivityMainBinding
import com.logicipher.mvvm.ui.base.BaseActivity
import javax.inject.Inject

/**
 * Created by Shamji N S on 21-08-2020.
 */
class MainActivity : BaseActivity<ActivityMainBinding?, MainViewModel<MainNavigator>?>(),
    MainNavigator /*, HasSupportFragmentInjector*/ {
    /*   @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;*/

    @set:Inject
    internal var factory: ViewModelProviderFactory? = null
    var mViewModel: MainViewModel<MainNavigator>? = null
    var mBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        mBinding = getViewDataBinding()
        mViewModel?.setNavigator(this)
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModel(): MainViewModel<MainNavigator>? {
        val viewModel: MainViewModel<MainNavigator>? = null
        mViewModel =
            ViewModelProviders.of(this, factory)
                .get(MainViewModel<MainNavigator>!!::class.java)
        return mViewModel
    }
    /*
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
*/

    companion object {
        private const val TAG = "MainActivity"
    }
}
