package com.cleartwo.admin.myislam.ativities;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.StartSignUp.ChildNameActivity;
import com.cleartwo.admin.myislam.ativities.StartSignUp.StartSignUpActivity;
import com.skyfishjy.library.RippleBackground;

public class SplashActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        videoView = findViewById(R.id.videoView);

        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);
        ImageView imageView = (ImageView) findViewById(R.id.centerImage);

        rippleBackground.startRippleAnimation();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, ChildNameActivity.class));
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
                finish();
            }
        }, 4000);

//        String fullScreen =  getIntent().getStringExtra("fullScreenInd");
//        if("y".equals(fullScreen)){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                    WindowManager.LayoutParams.FLAG_FULLSCREEN);x
////            getSupportActionBar().hide();
//        }

        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.my_islam_intro_video);
        videoView.setVideoURI(videoUri);
        videoView.setZOrderOnTop(true);
        videoView.start();
    }
}
