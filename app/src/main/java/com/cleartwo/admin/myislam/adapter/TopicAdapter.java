package com.cleartwo.admin.myislam.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.AngelsActivity;
import com.cleartwo.admin.myislam.ativities.AzanActivity;
import com.cleartwo.admin.myislam.ativities.BasicBeliefsAllahActivity;
import com.cleartwo.admin.myislam.ativities.FivePrayersActivity;
import com.cleartwo.admin.myislam.ativities.JudgementAndLifeActivity;
import com.cleartwo.admin.myislam.ativities.MessengersActivity;
import com.cleartwo.admin.myislam.ativities.MultipleChoiceQActivity;
import com.cleartwo.admin.myislam.ativities.PrayNamazActivity;
import com.cleartwo.admin.myislam.ativities.WordSearchActivity;
import com.cleartwo.admin.myislam.ativities.SalatSnapGameActivity;
import com.cleartwo.admin.myislam.ativities.TheQuranActivity;
import com.cleartwo.admin.myislam.ativities.TitleDetailsActivity;
import com.cleartwo.admin.myislam.ativities.WuduActivity;
import com.cleartwo.admin.myislam.modelClasses.TopicModel;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.OtherStrConst;
import com.cleartwo.admin.myislam.utilities.QuesAnsConst;

import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.MyViewHolder> {

    private List<TopicModel> modelList;
    private Context context;

    public TopicAdapter(Context context, List<TopicModel> modelList) {
        this.modelList = modelList;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public View parent_view;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            parent_view = (View) view.findViewById(R.id.parent_view);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topic_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        TopicModel topicModel = modelList.get(position);
        holder.title.setText(topicModel.getTitle());
        holder.parent_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickMethod(position);
            }
        });
    }

    private void onClickMethod(int iClick) {
        if (Const.gridSelectedNumber == 0) {
            if (iClick == 0) {
                intTitleDetailsActivity(BasicBeliefsAllahActivity.class);
            } else if (iClick == 1) {
                intTitleDetailsActivity(AngelsActivity.class);
            } else if (iClick == 2) {
                intTitleDetailsActivity(MessengersActivity.class);
            } else if (iClick == 3) {
                intTitleDetailsActivity(TheQuranActivity.class);
            } else if (iClick == 4) {
                intTitleDetailsActivity(JudgementAndLifeActivity.class);
            }

        } else if (Const.gridSelectedNumber == 1) {
//            if (iClick == 0) {
//                OtherStrConst.initDataFIRSTKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            } else if (iClick == 1) {
//                OtherStrConst.initDataSECONDKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            } else if (iClick == 2) {
//                OtherStrConst.initDataTHIRDKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            } else if (iClick == 3) {
//                OtherStrConst.initDataFOURKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            } else if (iClick == 4) {
//                OtherStrConst.initDataFIVEKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            } else if (iClick == 5) {
//                OtherStrConst.initDataSIXKALIMA();
//                intTitleDetailsActivity(TitleDetailsActivity.class);
//            }
        } else if (Const.gridSelectedNumber == 2) {
            if (iClick == 0) {
                intTitleDetailsActivity(FivePrayersActivity.class);
            } else if (iClick == 1) {
                intTitleDetailsActivity(WuduActivity.class);
            } else if (iClick == 2) {
                intTitleDetailsActivity(AzanActivity.class);
            } else if (iClick == 3) {
                intTitleDetailsActivity(PrayNamazActivity.class);
            }
        } else if (Const.gridSelectedNumber == 3) {

        } else if (Const.gridSelectedNumber == 4) {

        } else if (Const.gridSelectedNumber == 5) {

        } else if (Const.gridSelectedNumber == 6) {

        } else if (Const.gridSelectedNumber == 7) {
            if (iClick == 0) {
                OtherStrConst.initDataKHADIJA();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            }

        } else if (Const.gridSelectedNumber == 8) {
            if (iClick == 0) {
                OtherStrConst.initDataADAM();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            } else if (iClick == 1) {
                OtherStrConst.initDataIBRAHIM();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            } else if (iClick == 2) {
                OtherStrConst.initDataNUH();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            } else if (iClick == 3) {
                OtherStrConst.initDataMUSA();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            } else if (iClick == 4) {
                OtherStrConst.initDataISA();
                intTitleDetailsActivity(TitleDetailsActivity.class);
            }
        } else if (Const.gridSelectedNumber == 9) {
            if (iClick == 0) {
                QuesAnsConst.initQueAnsAngels();
                intTitleDetailsActivity(MultipleChoiceQActivity.class);
            } else if (iClick == 1) {
                QuesAnsConst.initQueAnsFIVEPILLARS();
                intTitleDetailsActivity(MultipleChoiceQActivity.class);
            } else if (iClick == 2) {
                QuesAnsConst.initQueAnsMESSENGERS();
                intTitleDetailsActivity(MultipleChoiceQActivity.class);
            } else if (iClick == 3) {
                QuesAnsConst.initQueAnsQURAN();
                intTitleDetailsActivity(MultipleChoiceQActivity.class);
            } else if (iClick == 4) {
                QuesAnsConst.initQueAnsPROPHET();
                intTitleDetailsActivity(MultipleChoiceQActivity.class);
            } else if (iClick == 5) {
                intTitleDetailsActivity(WordSearchActivity.class);
            } else if (iClick == 6) {
                intTitleDetailsActivity(SalatSnapGameActivity.class);
            }
        }
    }

    private void intTitleDetailsActivity(Class aClass) {
        context.startActivity(new Intent(context, aClass));
        ((Activity) context).overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

}
