package com.cleartwo.admin.myislam.ativities;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;

public class BasicBeliefsAllahActivity extends AppCompatActivity {
    TextView[] textView = new TextView[6];
    TextView[] questionView = new TextView[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_beliefs_allah);

//        ((TextView) findViewById(R.id.title_name)).setText("Allah");
        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
                finish();

            }
        });

        ((View) findViewById(R.id.angels_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(), AngelsActivity.class));
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
                finish();

            }
        });

        visibilityMethod();
    }

    public void visibilityMethod() {
        textView[0] = (TextView) findViewById(R.id.answer_title);
        textView[1] = (TextView) findViewById(R.id.answer_title1);
        textView[2] = (TextView) findViewById(R.id.answer_title2);
        textView[3] = (TextView) findViewById(R.id.answer_title3);
        textView[4] = (TextView) findViewById(R.id.answer_title4);
        textView[5] = (TextView) findViewById(R.id.answer_title5);

        questionView[0] = (TextView) findViewById(R.id.question_title);
        questionView[1] = (TextView) findViewById(R.id.question_title1);
        questionView[2] = (TextView) findViewById(R.id.question_title2);
        questionView[3] = (TextView) findViewById(R.id.question_title3);
        questionView[4] = (TextView) findViewById(R.id.question_title4);
        questionView[5] = (TextView) findViewById(R.id.question_title5);

        ((TextView) findViewById(R.id.question_title)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[0], questionView[0]);
            }
        });
        ((TextView) findViewById(R.id.question_title1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[1], questionView[1]);
            }
        });
        ((TextView) findViewById(R.id.question_title2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[2], questionView[2]);
            }
        });
        ((TextView) findViewById(R.id.question_title3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[3], questionView[3]);
            }
        });
        ((TextView) findViewById(R.id.question_title4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[4], questionView[4]);
            }
        });
        ((TextView) findViewById(R.id.question_title5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationMethod(textView[5], questionView[5]);
            }
        });
    }

    public void animationMethod(final TextView textView, final TextView questionView) {
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
}
