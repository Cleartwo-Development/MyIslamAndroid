package com.cleartwo.admin.myislam.ativities.StartSignUp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.Const;

public class StartSignUpActivity extends AppCompatActivity {

    TextView btn_text;
    Button already_text_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_sign_up);

        btn_text = findViewById(R.id.btn_text);
        already_text_btn = findViewById(R.id.next_screen);
        already_text_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn_text.getText().toString().trim().equals("Start")) {
                    already_text_btn.setText("Already have an My Islam account?");
                    btn_text.setText("Sign Up");
                } else {
                    already_text_btn.setText("SignUp?");
                    btn_text.setText("Start");
                }
            }
        });
        ((ImageView) findViewById(R.id.sign_up_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn_text.getText().toString().trim().equals("Start")) {
                    nextToSignUp(ChildNameActivity.class);
                } else {
                    nextToSignUp(SignUpEmailActivity.class);
                }
            }
        });
    }

    public void nextToSignUp(Class aClass) {
        Const.startSignUpActivity = StartSignUpActivity.this;
        startActivity(new Intent(StartSignUpActivity.this, aClass));
        overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
    }
}
