package com.android.voice;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class HomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intiView();
        initData();
    }

    private void initData() {
    }

    private void intiView() {
    }
}