package com.app.simplenotes.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class InfoFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public InfoFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentList.size();
    }
}

//Signature :
//10120146 - Irshal Mulky H - IF4