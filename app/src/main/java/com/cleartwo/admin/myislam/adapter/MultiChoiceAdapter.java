package com.cleartwo.admin.myislam.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.AzanActivity;
import com.cleartwo.admin.myislam.ativities.BasicBeliefsAllahActivity;
import com.cleartwo.admin.myislam.ativities.PrayNamazActivity;
import com.cleartwo.admin.myislam.ativities.TitleDetailsActivity;
import com.cleartwo.admin.myislam.ativities.WuduActivity;
import com.cleartwo.admin.myislam.modelClasses.QuestionsModel;
import com.cleartwo.admin.myislam.modelClasses.TopicModel;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.OtherStrConst;

import java.util.List;

public class MultiChoiceAdapter extends RecyclerView.Adapter<MultiChoiceAdapter.MyViewHolder> {

    private List<QuestionsModel> modelList;
    private Context context;

    public MultiChoiceAdapter(List<QuestionsModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public Button answer1, answer2, answer3, answer4;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            answer1 = (Button) view.findViewById(R.id.answer1);
            answer2 = (Button) view.findViewById(R.id.answer2);
            answer3 = (Button) view.findViewById(R.id.answer3);
            answer4 = (Button) view.findViewById(R.id.answer4);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.multi_choice_q, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        QuestionsModel topicModel = modelList.get(position);
        holder.title.setText(topicModel.getTitle());
        holder.answer1.setText(topicModel.getAn1());
        holder.answer2.setText(topicModel.getAn2());
        holder.answer3.setText(topicModel.getAn3());
        holder.answer4.setText(topicModel.getAn4());
        holder.answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodTextColor(holder.answer1, position, "1");
            }
        });
        holder.answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodTextColor(holder.answer2, position, "2");
            }
        });
        holder.answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodTextColor(holder.answer3, position, "3");
            }
        });
        holder.answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodTextColor(holder.answer4, position, "4");
            }
        });
    }

    public void methodTextColor(Button answer, int position, String btnNumber) {
        if (modelList.get(position).getrAn().equals(btnNumber))
            answer.setTextColor(Color.GREEN);
        else
            answer.setTextColor(Color.RED);
    }


    @Override
    public int getItemCount() {
        return modelList.size();
    }

}
