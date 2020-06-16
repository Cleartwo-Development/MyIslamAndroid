package com.cleartwo.admin.myislam.ativities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.WordSearchAdapter;

public class ProphetWordSearchActivity extends AppCompatActivity {

    public GridView simpleGrid;
    public String strChar[] = {
            "F", "A", "B", "K", "A", "Y", "M", "N", "N", "I", "O", "N", "G", "I", "P",
            "I", "U", "Y", "L", "A", "L", "A", "H", "A", "U", "S", "A", "U", "P", "M",
            "D", "Y", "S", "H", "F", "M", "T", "Y", "D", "M", "H", "M", "T", "L", "H",
            "R", "Q", "Y", "U", "I", "I", "B", "R", "A", "H", "I", "M", "A", "B", "Q",
            "E", "A", "T", "E", "Y", "I", "W", "D", "M", "S", "F", "M", "C", "I", "F",
            "E", "P", "L", "W", "W", "P", "A", "N", "M", "Z", "T", "I", "L", "I", "L",
            "S", "U", "S", "N", "Q", "K", "P", "W", "A", "A", "G", "P", "Q", "R", "A",
            "S", "L", "W", "Y", "E", "F", "H", "V", "H", "K", "Y", "U", "I", "I", "A",
            "H", "R", "F", "B", "E", "B", "E", "E", "U", "F", "G", "Z", "X", "X", "S",
            "T", "Z", "Q", "K", "E", "A", "Q", "I", "M", "V", "G", "Y", "X", "Y", "U",
            "M", "N", "K", "W", "U", "W", "U", "U", "E", "B", "U", "Q", "A", "Y", "M",
            "P", "M", "J", "N", "K", "S", "D", "B", "H", "S", "L", "S", "B", "L", "I",
            "Y", "Y", "N", "D", "Q", "P", "H", "W", "R", "H", "F", "C", "A", "K", "Q",
            "A", "X", "Z", "M", "W", "N", "Y", "N", "J", "L", "A", "T", "Q", "F", "J",
            "Z", "I", "S", "A", "F", "X", "H", "T", "M", "F", "A", "P", "E", "X", "C"};

    public String selectedText = "";
    public TextView[] textView = new TextView[12];
    public String strNames[] = {
            "ADAM", "ISA", "MUSA", "YAHYA",
            "IBRAHIM", "ISMAIL", "NUH", "YAQUB",
            "IDREES", "MUHAMMAD", "SULEIMAN", "YUSUF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prophet_word_search);

        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });

        initBottomView();
        initView();
    }

    private void initBottomView() {

        ((TextView) findViewById(R.id.tryAgain)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initView();
                selectedText = "";
            }
        });

        textView[0] = (TextView) findViewById(R.id.ADAM);
        textView[1] = (TextView) findViewById(R.id.ISA);
        textView[2] = (TextView) findViewById(R.id.MUSA);
        textView[3] = (TextView) findViewById(R.id.YAHYA);

        textView[4] = (TextView) findViewById(R.id.IBRAHIM);
        textView[5] = (TextView) findViewById(R.id.ISMAIL);
        textView[6] = (TextView) findViewById(R.id.NUH);
        textView[7] = (TextView) findViewById(R.id.YAQUB);

        textView[8] = (TextView) findViewById(R.id.IDREES);
        textView[9] = (TextView) findViewById(R.id.MUHAMMAD);
        textView[10] = (TextView) findViewById(R.id.SULEIMAN);
        textView[11] = (TextView) findViewById(R.id.YUSUF);
    }

    private void initView() {
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        WordSearchAdapter customAdapter = new WordSearchAdapter(ProphetWordSearchActivity.this, strChar);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
//                selectedText = selectedText + strChar[position];
//                Toast.makeText(ProphetWordSearchActivity.this, selectedText, Toast.LENGTH_SHORT).show();
//                matchWords();

            }
        });
    }

    public void matchWords() {
        for (int i = 0; i < strNames.length; i++) {
            if (selectedText.equals(strNames[i])) {
                textView[i].setTextColor(Color.GREEN);
                Toast.makeText(ProphetWordSearchActivity.this, "Heartfelt congratulations to you.", Toast.LENGTH_SHORT).show();
                selectedText = "";
            }
        }
    }
}
