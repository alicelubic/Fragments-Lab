package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by owlslubic on 7/19/16.
 */
public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text,container,false);
        TextView textView1 = (TextView) rootView.findViewById(R.id.textview1);
        TextView textView2 = (TextView) rootView.findViewById(R.id.textview2);
        TextView textView3 = (TextView) rootView.findViewById(R.id.textview3);

        textView1.setText("Phone: 1-800-SET-TEXT");
        textView2.setText("Email: lubicalice@gmail.com");
        textView3.setText("Instagram: m3yle ");
        return rootView;
    }

}
