package com.sinhpn.testfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sinhpn on 12/27/2017.
 * Email: pnsinh.hg92@gmail.com
 */

public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        TabLayout tabLayout = v.findViewById(R.id.tabLayout);

        ViewPager viewPager = v.findViewById(R.id.viewPager);
        VPAdapter adapter = new VPAdapter(getFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }

    public static Fragment newInstance() {
        return new HomeFragment();
    }
}
