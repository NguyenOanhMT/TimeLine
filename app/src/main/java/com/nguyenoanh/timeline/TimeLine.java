package com.nguyenoanh.timeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TimeLine extends AppCompatActivity {

    ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_time_line);

        ArrayList<Item> arrayList = new ArrayList<> ();

        Item child1 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic , R.drawable.anh,
                Item.ItemType.ONE_ITEM);
        Item child2 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string.have_connect) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic ,
                Item.ItemType.TWO_ITEM);
        Item child3 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string.have_connect) ,
                R.drawable.johnny_pic ,R.drawable.jacob_pic,
                Item.ItemType.THREE_ITEM);

        // add data
        arrayList.add(child1);
        arrayList.add(child2);
        arrayList.add(child3);

        arrayList.add(child1);
        arrayList.add(child2);
        arrayList.add(child3);

        arrayList.add(child1);
        arrayList.add(child2);

        adapter = new ItemAdapter (arrayList,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager (this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator ());
        recyclerView.setAdapter(adapter);
    }
}
