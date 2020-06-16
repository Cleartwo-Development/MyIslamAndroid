package com.cleartwo.admin.myislam.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.CustomAdapter;
import com.cleartwo.admin.myislam.utilities.Const;

public class GameIconFragment extends Fragment {

    public GameIconFragment() {
        // Required empty public constructor
    }

    GridView grid;
    String[] web = {
            "Basic Beliefs",
            "Shahadah",
            "Salah",
            "Sawm",
            "Zakat",

            "Hajj",
            "The Last Prophet (PBUH)",
            "Companions of the Prophet",
            "Stories of the Prophets",
            "Wudu"
    };
    int[] imageId = {
            R.drawable.basic_beliefs,
            R.drawable.shahadah,
            R.drawable.salah,
            R.drawable.sawm,
            R.drawable.zakat,

            R.drawable.hajj,
            R.drawable.the_last_prophet,
            R.drawable.companions_of_the_prophet,
            R.drawable.stories_of_the_prophets,
            R.drawable.wudu
    };

    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_game_icon, container, false);
        initView();
        return view;
    }

    public void initView() {

        CustomAdapter adapter = new CustomAdapter(getActivity(), web, imageId);
        grid = (GridView) view.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//                Toast.makeText(getActivity(), "You Clicked at " + web[position]+position, Toast.LENGTH_SHORT).show();
                try {
                    Const.gridSelectedNumber = position;
                    Const.methodCall();
                    Const.mainActivity.tabLayout.getTabAt(2).select();
                    Const.menuFragment.initView();
                }catch (Exception e){
                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}