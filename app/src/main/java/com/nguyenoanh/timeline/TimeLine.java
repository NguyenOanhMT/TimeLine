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

        ItemLine line = new ItemLine (R.color.colorWhite, R.color.yellow,R.color.yellow);

        ItemLine line1 = new ItemLine (R.color.yellow,R.color.blue ,R.color.blue);
        ItemLine line2 = new ItemLine(R.color.blue,R.color.blue_green ,R.color.blue_green);
        ItemLine line3 = new ItemLine (R.color.blue_green,R.color.pink ,R.color.pink);
        ItemLine line4 = new ItemLine (R.color.pink,R.color.yellow ,R.color.yellow);

        ArrayList<Item> arrayList = new ArrayList<> ();
        ArrayList<ItemLine> arrayListLine = new ArrayList<> ();
        Item child1 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic , R.drawable.anh,
                line,
                Item.ItemType.ONE_ITEM);
        Item child2 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string.have_connect) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic ,
                line1,
                Item.ItemType.TWO_ITEM);
        Item child3 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string.have_connect) ,
                R.drawable.johnny_pic ,R.drawable.jacob_pic,
                line2,
                Item.ItemType.THREE_ITEM);
        Item child4 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic , R.drawable.anh1,
                line3,
                Item.ItemType.ONE_ITEM);
        Item child5 = new Item (
                getResources ().getString(R.string.user_name),
                getResources ().getString(R.string.time) ,
                getResources ().getString(R.string._199),
                getResources ().getString(R.string._100),
                R.drawable.johnny_pic , R.drawable.anh5,
                line4,
                Item.ItemType.ONE_ITEM);

        // add data
        arrayList.add(child1);
        arrayList.add(child2);
        arrayList.add(child3);
        arrayList.add(child4);
        arrayList.add(child5);


//        for (int i=0; i < arrayList.size (); i++){
//            if (i == 0){
//                arrayListLine.add(new ItemLine (R.color.colorWhite, R.color.yellow,R.color.yellow));
//            } else{
//                switch (i%4){
//                    case 1:
//                        arrayListLine.add(line1);
//                        break;
//                    case 2:
//                        arrayListLine.add(line2);
//                        break;
//                    case 3:
//                        arrayListLine.add(line3);
//                        break;
//                    case 0:
//                        arrayListLine.add(line4);
//                        break;
//                }
//            }
//        }

        adapter = new ItemAdapter (arrayList,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager (this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator ());
        recyclerView.setAdapter(adapter);
    }
}
