package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PageAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm, int behavior) {
        super(fm);
        tabcount behaviour;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ftab1();
            case 1:
                return new ftab2();
            case 2:
                return new ftab3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
