package com.cleartwo.admin.myislam.ativities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;

import java.util.Objects;

public class TrueFalseActivity extends AppCompatActivity {

    View false_btn, true_btn;
    TextView false_text, true_text, question, question_no;

    int Q_No = 0;
    String textArray[] = {"Prophet Muhammad’s (PBUH) father was called Abdullah?",
            "Prophet Muhammad (PBUH) died in Makkah",
            "Prophet Muhammad (PBUH) born in 570 in Mecca"};
    int answers[] = {1,
            2,
            1};
    int userAnswers[] = {0,
            0,
            0};
    boolean cnfrmation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);

        question = (TextView) findViewById(R.id.question);
        question_no = (TextView) findViewById(R.id.question_no);
        false_text = (TextView) findViewById(R.id.q_1);
        true_text = (TextView) findViewById(R.id.true_text);
        true_btn = (View) findViewById(R.id.true_btn);
        true_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswers[Q_No-1] = 1;
                answerClick(0);
            }
        });
        false_btn = (View) findViewById(R.id.false_btn);
        false_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswers[Q_No-1] = 2;
                answerClick(1);
            }
        });
        ((ImageView) findViewById(R.id.back_to_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
                finish();
            }
        });
        ((View) findViewById(R.id.next_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnfrmation) {
                    if (Q_No < textArray.length) {
                        setQuestion();
                    } else {
                        showResultDialog(TrueFalseActivity.this);
                    }
                }else {
                    Toast.makeText(TrueFalseActivity.this, "Select True OR False", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setQuestion();
        showDialog(this);
    }

    @SuppressLint("SetTextI18n")
    private void setQuestion() {
        answerClick(3);
        cnfrmation = false;
        question.setText(textArray[Q_No]);
        question_no.setText("Question " + (Q_No + 1));
        Q_No++;
    }

    public void answerClick(int selected_Val) {

        cnfrmation = true;
        true_btn.setBackgroundResource(R.drawable.unselected_btn);
        false_btn.setBackgroundResource(R.drawable.unselected_btn);
        true_text.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        false_text.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        if (selected_Val == 0) {
            true_text.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            true_btn.setBackgroundResource(R.drawable.selected_green_btn);
        } else if (selected_Val == 1) {
            false_text.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            false_btn.setBackgroundResource(R.drawable.selected_red_btn);
        }
    }


    public void showDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.skip_dialog);


        ((View) dialog.findViewById(R.id.skip_txt)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((View) dialog.findViewById(R.id.lets_go)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
    @SuppressLint("SetTextI18n")
    public void showResultDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.result_dialog);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        TextView tota_score =(TextView) dialog.findViewById(R.id.tota_score);
        TextView rating = (TextView) dialog.findViewById(R.id.result_rating);

        int total = 0;
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == userAnswers[i]){
                total++;
            }
        }
        tota_score.setText(total + "/"+textArray.length);

        double percentage = ((double) total / (double) answers.length) * 100;
        Log.i("Tag Aim", percentage + "");
        if (percentage > 90.0) {
            rating.setText("Excellent!");
        }else if (percentage > 66.0) {
            rating.setText("Well Done!");
        }else if (percentage > 33.0){
            rating.setText("Unlucky!");
        }else {
            rating.setText("Try Again!");
        }

        ((View) dialog.findViewById(R.id.result_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q_No = 0;
                setQuestion();
                dialog.dismiss();
            }
        });

        ((View) dialog.findViewById(R.id.play_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q_No = 0;
                setQuestion();
                dialog.dismiss();
            }
        });

        dialog.show();
    }

}