package com.weeboos.easyread

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.weeboos.easyread.base.BaseActivity
import com.weeboos.easyread.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initDatas() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initToolBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initViews() {
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
