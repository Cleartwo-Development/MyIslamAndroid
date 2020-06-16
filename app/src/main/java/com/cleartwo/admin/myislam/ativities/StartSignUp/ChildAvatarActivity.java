package com.cleartwo.admin.myislam.ativities.StartSignUp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.MainActivity;
import com.cleartwo.admin.myislam.utilities.Const;

public class ChildAvatarActivity extends AppCompatActivity {

    ImageView avatar_img;
    int[] imgDrawables = {R.drawable.girl_logo,
            R.drawable.boy_logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_avatar);

        avatar_img = (ImageView) findViewById(R.id.avatar_img);
        ((ImageView) findViewById(R.id.left_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseImagAvatar();
            }
        });
        ((ImageView) findViewById(R.id.right_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseImagAvatar();
            }
        });

        ((View) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });
        ((View) findViewById(R.id.next_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextToSignUp(MainActivity.class);
            }
        });
    }

    public void nextToSignUp(Class aClass) {
        try {
            Const.startSignUpActivity.finish();
            Const.childNameActivity.finish();
            Const.signUpEmailActivity.finish();
        } catch (Exception e) {

        }
        startActivity(new Intent(ChildAvatarActivity.this, aClass));
        overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
        finish();
    }

    public void chooseImagAvatar() {
        if (avatar_img.getDrawable().getConstantState() ==
                ContextCompat.getDrawable(this, imgDrawables[0]).getConstantState()) {
            avatar_img.setImageResource(imgDrawables[1]);
            Const.profileIcon = imgDrawables[1];
        } else {
            avatar_img.setImageResource(imgDrawables[0]);
            Const.profileIcon = imgDrawables[0];
        }

    }
}
