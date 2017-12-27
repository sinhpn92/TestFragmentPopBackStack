package com.sinhpn.testfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Sinhpn on 12/27/2017.
 * Email: pnsinh.hg92@gmail.com
 */

public class TabFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAB", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("TAB", "onCreateView");
        return inflater.inflate(R.layout.fragment_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            int tabIndex = args.getInt("tab_index", 0);
            TextView tv = view.findViewById(R.id.textView);
            tv.setText(String.format(Locale.getDefault(), "TAB FRAGMENT INDEX %d", tabIndex));
        }

        Button button = view.findViewById(R.id.button);
        button.setText("Open Next Fragment");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, LastFragment.newInstance());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("TAB", "onDestroy");
    }

    public static Fragment newInstance(int index) {
        Bundle args = new Bundle();
        args.putInt("tab_index", index);
        TabFragment tab = new TabFragment();
        tab.setArguments(args);
        return tab;
    }
}
