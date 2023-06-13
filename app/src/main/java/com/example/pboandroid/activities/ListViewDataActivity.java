package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.pboandroid.R;
import com.example.pboandroid.adapters.ProgrammingLangAdapter;
import com.example.pboandroid.components.DynamicAppBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewDataActivity extends AppCompatActivity {

    RecyclerView listView;
    DynamicAppBar appBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);
        RecyclerView listView;
        String[] prolang = {
                "Python",
                "Kotlin",
                "Swift",
                "JavaScript",
                "GO",
                "TypeScript",
                "Java"
        };

        listView = findViewById(R.id.programmingListView);

        ProgrammingLangAdapter adapter = new ProgrammingLangAdapter(prolang);
        listView.setAdapter(adapter);
        listView.setLayoutManager(new LinearLayoutManager(this));

        appBar = findViewById(R.id.appbar);
        appBar.setTitle("Programming Language");
        appBar.setBackButtonClickListener(v -> {
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
            finish();
        });
    }
}