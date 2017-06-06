package com.example.paramas_wae.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by paramas_wae on 6/6/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUM = 3;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //    getCount จะมีไว้กำหนดว่าจะให้แสดง Fragment ใน View Pager กี่ตัว
    public int getCount() {
        return PAGE_NUM; // แสดง fragment 3 ตัว
    }

    //    getItem มีไว้กำหนด Fragment ที่จะแสดงใน View Pager โดยมี Parameter เป็น Integer เพื่อระบุว่าเป็นของ Fragment ลำดับที่เท่าไรใน View Pager
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OneFragment();
        } else if (position == 1) {
            return new TwoFragment();
        } else if (position == 2) {
            return new ThreeFragment();
        }
        return null;
    }
}
