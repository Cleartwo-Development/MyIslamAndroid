package com.cleartwo.admin.myislam.ativities;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.cleartwo.admin.myislam.R;

public class SalatSnapGameActivity extends AppCompatActivity implements View.OnClickListener {

    ImageSwitcher[] imageView = new ImageSwitcher[8];
    int lastPosition = 0;
    int cnfrmStopView = 0;
    Animation in, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salat_snap);

        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });

        imageView[0] = (ImageSwitcher) findViewById(R.id.img1);
        imageView[1] = (ImageSwitcher) findViewById(R.id.img2);
        imageView[2] = (ImageSwitcher) findViewById(R.id.img3);
        imageView[3] = (ImageSwitcher) findViewById(R.id.img4);

        imageView[4] = (ImageSwitcher) findViewById(R.id.img5);
        imageView[5] = (ImageSwitcher) findViewById(R.id.img6);
        imageView[6] = (ImageSwitcher) findViewById(R.id.img7);
        imageView[7] = (ImageSwitcher) findViewById(R.id.img8);

        for (int i = 0; i < imageView.length; i++) {
            imageView[i].setOnClickListener(this);
            imageView[i].setTag(i);
            in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
//            out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
            imageView[i].setInAnimation(in);
            imageView[i].setFactory(new ViewSwitcher.ViewFactory() {
                @Override
                public View makeView() {
                    ImageView myView = new ImageView(getApplicationContext());
                    myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    myView.setLayoutParams(new
                            ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                            ActionBar.LayoutParams.WRAP_CONTENT));
                    return myView;
                }
            });
            imageView[i].setImageResource(R.drawable.white_card);

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img1:
                imgChangMethod(0, 222);
                break;
            case R.id.img2:
                imgChangMethod(1, 333);
                break;
            case R.id.img3:
                imgChangMethod(2, 444);
                break;
            case R.id.img4:
                imgChangMethod(3, 555);
                break;
            case R.id.img5:
                imgChangMethod(4, 444);
                break;
            case R.id.img6:
                imgChangMethod(5, 555);
                break;
            case R.id.img7:
                imgChangMethod(6, 333);
                break;
            case R.id.img8:
                imgChangMethod(7, 222);
                break;
        }
    }

    public void imgChangMethod(final int position, final int stopView) {
        if (cnfrmStopView == stopView && lastPosition != position) {
            newMethod(stopView);
        } else {
            cnfrmStopView = stopView;
            lastPosition = position;
        }
        if (imageView[position].getTag().equals(position)) {
            if (position == 0) {
                imageView[position].setImageResource(R.drawable.qiyaam);
            } else if (position == 1) {
                imageView[position].setImageResource(R.drawable.takbeer_text);
            } else if (position == 2) {
                imageView[position].setImageResource(R.drawable.ruku_text);
            } else if (position == 3) {
                imageView[position].setImageResource(R.drawable.sujud);
            } else if (position == 4) {
                imageView[position].setImageResource(R.drawable.ruku);
            } else if (position == 5) {
                imageView[position].setImageResource(R.drawable.sujud_text);
            } else if (position == 6) {
                imageView[position].setImageResource(R.drawable.takebeer);
            } else if (position == 7) {
                imageView[position].setImageResource(R.drawable.qiyam_text);
            }

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (imageView[position].getTag().equals(position)) {
                        imageView[position].setImageResource(R.drawable.white_card);
                    }
                }
            }, 800);
        }


    }

    private void newMethod(int stopView) {
        if (stopView == 222) {
            imageView[0].setImageResource(R.drawable.qiyaam);
            imageView[0].setTag(222);
            imageView[7].setImageResource(R.drawable.qiyam_text);
            imageView[7].setTag(222);

        } else if (stopView == 333) {
            imageView[6].setImageResource(R.drawable.takebeer);
            imageView[1].setImageResource(R.drawable.takbeer_text);
            imageView[6].setTag(222);
            imageView[1].setTag(222);


        } else if (stopView == 444) {
            imageView[2].setImageResource(R.drawable.ruku_text);
            imageView[2].setTag(222);
            imageView[4].setTag(222);
            imageView[4].setImageResource(R.drawable.ruku);

        } else if (stopView == 555) {
            imageView[3].setImageResource(R.drawable.sujud);
            imageView[3].setTag(222);
            imageView[5].setTag(222);
            imageView[5].setImageResource(R.drawable.sujud_text);
        }
    }
}
