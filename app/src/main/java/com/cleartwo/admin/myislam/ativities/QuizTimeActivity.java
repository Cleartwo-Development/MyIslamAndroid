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
import com.cleartwo.admin.myislam.utilities.ConstMenu;

import java.util.Objects;

public class QuizTimeActivity extends AppCompatActivity {

    TextView q_1, q_2, q_3, q_4, question, title_name;

    int Q_No = 0;
    int Sess_No = 0;
    String textArray[] = {"1. What are the angels made from?",
            "2. Which angel revealed the Quran to Muhammad (PBUH)?",
            "3. Mika’il is the angel of...?"};
    String answrArr[][] = {
            {"Clay",
                    "Stone",
                    "Sand",
                    "Light"},
            {"Israfil",
                    "Jibra’il",
                    "Mika’il",
                    "Izra’il"},
            {"Mercy",
                    "Death",
                    "Revelation",
                    "Light"},};
    int answers[] = {4,
            2,
            1};
    int userAnswers[] = {0,
            0,
            0};
    boolean cnfrmation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_time);

        question = (TextView) findViewById(R.id.question);
        title_name = (TextView) findViewById(R.id.title_name);
        q_1 = (TextView) findViewById(R.id.q_1);
        q_2 = (TextView) findViewById(R.id.q_2);
        q_3 = (TextView) findViewById(R.id.q_3);
        q_4 = (TextView) findViewById(R.id.q_4);

        q_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerClick(1);
            }
        });
        q_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerClick(2);
            }
        });
        q_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerClick(3);
            }
        });
        q_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerClick(4);
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
                    if (Sess_No == 0) {
                        if (Q_No < textArray.length) {
                            setQuestion();
                        } else {
                            showResultDialog(QuizTimeActivity.this);
                        }
                    }else if(Sess_No == 1){
                        if (Q_No < ConstMenu.pillrsArr.length) {
                            setQuestion();
                        } else {
                            showResultDialog(QuizTimeActivity.this);
                        }
                    }else if(Sess_No == 2){
                        if (Q_No < ConstMenu.messArr.length) {
                            setQuestion();
                        } else {
                            showResultDialog(QuizTimeActivity.this);
                        }
                    }else if(Sess_No == 3){
                        if (Q_No < ConstMenu.quranArr.length) {
                            setQuestion();
                        } else {
                            showResultDialog(QuizTimeActivity.this);
                        }
                    }else if(Sess_No == 4){
                        if (Q_No < ConstMenu.pbuhArr.length) {
                            setQuestion();
                        } else {
                            showResultDialog(QuizTimeActivity.this);
                        }
                    }
                } else {
                    Toast.makeText(QuizTimeActivity.this, "Select True OR False", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setQuestion();
    }


    @SuppressLint("SetTextI18n")
    private void setQuestion() {
        if (Sess_No == 0) {
            answerClick(-1);
            cnfrmation = false;
            question.setText(textArray[Q_No]);
            title_name.setText("Angels");
            title_name.setBackgroundResource(R.drawable.text_green_bg);
            q_1.setText(answrArr[Q_No][0]);
            q_2.setText(answrArr[Q_No][1]);
            q_3.setText(answrArr[Q_No][2]);
            q_4.setText(answrArr[Q_No][3]);
            Q_No++;
        } else if (Sess_No == 1) {
            answerClick(-1);
            cnfrmation = false;
            title_name.setText("Five Pillars");
            title_name.setBackgroundResource(R.drawable.text_red_bg);
            question.setText(ConstMenu.pillrsArr[Q_No]);
            q_1.setText(ConstMenu.pillrsOpt[Q_No][0]);
            q_2.setText(ConstMenu.pillrsOpt[Q_No][1]);
            q_3.setText(ConstMenu.pillrsOpt[Q_No][2]);
            q_4.setText(ConstMenu.pillrsOpt[Q_No][3]);
            Q_No++;
        } else if (Sess_No == 2) {
            answerClick(-1);
            cnfrmation = false;
            title_name.setText("Messengers");
            title_name.setBackgroundResource(R.drawable.text_blue_bg);
            question.setText(ConstMenu.messArr[Q_No]);
            q_1.setText(ConstMenu.messOpt[Q_No][0]);
            q_2.setText(ConstMenu.messOpt[Q_No][1]);
            q_3.setText(ConstMenu.messOpt[Q_No][2]);
            q_4.setText(ConstMenu.messOpt[Q_No][3]);
            Q_No++;
        } else if (Sess_No == 3) {
            answerClick(-1);
            cnfrmation = false;
            title_name.setText("Quran");
            title_name.setBackgroundResource(R.drawable.text_orange_bg);
            question.setText(ConstMenu.quranArr[Q_No]);
            q_1.setText(ConstMenu.quranOpt[Q_No][0]);
            q_2.setText(ConstMenu.quranOpt[Q_No][1]);
            q_3.setText(ConstMenu.quranOpt[Q_No][2]);
            q_4.setText(ConstMenu.quranOpt[Q_No][3]);
            Q_No++;
        } else if (Sess_No == 4) {
            answerClick(-1);
            cnfrmation = false;
            title_name.setText("The Last Prophet (PBUH)");
            title_name.setBackgroundResource(R.drawable.text_purpule_bg);
            question.setText(ConstMenu.pbuhArr[Q_No]);
            q_1.setText(ConstMenu.pbuhOpt[Q_No][0]);
            q_2.setText(ConstMenu.pbuhOpt[Q_No][1]);
            q_3.setText(ConstMenu.pbuhOpt[Q_No][2]);
            q_4.setText(ConstMenu.pbuhOpt[Q_No][3]);
            Q_No++;
        }else {
            Sess_No = 0;
            answerClick(-1);
            cnfrmation = false;
            question.setText(textArray[Q_No]);
            title_name.setText("Angels");
            title_name.setBackgroundResource(R.drawable.text_green_bg);
            q_1.setText(answrArr[Q_No][0]);
            q_2.setText(answrArr[Q_No][1]);
            q_3.setText(answrArr[Q_No][2]);
            q_4.setText(answrArr[Q_No][3]);
            Q_No++;
        }
//        title_name.setPadding(100, 0, 0, 0);

    }

    public void answerClick(int selected_Val) {
        if(selected_Val > 0) {
            userAnswers[Q_No - 1] = selected_Val;
            ConstMenu.pillrsUserAns[Q_No - 1] = selected_Val;
            ConstMenu.messUserAns[Q_No - 1] = selected_Val;
            ConstMenu.quranUserAns[Q_No - 1] = selected_Val;
            ConstMenu.pbuhUserAns[Q_No - 1] = selected_Val;
        }
        cnfrmation = true;
        q_2.setBackgroundResource(R.drawable.unselected_btn);
        q_1.setBackgroundResource(R.drawable.unselected_btn);
        q_3.setBackgroundResource(R.drawable.unselected_btn);
        q_4.setBackgroundResource(R.drawable.unselected_btn);
        q_2.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        q_1.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        q_3.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        q_4.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        if (selected_Val == 1) {
            q_1.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            q_1.setBackgroundResource(R.drawable.select_purpl_btn);
        } else if (selected_Val == 2) {
            q_2.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            q_2.setBackgroundResource(R.drawable.select_purpl_btn);
        } else if (selected_Val == 3) {
            q_3.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            q_3.setBackgroundResource(R.drawable.select_purpl_btn);
        } else if (selected_Val == 4) {
            q_4.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
            q_4.setBackgroundResource(R.drawable.select_purpl_btn);
        }
    }

    @SuppressLint("SetTextI18n")
    public void showResultDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.quiz_time_rslt);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        TextView tota_score = (TextView) dialog.findViewById(R.id.tota_score);
        TextView rating = (TextView) dialog.findViewById(R.id.rating);

        int total = 0, length = 0;
        if(Sess_No == 0) {
            length = textArray.length;
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == userAnswers[i]) {
                    total++;
                }
            }
        }else if(Sess_No == 1) {
            length = ConstMenu.pillrsArr.length;
            for (int i = 0; i < ConstMenu.pillrsArr.length; i++) {
                if (ConstMenu.pillrsAns[i] == ConstMenu.pillrsUserAns[i]) {
                    total++;
                }
            }
        }else if(Sess_No == 2) {
            length = ConstMenu.messArr.length;
            for (int i = 0; i < ConstMenu.messArr.length; i++) {
                if (ConstMenu.messAns[i] == ConstMenu.messUserAns[i]) {
                    total++;
                }
            }
        }else if(Sess_No == 3) {
            length = ConstMenu.quranArr.length;
            for (int i = 0; i < ConstMenu.quranArr.length; i++) {
                if (ConstMenu.quranAns[i] == ConstMenu.quranUserAns[i]) {
                    total++;
                }
            }
        }else if(Sess_No == 4) {
            length = ConstMenu.pbuhArr.length;
            for (int i = 0; i < ConstMenu.pbuhArr.length; i++) {
                if (ConstMenu.pbuhAns[i] == ConstMenu.pbuhUserAns[i]) {
                    total++;
                }
            }
        }
        tota_score.setText("Your scored " + total + "/" + length);
        double percentage = (new Double(total) / new Double(length)) * 100;
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
        ((View) dialog.findViewById(R.id.next_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q_No = 0;
                Sess_No++;
                setQuestion();
                dialog.dismiss();
            }
        });

        dialog.show();

    }

}