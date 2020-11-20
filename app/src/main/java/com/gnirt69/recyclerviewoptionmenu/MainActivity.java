package com.gnirt69.recyclerviewoptionmenu;

//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<RecyclerItem> listItems;
    private Button mButton;
    private int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mButton = (Button) findViewById(R.id.button);

        listItems = new ArrayList<>();
        //Generate sample data

        /* for (int i = 0; i<10; i++) {
            listItems.add(new RecyclerItem("Item " + (i + 1), "Welcome to Torisan channel, this is description of item " + (i+1)));
        }*/

     findViewById(R.id.button).setOnClickListener(v->{

         i++;
         mButton.setText(String.valueOf(i));
         listItems.add(new RecyclerItem("Item " + (i ), "Welcome to Torisan channel, this is description of item " + (i)));
         adapter = new MyAdapter(listItems, this);
         recyclerView.setAdapter(adapter);
     });

        //Set adapter

    }
}
