package com.cleartwo.admin.myislam.ativities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.utilities.OtherStrConst;

import static com.cleartwo.admin.myislam.utilities.OtherStrConst.html;

public class TitleDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_details);

        intView();
    }

    private void intView() {
        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);    }
        });

        TextView titleTextView = (TextView) findViewById(R.id.txt_title);
        if(!OtherStrConst.topic_title.equals("")){
            titleTextView.setText(OtherStrConst.topic_title);
            titleTextView.setVisibility(View.VISIBLE);
        }
        ((TextView) findViewById(R.id.title_name)).setText(OtherStrConst.bar_title);
        ((TextView) findViewById(R.id.txt_details)).setText(html);
    }
}
