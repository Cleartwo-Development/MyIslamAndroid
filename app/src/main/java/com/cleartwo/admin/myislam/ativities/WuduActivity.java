package com.cleartwo.admin.myislam.ativities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.Const;

public class WuduActivity extends AppCompatActivity {

    public TextView activity_title;
    public View tab_bar_view;
    public ImageView wudu_btn;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wudu);

        tab_bar_view = findViewById(R.id.tab_bar_view);
        tab_bar_view.setVisibility(View.VISIBLE);
        activity_title = findViewById(R.id.activity_title);
        wudu_btn = findViewById(R.id.wudu_btn);
        activity_title.setText("Hello " + Const.profileName);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Profile Button", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
        fab.setImageResource(Const.profileIcon);

        wudu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WuduActivity.this,FullScreenVideoActivity.class));
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
            }
        });
        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);    }
        });
    }
}