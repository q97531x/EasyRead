package com.weeboos.easyread.view.discover

import android.os.Bundle
import com.weeboos.easyread.R
import com.weeboos.easyread.base.BaseFragment
import com.weeboos.easyread.databinding.FragmentBookcaseBinding
import com.weeboos.easyread.view.BookCaseFragment

/**
 * Created by bo.wei on 2018/6/13.
 */
class DiscoverFragment : BaseFragment<FragmentBookcaseBinding>() {
    val TAG = "发现"

    companion object {
        fun newInstance() = DiscoverFragment()


    }

    override fun initArgs(savedInstanceState: Bundle?) {

    }

    override fun initView() {

    }

    override fun loadData() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_bookcase
    }
}