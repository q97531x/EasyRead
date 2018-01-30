package com.weeboos.easyread.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.weeboos.easyread.R;
import com.weeboos.easyread.databinding.ActivityMainBinding;
import com.weeboos.easyread.viewmodel.HomeViewModel;

/**
 * Created by bo.wei on 2018/1/29.
 */

public class HomeActivity extends Activity{

    private ActivityMainBinding binding;
    private HomeViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new HomeViewModel(this);
        binding.setVm(viewModel);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
