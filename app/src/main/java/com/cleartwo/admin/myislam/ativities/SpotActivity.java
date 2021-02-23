package com.cleartwo.admin.myislam.ativities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;

import java.util.Objects;

public class SpotActivity extends AppCompatActivity {
    ImageView img_1, img_2;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        img_1 = (ImageView) findViewById(R.id.img_1);
        img_2 = (ImageView) findViewById(R.id.img_2);

        ((ImageView) findViewById(R.id.back_to_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
                finish();
            }
        });

        ((ImageView) findViewById(R.id.spot_right_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter < 3) {
                    counter++;
                } else {
                    counter = 1;
                }
                methodImg();
            }
        });
        ((ImageView) findViewById(R.id.spot_left_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 1) {
                    counter--;
                } else {
                    counter = 3;
                }
                methodImg();
            }
        });
        ((View) findViewById(R.id.images_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter == 1) {
                    startActivity(new Intent(SpotActivity.this, Spot1Activity.class));
                } else if (counter == 2) {
                    startActivity(new Intent(SpotActivity.this, Spot2Activity.class));
                } else if (counter == 3) {
                    startActivity(new Intent(SpotActivity.this, Spot3Activity.class));
                }
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
            }
        });
        showDialog(this);
    }

    public void methodImg() {
        if (counter == 1) {
            img_1.setImageResource(R.drawable.one_find);
            img_2.setImageResource(R.drawable.one_missing);
        } else if (counter == 2) {
            img_1.setImageResource(R.drawable.two_find);
            img_2.setImageResource(R.drawable.two_missing);
        } else if (counter == 3) {
            img_1.setImageResource(R.drawable.three_find);
            img_2.setImageResource(R.drawable.three_missing);
        }
    }

    public void showDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.skip_dialog);

        ((TextView) dialog.findViewById(R.id.skip_text)).setText("Choose a game to see if you can spot the five differences in each of the pictures");
        ((View) dialog.findViewById(R.id.skip_txt)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((View) dialog.findViewById(R.id.lets_go)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}