package com.cleartwo.admin.myislam.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.ConstMenu;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    View view;
    ImageView sectionTitle_bg;
    TextView section_name;

    int[] imageBgId = {
            R.drawable.basic_beliefs_bg,
            R.drawable.shahadah_bg,
            R.drawable.salah_bg,
            R.drawable.sawm_bg,
            R.drawable.zakat_bg,

            R.drawable.hajj_bg,
            R.drawable.muhammad_bg,
            R.drawable.prophet_companiens_bg,
            R.drawable.prophets_stories_bg,
            R.drawable.wudu_image
    };

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
        Const.homeFragment = this;
        sectionTitle_bg = view.findViewById(R.id.sectionTitle_bg);
        sectionTitle_bg.setImageResource(R.drawable.basic_beliefs_bg);
        section_name = (TextView) view.findViewById(R.id.section_name);
        section_name.setText("Basic Beliefs");

        ((View) view.findViewById(R.id.gridView_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Const.mainActivity.tabLayout.getTabAt(2).select();
                } catch (Exception e) {
//                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        ((View) view.findViewById(R.id.sectionTitle_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ConstMenu.selectedMenu = -101;
                    Const.mainActivity.tabLayout.getTabAt(2).select();
                } catch (Exception e) {
//                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        try {
            section_name.setText(ConstMenu.web[Const.gridSelectedNumber]);
            sectionTitle_bg.setImageResource(imageBgId[Const.gridSelectedNumber]);
        } catch (Exception e) {
//            Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
        }
    }

}