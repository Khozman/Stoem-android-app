package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {

    private Button supply_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        supply_button = (Button) findViewById(R.id.supplyButton);
        supply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });
    }

    public void openForm(){
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }
}
