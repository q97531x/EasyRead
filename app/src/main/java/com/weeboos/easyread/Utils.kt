package com.weeboos.easyread

import android.content.Context

/**
 * Created by bo.wei on 2018/6/13.
 * 工具类
 */
class Utils {

    companion object {

        /**
         * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
         */
        fun dpToPx(context: Context, value: Int): Int {
            val scale: Float  = context.resources.displayMetrics.density
            return (value * scale + 0.5f).toInt()
        }

        /**
         * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
         */
        fun px2dip(context: Context, value: Float): Int {
            val scale = context.resources.displayMetrics.density
            return (value / scale + 0.5f).toInt()
        }

    }

}