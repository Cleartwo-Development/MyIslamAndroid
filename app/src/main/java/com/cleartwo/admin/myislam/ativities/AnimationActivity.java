package com.cleartwo.admin.myislam.ativities;

import android.animation.ValueAnimator;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;

public class AnimationActivity extends AppCompatActivity {

    ImageView animationImage, logo_img, wudu_guide, slideImg;
    Button reStart;
    View performing_wudu, steps_view, text_parent;
    TextView wudu_text, text_title, text_explain,text_details, step_num;
    int[] myImageList = new int[]{R.drawable.zero_1,

            R.drawable.one_1, R.drawable.one_2,
            R.drawable.one_3, R.drawable.one_4,
            R.drawable.one_5, R.drawable.one_6,
            R.drawable.one_7, R.drawable.one_8,
            R.drawable.one_9, R.drawable.one_10,
            R.drawable.one_11, R.drawable.one_12,
            R.drawable.one_13, R.drawable.one_14,

            R.drawable.two_1, R.drawable.two_2,
            R.drawable.two_3, R.drawable.two_4,
            R.drawable.two_5, R.drawable.two_6,
            R.drawable.two_7, R.drawable.two_8,
            R.drawable.two_9, R.drawable.two_10,
            R.drawable.two_11, R.drawable.two_12,

            R.drawable.three_1, R.drawable.three_2,
            R.drawable.three_3, R.drawable.three_4,
            R.drawable.three_5, R.drawable.three_6,
            R.drawable.three_7, R.drawable.three_8,
            R.drawable.three_9, R.drawable.three_10,
            R.drawable.three_11, R.drawable.three_12,

            R.drawable.four_1, R.drawable.four_2,
            R.drawable.four_3, R.drawable.four_4,
            R.drawable.four_5, R.drawable.four_6,
            R.drawable.four_7, R.drawable.four_8,
            R.drawable.four_9, R.drawable.four_10,
            R.drawable.four_11,

            R.drawable.five_1, R.drawable.five_2,
            R.drawable.five_3, R.drawable.five_4,
            R.drawable.five_5, R.drawable.five_6,
            R.drawable.five_7, R.drawable.five_8,
            R.drawable.five_9, R.drawable.five_10,
            R.drawable.five_11, R.drawable.five_12,
            R.drawable.five_13, R.drawable.five_14,
            R.drawable.five_15, R.drawable.five_16,
            R.drawable.five_17, R.drawable.five_18,
            R.drawable.five_19, R.drawable.five_20,
            R.drawable.five_21, R.drawable.five_22,
            R.drawable.five_23, R.drawable.five_24,
            R.drawable.five_25, R.drawable.five_26,
            R.drawable.five_27, R.drawable.five_28,
            R.drawable.five_29, R.drawable.five_30,

            R.drawable.six_1, R.drawable.six_2,
            R.drawable.six_3, R.drawable.six_4,
            R.drawable.six_5, R.drawable.six_6,
            R.drawable.six_7, R.drawable.six_8,
            R.drawable.six_9, R.drawable.six_10,
            R.drawable.six_11, R.drawable.six_12,
            R.drawable.six_13, R.drawable.six_14,
            R.drawable.six_15, R.drawable.six_16,
            R.drawable.six_17, R.drawable.six_18,
            R.drawable.six_19,

            R.drawable.seven_1, R.drawable.seven_2,
            R.drawable.seven_3, R.drawable.seven_4,
            R.drawable.seven_5, R.drawable.seven_6,
            R.drawable.seven_7, R.drawable.seven_8,
            R.drawable.seven_9, R.drawable.seven_10,
            R.drawable.seven_11, R.drawable.seven_12,
            R.drawable.seven_13, R.drawable.seven_14,
            R.drawable.seven_15, R.drawable.seven_16,
            R.drawable.seven_17, R.drawable.seven_18,
            R.drawable.seven_19, R.drawable.seven_20,
            R.drawable.seven_21, R.drawable.seven_22,
            R.drawable.seven_23, R.drawable.seven_24,
            R.drawable.seven_25, R.drawable.seven_26};

    private int currentIndex;
    private int endIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        performing_wudu = findViewById(R.id.performing_wudu);
        animationImage = findViewById(R.id.animationImage);
        logo_img = findViewById(R.id.logo_img);
        reStart = findViewById(R.id.reStart);

        wudu_text = findViewById(R.id.wudu_text);
        text_title = findViewById(R.id.text_title);
        text_details = findViewById(R.id.text_details);
        text_explain = findViewById(R.id.text_explain);
        step_num = findViewById(R.id.step_num);

        steps_view = findViewById(R.id.steps_view);
        wudu_guide = findViewById(R.id.wudu_guide);
        slideImg = findViewById(R.id.slideImg);
        text_parent = findViewById(R.id.text_parent);

        reStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performing_wudu.setVisibility(View.VISIBLE);
                reStart.setVisibility(View.GONE);
                wudu_text.setVisibility(View.GONE);
                slideUp(logo_img, 400);
            }
        });
        slideUp(logo_img, 400);

    }

    public void slideUp(final ImageView view, int v1) {
        ValueAnimator anim = ValueAnimator.ofInt(view.getMeasuredHeight(), +300);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = val;
                view.setLayoutParams(layoutParams);
            }
        });
        anim.setDuration(800);
        anim.start();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                slideDecrease(logo_img, 400);
                handler.removeCallbacksAndMessages(null);
            }
        }, 800);

    }

    public void slideDecrease(final ImageView view, int v1) {
        ValueAnimator anim = ValueAnimator.ofInt(view.getMeasuredHeight(), +250);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = val;
                view.setLayoutParams(layoutParams);
            }
        });
        anim.setDuration(500);
        anim.start();

        wudu_text.setVisibility(View.VISIBLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                endIndex = myImageList.length - 1;
                textMethod();
                nextImage(3000);
                performing_wudu.setVisibility(View.GONE);
                handler.removeCallbacksAndMessages(null);
            }
        }, 2000);


    }

    public void nextImage(final int time) {
        animationImage.setImageResource(myImageList[currentIndex]);
        currentIndex++;
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentIndex > endIndex) {
                    currentIndex = 0;
                    reStart.setVisibility(View.VISIBLE);
                    handler.removeCallbacksAndMessages(null);
                } else {
                    if (currentIndex == 1 || currentIndex == 15 || currentIndex == 27 ||
                            currentIndex == 39 || currentIndex == 50 || currentIndex == 80||
                            currentIndex == 99){
                        textMethod();
                    }
                    nextImage(250);
                }
            }
        }, time);
    }

    public void textMethod(){

//        slide(slideImg, +2500);
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                ViewGroup.LayoutParams params = slideImg.getLayoutParams();
//                params.height = 0;
//                params.width = 2500;
//                slideImg.setLayoutParams(params);
//                handler.removeCallbacksAndMessages(null);
//            }
//        }, 150);
        if (currentIndex <1){
            step_num.setText("1");
            text_title.setText("Starting Supplication");
            text_details.setText("Make niyyah (intention) to perform wudu. By saying,");
            text_explain.setText("I am performing wudu for the pleasure of Allah and to seek closeness to him.”");
        }else if (currentIndex <15){
            step_num.setText("2");
            text_title.setText("Washing Hands");
            text_details.setText("Wash both hands up to the wrists three times. Make sure you wash between your fingers.");
            text_explain.setText("");
        }else if (currentIndex <27){
            step_num.setText("3");
            text_title.setText("Washing Mouth");
            text_details.setText("Take water into your right hand and rinse your mouth three times.");
            text_explain.setText("");
        }else if (currentIndex <39){
            step_num.setText("4");
            text_title.setText(" Cleaning Nose");
            text_details.setText("Take water into your right hand and rinse your nose three times.");
            text_explain.setText("");
        }else if (currentIndex <50){
            step_num.setText("5");
            text_title.setText("Washing Face");
            text_details.setText("Take water into both hands and wash your full face three times. Make sure you wash your whole face from your ears to your chin.");
            text_explain.setText("");
        }else if (currentIndex <80){
            step_num.setText("6");
            text_title.setText("Washing Arms");
            text_details.setText("Wash your right arm from the wrist to the elbow three times. Then do the same for the left arm.");
            text_explain.setText("");
        }else if (currentIndex <99){
            step_num.setText("7");
            text_title.setText("Washing Head & Ears");
            text_details.setText("Wet your hands and then wipe your head once, " +
                    "from the forehead moving towards the back of the head. Wipe your neck by using the back of your hands. Then clean your ears inside and out.");
            text_explain.setText("");
        }else {
            step_num.setText("8");
            text_title.setText("Washing Feet");
            text_details.setText("Finally, wash the right foot between the toes and up to the ankles three times. Then repeat this step for the left foot");
            text_explain.setText("");
        }
        slideRight(steps_view);
        slideLeft(wudu_guide, 500);
        slideLeft(text_parent, 700);
//        wudu_guide.startAnimation(outToLeftAnimation());
    }

    public void slideRight(View view){
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                view.getWidth(),                 // toXDelta
                0,  // fromYDelta
                0);                // toYDelta
        animate.setDuration(700);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    // slide the view from its current position to below itself
    public void slideLeft(View view, int duration){
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                view.getWidth(),                 // toXDelta
                0,  // fromYDelta
                0);                // toYDelta
        animate.setDuration(0);
        animate.setFillAfter(true);

        view.startAnimation(animate);
        animate = new TranslateAnimation(
                view.getWidth(),                 // fromXDelta
                0,                 // toXDelta
                0,  // fromYDelta
                0);                // toYDelta
        animate.setDuration(duration);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }
}