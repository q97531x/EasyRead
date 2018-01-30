package com.weeboos.easyread.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.weeboos.easyread.EasyReadService;

/**
 * Created by bo.wei on 2018/1/29.
 */

public class HomeViewModel {

    private Context context;

    public HomeViewModel(Context context) {
        this.context = context;
    }

    public void startService(View view){
        //开始服务
        Intent intent = new Intent(context, EasyReadService.class);
        context.startService(intent);
    }

    public void stopService(View view){
        //停止服务
        Intent intent = new Intent(context, EasyReadService.class);
        context.stopService(intent);
    }
}
