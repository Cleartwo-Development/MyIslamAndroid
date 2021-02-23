package com.cleartwo.admin.myislam.ativities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.MultiChoiceAdapter;
import com.cleartwo.admin.myislam.modelClasses.QuestionsModel;
import com.cleartwo.admin.myislam.utilities.QuesAnsConst;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQActivity extends AppCompatActivity {

    private List<QuestionsModel> modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MultiChoiceAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        modelList = QuesAnsConst.modelList;
        ((TextView) findViewById(R.id.title_name)).setText(QuesAnsConst.bar_title);
        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MultiChoiceAdapter(modelList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        mAdapter.notifyDataSetChanged();
    }
}
