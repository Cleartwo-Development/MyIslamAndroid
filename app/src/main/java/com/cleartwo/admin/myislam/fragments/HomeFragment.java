package com.cleartwo.admin.myislam.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.Const;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_home, container, false);
        initView();
        return view;
    }

    private void initView() {
        ((View) view.findViewById(R.id.gridView_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Const.mainActivity.tabLayout.getTabAt(1).select();
                }catch (Exception e){
                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        ((View) view.findViewById(R.id.sectionTitle_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Const.mainActivity.tabLayout.getTabAt(2).select();
                }catch (Exception e){
                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}