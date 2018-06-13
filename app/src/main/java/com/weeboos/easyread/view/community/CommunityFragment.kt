package com.weeboos.easyread.view.community

import android.os.Bundle
import com.weeboos.easyread.R
import com.weeboos.easyread.base.BaseFragment
import com.weeboos.easyread.databinding.FragmentBookcaseBinding
import com.weeboos.easyread.view.BookCaseFragment

/**
 * Created by bo.wei on 2018/6/13.
 */
class CommunityFragment : BaseFragment<FragmentBookcaseBinding>() {

    val TAG = "社区"

    companion object {
        fun newInstance() = CommunityFragment()

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