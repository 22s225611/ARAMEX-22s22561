package com.example.aramex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Userdash extends AppCompatActivity {

    Button INCOMING;
    Button OUTCOING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        INCOMING =(Button) findViewById(R.id.ADMIN);
        OUTCOING =(Button) findViewById(R.id.ADMINBTN);

        INCOMING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Userdash.this,INCOMING.class);
                startActivity(intent);}});

                OUTCOING.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Userdash.this,OUTCOING.class);
                        startActivity(intent);
                    }
                });
                }}