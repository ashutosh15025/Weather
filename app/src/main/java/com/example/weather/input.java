package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

    }

    public void nextpage(View view) {
        Intent intent =new Intent(input.this,page2.class);
        EditText city=findViewById(R.id.city);
        EditText country=findViewById(R.id.country);
        intent.putExtra("city",city.getText().toString().trim());
        intent.putExtra("country",country.getText().toString().trim());
        startActivity(intent);
    }
}