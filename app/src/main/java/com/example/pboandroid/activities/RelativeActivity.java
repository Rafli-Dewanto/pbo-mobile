package com.example.pboandroid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pboandroid.R;
import com.example.pboandroid.utils.AppBar;

public class RelativeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        AppBar.setupActionBar(this, "Relative Activity", HomeActivity.class);

        Spinner spinner = findViewById(R.id.provinsi);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sampleProvinsi, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        hasilTextView = findViewById(R.id.hasil);
        Button button = findViewById(R.id.tombol);

        button.setOnClickListener(v -> {
            String selectedProvinsi = spinner.getSelectedItem().toString();
            hasilTextView.setText(selectedProvinsi);
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}