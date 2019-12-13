package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.myapplication.model.Receiver;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerviewAdapter adapter;
    Database database = new Database();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView = findViewById(R.id.recycler_view);

        List<Receiver> receivers = database.getAllRecievers(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerviewAdapter(receivers);
        recyclerView.setAdapter(adapter);
    }
}
