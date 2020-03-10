package com.example.mojibapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private int[] images = {R.drawable.mojib_100, R.drawable.mujib100, R.drawable.mujib100, R.drawable.mujib100,
            R.drawable.mojib_100, R.drawable.mujib100, R.drawable.mojib_100};
//    private String[] name = {"Afridid", "Babar_azam", "fakhar_zaman", "hashim_amla",
//            "mahmudullah", "mashrafee", "mushfiqur_rahim",  "sakib", "tamim"};
    private List<Model> cricketerList=new ArrayList<>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        preparedData();

    }

    private void preparedData() {
        for(int i=0;i<images.length;i++)
        {
            cricketerList.add(new Model(images[i])) ;
        }
        RecyclerviewAdapter adapter=new RecyclerviewAdapter(this,cricketerList);
        recyclerView.setAdapter(adapter);

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerId);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }

}