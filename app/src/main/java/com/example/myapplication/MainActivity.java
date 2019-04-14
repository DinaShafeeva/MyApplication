package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

Context context = MainActivity.this;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            RecyclerView recyclerView = findViewById(R.id.RecyclerView);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            RecyclerView.Adapter adapter = new BookAdapter(getMyList(), context);
            recyclerView.setAdapter(adapter);
        }


        public ArrayList<String> getMyList() {
            ArrayList<String> a = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                a.add("Привет, номер " + i + "!");

            }

            return a;
        }
    }
   /* private TextView text;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = findViewById(R.id.btn_click);
        text = findViewById(R.id.text);
        click.setOnClickListener(x -> onClickClicked());

        click.setOnClickListener(view -> {
            Toast.makeText(this, "I clicked", Toast.LENGTH_LONG).show();

        });
        text.setText("My amazing textview");
    }

    public void onClickClicked() {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        //Toast.makeText(this, "I clicked", Toast.LENGTH_SHORT).show();
        *//*String loginText = text.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Login", loginText);
        startActivity(intent);*//*
    }*/

