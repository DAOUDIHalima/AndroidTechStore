package com.example.grivviewlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<TechItem> techItemsArrey =new ArrayList<TechItem>();
        techItemsArrey.add(new TechItem("sdd","SDD","512 Go"));
        techItemsArrey.add(new TechItem("videographics","Video Graphi","NVDIA GEFORCE GTX"));

        techItemsArrey.add(new TechItem("videographics2","Video Graphi","NVDIA GEFORCE GTX"));

        ListView shopListView = findViewById(R.id.List_View);
        shopListView.setAdapter(new MyAdapter(this,techItemsArrey));


    }
}