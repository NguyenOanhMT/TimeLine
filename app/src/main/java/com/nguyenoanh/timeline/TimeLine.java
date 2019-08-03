package com.nguyenoanh.timeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TimeLine extends AppCompatActivity {
    LinearLayoutManager layoutManager;

    RecyclerView recyclerView;
    ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_time_line);

        ArrayList<Item> arrayList = new ArrayList<> ();

        arrayList.add(new Item (
                "User name", "2m 15 ago",
                "188", "200",
                R.drawable.johnny_pic , R.drawable.anh,
                Item.ItemType.ONE_ITEM
        ));
        arrayList.add(new Item (
                "User name", "2m 15 ago","halo halo halo!!!",
                "188", "200",
                R.drawable.johnny_pic ,
                Item.ItemType.TWO_ITEM
        ));
        arrayList.add(new Item (
                "User name", "2m 15 ago",
                "Have 4 connect", R.drawable.johnny_pic , R.drawable.jacob_pic,
                Item.ItemType.THREE_ITEM
        ));

        // data

        arrayList.add(new Item (
                "User name", "2m 15 ago",
                "188", "200",
                R.drawable.jacob_pic , R.drawable.anh2,
                Item.ItemType.ONE_ITEM
        ));
        arrayList.add(new Item (
                "User name", "2m 15 ago","halo halo halo!!!",
                "188", "200",
                R.drawable.jacob_pic ,
                Item.ItemType.TWO_ITEM
        ));
        arrayList.add(new Item (
                "User name", "2m 15 ago",
                "Have 4 connect", R.drawable.jacob_pic , R.drawable.jacob_pic,
                Item.ItemType.THREE_ITEM
        ));

        adapter = new ItemAdapter (arrayList,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager (this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator ());
        recyclerView.setAdapter(adapter);
    }
}
