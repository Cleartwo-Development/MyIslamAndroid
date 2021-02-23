package com.cleartwo.admin.myislam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;


//public class CustomAdapter extends BaseAdapter {
public class GamesAdapter extends BaseAdapter {
    private Context mContext;
    private final int[] Imageid;

    public GamesAdapter(Context c, int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return Imageid.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = inflater.inflate(R.layout.games_grid, null);

        } else {
            grid = (View) convertView;
        }
        ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
        imageView.setImageResource(Imageid[position]);

        return grid;
    }

}