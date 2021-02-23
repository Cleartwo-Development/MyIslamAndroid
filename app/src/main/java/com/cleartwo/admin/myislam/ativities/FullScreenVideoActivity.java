package com.cleartwo.admin.myislam.ativities;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.FullScreenMediaController;

public class FullScreenVideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_video);

        videoView = findViewById(R.id.videoView);

        String fullScreen =  getIntent().getStringExtra("fullScreenInd");
        if("y".equals(fullScreen)){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            getSupportActionBar().hide();
        }

//        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.wudu_process);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/");

        videoView.setVideoURI(videoUri);

        mediaController = new FullScreenMediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        videoView.setZOrderOnTop(true);
        videoView.start();
    }
}
