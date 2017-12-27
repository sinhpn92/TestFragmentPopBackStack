package com.sinhpn.testfragment;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;

/**
 * Created by Sinhpn on 12/27/2017.
 * Email: pnsinh.hg92@gmail.com
 */

public class VPAdapter extends FragmentPagerAdapter {


    public VPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "TAB " + position;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
        super.restoreState(state, loader);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return TabFragment.newInstance(position);
    }

    @Override
    public Parcelable saveState() {
        return super.saveState();
    }
}
