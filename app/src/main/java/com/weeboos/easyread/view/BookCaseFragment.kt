package com.weeboos.easyread.view

import android.os.Bundle
import com.weeboos.easyread.R
import com.weeboos.easyread.base.BaseFragment
import com.weeboos.easyread.databinding.FragmentBookcaseBinding

/**
 * Created by bo.wei on 2018/6/13.
 */
class BookCaseFragment : BaseFragment<FragmentBookcaseBinding>() {
    val TAG = "书架"

    companion object {
        fun newInstance() = BookCaseFragment()


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