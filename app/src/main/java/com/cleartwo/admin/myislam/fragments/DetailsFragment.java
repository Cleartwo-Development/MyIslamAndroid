package com.cleartwo.admin.myislam.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.CustomAdapter;
import com.cleartwo.admin.myislam.ativities.AnimationActivity;
import com.cleartwo.admin.myislam.modelClasses.TopicModel;
import com.cleartwo.admin.myislam.adapter.TopicAdapter;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.ConstMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DetailsFragment extends Fragment {

    public DetailsFragment() {
        // Required empty public constructor
    }

    private List<TopicModel> modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TopicAdapter mAdapter;
    private View view;
    RelativeLayout view_one;
    private TextView section_title, section_description;

    TextView[] questionView;
    View[] textView;

    // here is wudu details
    public ImageView wudu_btn;

    //CompanionsOfProphetView
    TextView fatima_details, maryam_details, asiya_details,
            fatima_btn, maryam_btn, asiya_btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (ConstMenu.selectedMenu == 100) {
            view = inflater.inflate(R.layout.fragment_menu, container, false);
            initMenuView();
        } else if (Const.gridSelectedNumber == 9) {
            view = inflater.inflate(R.layout.activity_wudu, container, false);
            wuduView();
        } else if (Const.gridSelectedNumber == 7) {
            view = inflater.inflate(R.layout.companions_of_prophet, container, false);
            CompanionsOfProphetView();
        } else if (Const.gridSelectedNumber == 8) {
            view = inflater.inflate(R.layout.prophet_stories, container, false);
            prophetStoriesView();
        } else if (Const.gridSelectedNumber == 1) {
            view = inflater.inflate(R.layout.shahadat_layout, container, false);
            ShahadatView();
        } else if (Const.gridSelectedNumber == 3) {
            view = inflater.inflate(R.layout.sawm_fasting, container, false);
            sawmView();
        } else if (Const.gridSelectedNumber == 4) {
            view = inflater.inflate(R.layout.zakat_layout, container, false);
            zakatView();
        } else {
            view = inflater.inflate(R.layout.fragment_menu_btn, container, false);
            initView();
        }
        Const.detailsFragment = DetailsFragment.this;
        return view;
    }

    private void sawmView() {
        textView = new View[1];
        questionView = new TextView[1];
        textView[0] = (View) view.findViewById(R.id.answer_title);

        questionView[0] = (TextView) view.findViewById(R.id.question_title);
        visibilityMethod();
    }

    private void zakatView() {
        textView = new View[1];
        questionView = new TextView[1];
        textView[0] = (View) view.findViewById(R.id.answer_title);

        questionView[0] = (TextView) view.findViewById(R.id.question_title);
        visibilityMethod();
    }

    private void prophetStoriesView() {
        textView = new View[5];
        questionView = new TextView[5];
        textView[0] = (View) view.findViewById(R.id.answer_title);
        textView[1] = (View) view.findViewById(R.id.answer_title1);
        textView[2] = (View) view.findViewById(R.id.answer_title2);
        textView[3] = (View) view.findViewById(R.id.answer_title3);
        textView[4] = (View) view.findViewById(R.id.answer_title4);

        questionView[0] = (TextView) view.findViewById(R.id.question_title);
        questionView[1] = (TextView) view.findViewById(R.id.question_title1);
        questionView[2] = (TextView) view.findViewById(R.id.question_title2);
        questionView[3] = (TextView) view.findViewById(R.id.question_title3);
        questionView[4] = (TextView) view.findViewById(R.id.question_title4);
        visibilityMethod();
    }

    private void ShahadatView() {
        textView = new View[6];
        questionView = new TextView[6];
        textView[0] = (View) view.findViewById(R.id.answer_title);
        textView[1] = (View) view.findViewById(R.id.answer_title1);
        textView[2] = (View) view.findViewById(R.id.answer_title2);
        textView[3] = (View) view.findViewById(R.id.answer_title3);
        textView[4] = (View) view.findViewById(R.id.answer_title4);
        textView[5] = (View) view.findViewById(R.id.answer_title5);

        questionView[0] = (TextView) view.findViewById(R.id.question_title);
        questionView[1] = (TextView) view.findViewById(R.id.question_title1);
        questionView[2] = (TextView) view.findViewById(R.id.question_title2);
        questionView[3] = (TextView) view.findViewById(R.id.question_title3);
        questionView[4] = (TextView) view.findViewById(R.id.question_title4);
        questionView[5] = (TextView) view.findViewById(R.id.question_title5);
        visibilityMethod();
    }

    private void CompanionsOfProphetView() {
        fatima_details = view.findViewById(R.id.fatima_details);
        maryam_details = view.findViewById(R.id.maryam_details);
        asiya_details = view.findViewById(R.id.asiya_details);

        fatima_btn = view.findViewById(R.id.fatima_btn);
        fatima_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fatima_details.getVisibility() == View.VISIBLE) {
                    fatima_details.setVisibility(View.GONE);
                    fatima_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_down_btn, 0);
                } else {
                    fatima_details.setVisibility(View.VISIBLE);
                    fatima_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_up_btn, 0);
                }
            }
        });
        maryam_btn = view.findViewById(R.id.maryam_btn);
        maryam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (maryam_details.getVisibility() == View.VISIBLE) {
                    maryam_details.setVisibility(View.GONE);
                    maryam_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_down_btn, 0);
                } else {
                    maryam_details.setVisibility(View.VISIBLE);
                    maryam_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_up_btn, 0);
                }
            }
        });
        asiya_btn = view.findViewById(R.id.asiya_btn);
        asiya_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (asiya_details.getVisibility() == View.VISIBLE) {
                    asiya_details.setVisibility(View.GONE);
                    asiya_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_down_btn, 0);
                } else {
                    asiya_details.setVisibility(View.VISIBLE);
                    asiya_btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_up_btn, 0);
                }
            }
        });
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            // Refresh your fragment here
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
//            Log.i("IsRefresh", "Yes");
        }
    }

    public void wuduView() {
        wudu_btn = view.findViewById(R.id.wudu_btn);
        wudu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AnimationActivity.class));
                Objects.requireNonNull(getActivity()).overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
            }
        });
    }

    public void initView() {
        Const.methodCall();
        modelList = Const.sectionDetailsModel.getModelList();

        section_title = (TextView) view.findViewById(R.id.section_title);
        section_title.setText(Const.sectionDetailsModel.getSection_title());
        section_description = (TextView) view.findViewById(R.id.section_description);
        section_description.setText(Const.sectionDetailsModel.getSection_description());

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        view_one = (RelativeLayout) view.findViewById(R.id.view_one);

        mAdapter = new TopicAdapter(getContext(), modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

        Const.detailsFragment = DetailsFragment.this;
        selectedNumber();
    }

    public void selectedNumber() {
        if (Const.gridSelectedNumber == 0) {
            view_one.setBackgroundResource(R.drawable.basic_beliefs_bg);
        } else if (Const.gridSelectedNumber == 1) {
            view_one.setBackgroundResource(R.drawable.shahadah_bg);
        } else if (Const.gridSelectedNumber == 2) {
            view_one.setBackgroundResource(R.drawable.salah_bg);
        } else if (Const.gridSelectedNumber == 3) {
            view_one.setBackgroundResource(R.drawable.sawm_bg);
        } else if (Const.gridSelectedNumber == 4) {
            view_one.setBackgroundResource(R.drawable.zakat_bg);
        } else if (Const.gridSelectedNumber == 5) {
            view_one.setBackgroundResource(R.drawable.hajj_bg);
        } else if (Const.gridSelectedNumber == 6) {
            view_one.setBackgroundResource(R.drawable.muhammad_bg);
        } else if (Const.gridSelectedNumber == 7) {
            view_one.setBackgroundResource(R.drawable.prophet_companiens_bg);
        } else if (Const.gridSelectedNumber == 8) {
            view_one.setBackgroundResource(R.drawable.prophets_stories_bg);
        } else {
            view_one.setBackgroundResource(R.drawable.blue_rec_bg);
        }
    }

    private void prepareMovieData() {
        mAdapter.notifyDataSetChanged();
    }
    /////////////////////////////////////////////////

    public void visibilityMethod() {
        for (int i = 0; i < textView.length; i++) {
            final int finalI = i;
            questionView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    animationMethod(textView[finalI], questionView[finalI]);
                }
            });
        }
    }

    public void animationMethod(final View textView, final TextView questionView) {
        if (textView.getVisibility() == View.VISIBLE) {
            textView.setVisibility(View.GONE);
            questionView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_down_btn, 0);
        } else {
            visibilityGoneMethod();
            textView.setVisibility(View.VISIBLE);
            questionView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_up_btn, 0);

        }

    }

    public void visibilityGoneMethod() {
        for (int i = 0; i < textView.length; i++) {
            final int finalI = i;
            textView[finalI].setVisibility(View.GONE);
            questionView[i].setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.drop_down_btn, 0);
        }
    }

    GridView grid;

    public void initMenuView() {


        CustomAdapter adapter = new CustomAdapter(getActivity(), ConstMenu.web, ConstMenu.imageId);
        grid = (GridView) view.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//                Toast.makeText(getActivity(), "You Clicked at " + web[position]+position, Toast.LENGTH_SHORT).show();
                try {
                    ConstMenu.selectedMenu = 0;
                    refreshFragment();

                    Const.gridSelectedNumber = position;
                    Const.methodCall();
//                    Const.mainActivity.tabLayout.getTabAt(2).select();
                    Const.homeFragment.section_name.setText(ConstMenu.web[position]);
                    Const.homeFragment.sectionTitle_bg.setImageResource(ConstMenu.imageId[position]);
                    Const.detailsFragment.initView();
                } catch (Exception e) {
//                    Toast.makeText(getActivity(), "Some thing went wrong :-(" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void refreshFragment() {
        getFragmentManager().beginTransaction().detach(Const.detailsFragment).attach(Const.detailsFragment).commit();
    }
}