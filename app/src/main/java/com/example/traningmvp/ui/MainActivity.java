package com.example.traningmvp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.traningmvp.R;
import com.example.traningmvp.adapter.CustomAdapter;
import com.example.traningmvp.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_list = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.profile,101, "Andita", "Rahman Abidina", 1994-02-01, "1001A", "1001A", "+628822255"));
        main_list.add(new Model(R.drawable.profile,102, "Sifa", "Rahayu Aminah", 1995-12-21, "1002A", "1002A", "+628822266"));
        main_list.add(new Model(R.drawable.profile,103, "Putri", "Anggun Sari", 1998-06-01, "1003B", "1003B", "+628822277"));
        main_list.add(new Model(R.drawable.profile,104, "Angga", "Putra Maharja", 1992-07-07, "1004B", "1004B", "+628822288"));
        main_list.add(new Model(R.drawable.profile,105, "Restu", "Putra Pangestu", 1993-05-23, "1005B", "1005B", "+628822299"));

        adapter = new CustomAdapter(main_list, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}

