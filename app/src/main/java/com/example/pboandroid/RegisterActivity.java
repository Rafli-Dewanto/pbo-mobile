package com.example.pboandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText, emailEditText, phoneEditText;
    private RadioButton maleRadioButton;
    private List<Map<String, String>> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize views
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        maleRadioButton = findViewById(R.id.maleRadioButton);
        RadioButton femaleRadioButton = findViewById(R.id.femaleRadioButton);
        Button registerButton = findViewById(R.id.registerButton);
        Button loginButton = findViewById(R.id.loginButton);

        // Initialize user list
        userList = new ArrayList<>();

        // Register button click listener
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user input values
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String gender = maleRadioButton.isChecked() ? "Male" : "Female";

                // Create a map to store user data
                Map<String, String> user = new HashMap<>();
                user.put("username", username);
                user.put("password", password);
                user.put("email", email);
                user.put("phone", phone);
                user.put("gender", gender);

                // Add the user to the list
                userList.add(user);

                // Display a toast message indicating successful registration
                Toast.makeText(RegisterActivity.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                Intent pindahActivity = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(pindahActivity);
                finish();
            }
        });

        // Login button click listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // You can handle the login functionality here or navigate to the login activity
                Toast.makeText(RegisterActivity.this, "Login button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

