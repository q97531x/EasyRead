package com.weeboos.easyread.base

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager

/**
 * Created by bo.wei on 2018/6/12.
 * activity基类
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparent19and20()
        initDatas()
        setContentView(getLayoutId())
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
    abstract fun initDatas()

    /**
     * 获得Activity的layoutId
     */
    abstract fun getLayoutId() : Int

    abstract fun initToolBar()

    abstract fun initViews()
}