package com.cleartwo.admin.myislam.ativities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;

import java.util.Objects;

public class Spot2Activity extends AppCompatActivity {

    ImageView ans, ans_1, ans_2, ans_3, ans_4, ans_5;
    ImageView rate_1, rate_2, rate_3, rate_4, rate_5;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot2);

        ans = (ImageView) findViewById(R.id.ans);
        ans_1 = (ImageView) findViewById(R.id.ans_1);
        ans_2 = (ImageView) findViewById(R.id.ans_2);
        ans_3 = (ImageView) findViewById(R.id.ans_3);
        ans_4 = (ImageView) findViewById(R.id.ans_4);
        ans_5 = (ImageView) findViewById(R.id.ans_5);

        rate_1 = (ImageView) findViewById(R.id.rate_1);
        rate_2 = (ImageView) findViewById(R.id.rate_2);
        rate_3 = (ImageView) findViewById(R.id.rate_3);
        rate_4 = (ImageView) findViewById(R.id.rate_4);
        rate_5 = (ImageView) findViewById(R.id.rate_5);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runTask();
            }
        });

        ans_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_1.setClickable(false);
                ans_1.setImageResource(R.drawable.red_result_bg);
                counter++;
                initMethod();
            }
        });
        ans_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_2.setClickable(false);
                ans_2.setImageResource(R.drawable.red_result_bg);
                counter++;
                initMethod();
            }
        });
        ans_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_3.setClickable(false);
                ans_3.setImageResource(R.drawable.red_result_bg);
                counter++;
                initMethod();
            }
        });
        ans_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_4.setClickable(false);
                ans_4.setImageResource(R.drawable.red_result_bg);
                counter++;
                initMethod();
            }
        });
        ans_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_5.setClickable(false);
                ans_5.setImageResource(R.drawable.red_result_bg);
                counter++;
                initMethod();
            }
        });

        ((ImageView) findViewById(R.id.back_to_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
                finish();
            }
        });
    }

    public void initMethod() {

        if (counter == 1) {
            rate_1.setImageResource(R.drawable.rate_yellow);
        } else if (counter == 2) {
            rate_2.setImageResource(R.drawable.rate_yellow);
        } else if (counter == 3) {
            rate_3.setImageResource(R.drawable.rate_yellow);
        } else if (counter == 4) {
            rate_4.setImageResource(R.drawable.rate_yellow);
        } else if (counter == 5) {
            rate_5.setImageResource(R.drawable.rate_yellow);
            showResultDialog(this);
        }
    }

    public void initRefresh() {
        counter = 0;
        ans_1.setClickable(true);
        ans_2.setClickable(true);
        ans_3.setClickable(true);
        ans_4.setClickable(true);
        ans_5.setClickable(true);

        rate_1.setImageResource(R.drawable.rate_grey);
        ans_1.setImageResource(0);
        rate_2.setImageResource(R.drawable.rate_grey);
        ans_2.setImageResource(0);
        rate_3.setImageResource(R.drawable.rate_grey);
        ans_3.setImageResource(0);
        rate_4.setImageResource(R.drawable.rate_grey);
        ans_4.setImageResource(0);
        rate_5.setImageResource(R.drawable.rate_grey);
        ans_5.setImageResource(0);
    }

    public void runTask() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ERROR !!");
        builder.setMessage("Sorry, Wrong Selection.\nLet's play this again!");
        builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                initRefresh();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    @SuppressLint("SetTextI18n")
    public void showResultDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.spot1_rslt);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        TextView tota_score = (TextView) dialog.findViewById(R.id.tota_score);
        TextView rating = (TextView) dialog.findViewById(R.id.rating);

        ((View) dialog.findViewById(R.id.result_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((View) dialog.findViewById(R.id.play_again)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRefresh();
                dialog.dismiss();
            }
        });
        ((View) dialog.findViewById(R.id.next_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Spot2Activity.this, Spot3Activity.class));
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
                dialog.dismiss();
                finish();
            }
        });

        dialog.show();

    }
}