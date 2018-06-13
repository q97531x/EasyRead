package com.weeboos.easyread.base

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.weeboos.easyread.R
import com.weeboos.easyread.presenter.Presenter
import org.jetbrains.anko.find

/**
 * Created by bo.wei on 2018/6/12.
 * activity基类
 */
abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity(), Presenter {
    protected lateinit var mBinding: VB
    protected lateinit var mContext: Context
    protected lateinit var commonToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparent19and20()
        mContext = this
        mBinding = DataBindingUtil.setContentView(this,getLayoutId())
        commonToolbar = mBinding.root.find<Toolbar>(R.id.common_toolbar)
        loadData()
        initViews()
        initToolBar()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    protected fun transparent19and20() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
                && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            //透明状态栏
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }
    }

    /**
     * 初始化数据
     */
    abstract fun loadData()

    /**
     * 获得Activity的layoutId
     */
    abstract fun getLayoutId() : Int

    abstract fun initToolBar()

    abstract fun initViews()

    override fun onClick(p0: View?) {
    }

    fun toast(msg: String) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
}