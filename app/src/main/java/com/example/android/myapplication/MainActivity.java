package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button supply_button;
    private Button receive_button;

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

        receive_button = (Button) findViewById(R.id.receiveButton);
        receive_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReceiverForm();
            }
        });
    }

    public void openForm(){
        Intent intent = new Intent(this, SupplyForm.class);
        startActivity(intent);
    }

    public void openReceiverForm(){
        Intent intent= new Intent(this, ReceiverForm.class);
        startActivity(intent);
    }
}
