package com.cleartwo.admin.myislam.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.GamesAdapter;
import com.cleartwo.admin.myislam.ativities.LoadingActivity;
import com.cleartwo.admin.myislam.ativities.QuizLoadActivity;
import com.cleartwo.admin.myislam.ativities.SearchLoadActivity;
import com.cleartwo.admin.myislam.ativities.SpotLoadActivity;
import com.cleartwo.admin.myislam.utilities.Const;

import java.util.Objects;

public class GamesFragment extends Fragment {

    public GamesFragment() {
        // Required empty public constructor
    }

    GridView grid;
    int[] imageId = {
            R.drawable.quiz_tme,
            R.drawable.word_search,
            R.drawable.spot_diff,
            R.drawable.true_false,
            R.drawable.unscramble,

            R.drawable.salat_snap,
            R.drawable.fill_gaps,
            R.drawable.match_pairs
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
        view = inflater.inflate(R.layout.fragment_games, container, false);
        initView();
        return view;
    }

    public void initView() {
        Const.gamesFragment = this;

        GamesAdapter adapter = new GamesAdapter(getActivity(), imageId);
        grid = (GridView) view.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//                Toast.makeText(getActivity(), "You Clicked at " + web[position]+position, Toast.LENGTH_SHORT).show();
                try {
                    if (position == 0) {
                        startActivity(new Intent(getContext(), QuizLoadActivity.class));
                    }else if (position == 1) {
                        startActivity(new Intent(getContext(), SearchLoadActivity.class));
                    }else if (position == 2) {
                        startActivity(new Intent(getContext(), SpotLoadActivity.class));
                    } else {
                        startActivity(new Intent(getContext(), LoadingActivity.class));
                    }
                    (Objects.requireNonNull(getActivity())).overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
//                    Const.gridSelectedNumber = position;

                } catch (Exception e) {
//                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}