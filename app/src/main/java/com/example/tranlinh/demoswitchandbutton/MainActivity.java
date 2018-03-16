package com.example.tranlinh.demoswitchandbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> items;
    private ListView listView;
    private ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        items.add(new Item("Iphone"));
        items.add(new Item("Oppo"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        items.add(new Item("samsung"));
        listView = findViewById(R.id.lv_list_item);
        adapter = new ListViewAdapter(this, R.layout.list_view_item, items);
        listView.setAdapter(adapter);
    }

    public void onClickBtnOn(View view) {
        for (Item item : items){
            item.setOn(true);
        }
        adapter.notifyDataSetChanged();
    }

    public void onCLickBtnOff(View view) {
        for (Item item: items){
            item.setOn(false);
        }
        adapter.notifyDataSetChanged();
    }
}
