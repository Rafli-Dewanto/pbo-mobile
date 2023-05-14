package com.example.pboandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearActivity extends AppCompatActivity {
    EditText inputNama, inputAlamat;
    TextView hasil;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        inputNama = findViewById(R.id.inputNama);
        inputAlamat = findViewById(R.id.inputAlamat);
        hasil = findViewById(R.id.hasil);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText("Hello nama saya " + inputNama.getText().toString() + " dan alamat saya di " + inputAlamat.getText().toString());
            }
        });

    }
}