package com.geekyelement.whatsapp20;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {
    int tabCount;

    public pageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount =behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fTab1() ;
            case 1:
                return new fTab2();
            case 2:
                return new fTab3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
