package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.pboandroid.MainActivity;
import com.example.pboandroid.adapters.NegaraAdapter;
import com.example.pboandroid.R;
import com.example.pboandroid.components.DynamicAppBar;


public class NegaraActivity extends AppCompatActivity {

    ListView lvResult;
    private DynamicAppBar dynamicAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);
        lvResult = (ListView) findViewById(R.id.resultListView);

        String[][] dataNegara = new String[][]{
                {"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"},
                {"Italia", "EROPA", "italia"},
                {"Inggris", "EROPA", "inggris"},
                {"Italia", "ASIA", "italia"},
                {"Belanda", "EROPA", "belanda"},
                {"Argentia", "AMERIKA", "argentina"},
                {"Chile", "AMERIKA", "chile"},
                {"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"},
        };

        NegaraAdapter adapter = new NegaraAdapter(NegaraActivity.this, dataNegara);
        lvResult.setAdapter(adapter);

        dynamicAppBar = findViewById(R.id.app_bar);
        dynamicAppBar.setTitle("Negara Activity");
        dynamicAppBar.setBackButtonClickListener(v -> {
            Intent i = new Intent(NegaraActivity.this, HomeActivity.class);
            startActivity(i);
            finish();
        });
    }
}