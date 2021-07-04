package com.android.voice;

import android.os.Bundle;
import android.view.View;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.voice.model.CHANNEL;

public class HomeActivity extends FragmentActivity implements View.OnClickListener{

    /**
     * 指定首页出现的卡片
     */
    private static final CHANNEL[] CHANNELS =
            new CHANNEL[]{CHANNEL.MY, CHANNEL.DISCORY, CHANNEL.FRIEND};

    private DrawerLayout mDrawerLayout;
    private View mToggleView;
    private View mSearchView;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intiView();
        initData();
    }

    private void intiView() {
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mToggleView = findViewById(R.id.toggle_view);
        mToggleView.setOnClickListener(this);
        mSearchView = findViewById(R.id.search_view);

        mViewPager = findViewById(R.id.view_pager);
        initMagicIndicator();
    }

    private void initMagicIndicator() {

    }

    private void initData() {
    }


    @Override
    public void onClick(View v) {

    }
}