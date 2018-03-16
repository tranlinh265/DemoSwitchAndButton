package com.example.tranlinh.demoswitchandbutton;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tranlinh on 17/03/2018.
 */

public class ListViewAdapter extends ArrayAdapter <Item>{
    private Activity activity;
    private ArrayList<Item> items;

    public ListViewAdapter(@NonNull Activity activity, int resource, ArrayList<Item> items) {
        super(activity, resource);
        this.activity = activity;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(R.layout.list_view_item, null);
        TextView textView = (TextView) convertView.findViewById(R.id.tv);
        Switch sw = (Switch) convertView.findViewById(R.id.sw);
        Item item = items.get(position);

        textView.setText(item.getName());
        if(item.isOn()){
            sw.setChecked(true);
        }else{
            sw.setChecked(false);
        }
        return convertView;
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
