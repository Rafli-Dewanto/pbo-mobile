package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ListView;

import com.example.pboandroid.R;
import com.example.pboandroid.adapters.NegaraAdapter;

public class NegaraActivity extends AppCompatActivity {

    ListView lvResult;


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
                {"Inggris", "EROPA", "inggris"},
                {"Belanda", "EROPA", "belanda"},
                {"Argentia", "AMERIKA", "argentina"},
                {"Chile", "AMERIKA", "chile"},
                {"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
                {"Uganda", "AFRIKA", "uganda"},
        };

        NegaraAdapter adapter = new NegaraAdapter(NegaraActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}