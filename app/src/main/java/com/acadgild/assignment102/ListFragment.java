package com.acadgild.assignment102;

import android.content.Context;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;


public class ListFragment extends Fragment {

    protected OnitemSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        Button button = (Button) getActivity().findViewById(R.id.button);
        Button button1 = (Button) getActivity().findViewById(R.id.button2);
        Button button2 = (Button) getActivity().findViewById(R.id.button3);
        Button button3 = (Button) getActivity().findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("Layout1");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("Layout2");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("Layout3");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("Layout4");
            }
        });
        return view;
    }




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof AdapterView.OnItemSelectedListener) {
            listener = (OnitemSelectedListener) activity;
        } else {
            throw new ClassCastException(activity.toString() + " must implemenet MyListFragment.OnItemSelectedListener");
        }
    }

    // May also be triggered from the Activity
    public void updateDetail(String s) {
        listener.onTrpItemSelected(s);
    }

    public interface OniteamSelectedListener {
        public void onTrpItemSelected(String link);
    }
}

