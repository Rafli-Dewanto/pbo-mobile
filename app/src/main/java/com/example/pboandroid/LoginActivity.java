package com.example.pboandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class LoginActivity extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pindah = findViewById(R.id.pindah);

       pindah.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent pindahActivity = new Intent(LoginActivity.this, LatihanIntentActivity.class);
               startActivity(pindahActivity);
               finish(); // dispose pada desktop
           }
       });
    }
}