package com.cleartwo.admin.myislam.ativities;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cleartwo.admin.myislam.R;
import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;

public class SpotLoadActivity extends AppCompatActivity {

    RoundedHorizontalProgressBar roundedHorizontalProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_load);
        roundedHorizontalProgressBar = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_1);
        roundedHorizontalProgressBar.animateProgress(1800, 0, 100);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SpotLoadActivity.this, SpotActivity.class));
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
                finish();
            }
        }, 2000);

        ((ImageView) findViewById(R.id.back_to_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacksAndMessages(null);
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
                finish();
            }
        });


    }
}