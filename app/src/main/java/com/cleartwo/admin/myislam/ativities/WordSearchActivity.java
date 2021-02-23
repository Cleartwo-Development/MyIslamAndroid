package com.cleartwo.admin.myislam.ativities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.adapter.WordSearchAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordSearchActivity extends AppCompatActivity {

    public GridView simpleGrid;
    public List<Integer> intArr = new ArrayList<>();
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
    int already = -1;
    public TextView[] textView = new TextView[12];
    public String strNames[] = {
            "ADAM", "ISA", "MUSA", "YAHYA",
            "IBRAHIM", "ISMAIL", "NUH", "YAQUB",
            "IDREES", "MUHAMMAD", "SULEIMAN", "YUSUF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_search);

        ((ImageView) findViewById(R.id.back_to_game)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });

        initBottomView();
        initView();
        showDialog(this);
    }

    private void initBottomView() {

        ((ImageView) findViewById(R.id.tryAgain)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                undoMethod();
//                selectedText = "";
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

    public void undoMethod() {
        if (selectedText.length() > 0 && intArr.size() > 0) {
            TextView et = (TextView) simpleGrid.getChildAt(intArr.get(intArr.size() - 1)).findViewById(R.id.strWords);
            et.setBackgroundResource(R.color.colorWhite);
            intArr.remove(intArr.size() - 1);
            selectedText = removeChar(selectedText, selectedText.length() - 1);
        }
    }

    public String removeChar(String str, Integer n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    @SuppressLint("ClickableViewAccessibility")
    private void initView() {
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        WordSearchAdapter customAdapter = new WordSearchAdapter(WordSearchActivity.this, strChar);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView

        simpleGrid.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float currentXPosition = event.getX();
                float currentYPosition = event.getY();
                int position = simpleGrid.pointToPosition((int) currentXPosition, (int) currentYPosition);


                if (already != position && position > -1) {
                    Log.e("simpleGridPosition", " " + position);
                    already = position;
                    TextView et = (TextView) simpleGrid.getChildAt(position).findViewById(R.id.strWords);
                    et.setBackgroundResource(R.color.transparentBlue);
                    selectedText = selectedText + strChar[position];
                    Toast.makeText(WordSearchActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                    intArr.add(position);
                    matchWords();
                }

                return false;
            }
        });
    }

    public void matchWords() {
        boolean forResult = true;
        for (int i = 0; i < strNames.length; i++) {
            if (selectedText.equals(strNames[i])) {
                textView[i].setTextColor(Color.GREEN);
                Toast.makeText(WordSearchActivity.this, "Heartfelt congratulations to you.", Toast.LENGTH_SHORT).show();
                selectedText = "";
            }
            if (textView[i].getCurrentTextColor() != Color.GREEN){
                forResult = false;
            }
        }
        if (forResult){
            showResultDialog(this);
        }
    }

    public void showDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.skip_word_srch);

        ((View) dialog.findViewById(R.id.skip_txt)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((View) dialog.findViewById(R.id.lets_go)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog2(activity);
                dialog.dismiss();
            }
        });
        dialog.show();

    }

    public void showDialog2(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.guid_word_srch);

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

    @SuppressLint("SetTextI18n")
    public void showResultDialog(Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.srch_rslt_dialog);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        ((View) dialog.findViewById(R.id.next_puzzle)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
            }
        });

        dialog.show();

    }
}
