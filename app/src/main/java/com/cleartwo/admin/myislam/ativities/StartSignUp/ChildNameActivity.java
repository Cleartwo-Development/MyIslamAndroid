package com.cleartwo.admin.myislam.ativities.StartSignUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.DataProcessor;

public class ChildNameActivity extends AppCompatActivity {

    EditText edit_text;
    DataProcessor dataProcessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiled_name);

        edit_text = findViewById(R.id.edit_text);
        dataProcessor = new DataProcessor(this);


        ((ImageView) findViewById(R.id.next_screen)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = edit_text.getText().toString().trim();
                if (strName.isEmpty())
                    edit_text.setError("First Name Please");
                else {
                    Const.profileName = strName;
                    dataProcessor.setStr("name", strName);
                    nextToSignUp(ChildAvatarActivity.class);
                }
            }
        });
    }

    public void nextToSignUp(Class aClass) {
        Const.childNameActivity = ChildNameActivity.this;
        startActivity(new Intent(ChildNameActivity.this, aClass));
        overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
    }
}
