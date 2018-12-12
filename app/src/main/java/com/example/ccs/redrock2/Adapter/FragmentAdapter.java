package com.example.ccs.redrock2.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.ccs.redrock2.Fragment.ImageFragment;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter {
    private List<ImageFragment> fragments;
    private List<String> titles;

    public FragmentAdapter(FragmentManager fmer, List<ImageFragment> fragments, List<String> titles) {
        super(fmer);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }
}