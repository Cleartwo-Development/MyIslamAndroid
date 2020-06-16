package com.cleartwo.admin.myislam.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.ProphetWordSearchActivity;

public class WordSearchAdapter extends BaseAdapter {
    ProphetWordSearchActivity context;
    String strChar[];
    LayoutInflater inflter;

    public WordSearchAdapter(ProphetWordSearchActivity applicationContext, String[] strChar) {
        this.context = applicationContext;
        this.strChar = strChar;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return strChar.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.text_layout_file, null); // inflate the layout
        final TextView textView = (TextView) view.findViewById(R.id.strWords); // get the reference of ImageView
        textView.setText(strChar[i]); // set logo images
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setBackgroundColor(Color.GREEN);
                context.selectedText = context.selectedText + strChar[i];
                Toast.makeText(context, context.selectedText, Toast.LENGTH_SHORT).show();
                context.matchWords();
            }
        });
        return view;
    }
}