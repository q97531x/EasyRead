package com.weeboos.easyread

import android.os.Build
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.weeboos.easyread.base.BaseActivity
import com.weeboos.easyread.base.BaseFragment
import com.weeboos.easyread.databinding.ActivityMainBinding
import com.weeboos.easyread.view.BookCaseFragment
import com.weeboos.easyread.view.community.CommunityFragment
import com.weeboos.easyread.view.discover.DiscoverFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var fragmentAdapter: TabsAdapter
    private lateinit var fragments: Array<Fragment>
    private lateinit var tabs: Array<String>

    override fun loadData() {
        val bookCaseFragment: BookCaseFragment = BookCaseFragment.newInstance()
        val communityFragment: CommunityFragment = CommunityFragment.newInstance()
        val discoverFragment: DiscoverFragment = DiscoverFragment.newInstance()
        fragments = arrayOf(bookCaseFragment,communityFragment,discoverFragment)
        tabs = arrayOf("书架","社区","发现")
        fragmentAdapter = TabsAdapter(supportFragmentManager,fragments,tabs)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initToolBar() {
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.LOLLIPOP) {
            commonToolbar.title = getString(R.string.app_name)
        }
    }

    override fun initViews() {
        mBinding.viewPager.adapter = fragmentAdapter

        mBinding.indicator.setFadingEdgeLength(Utils.dpToPx(mContext, 10))
        mBinding.indicator.setupWithViewPager(mBinding.viewPager)
        mBinding.indicator.setTabTextColors(R.color.light_gray,R.color.colorWhite)
    }

    inner class TabsAdapter(fm: FragmentManager, var fragments: Array<Fragment>, var tabs: Array<String>): FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return fragments.get(position)
        }

        override fun getCount(): Int {
            return fragments.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return tabs[position]
        }
    }
}
