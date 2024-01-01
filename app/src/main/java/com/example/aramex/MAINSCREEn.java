package com.example.aramex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MAINSCREEn extends AppCompatActivity {
    Button ADMIN;
    Button USER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        ADMIN =(Button) findViewById(R.id.ADMIN);
        USER =(Button) findViewById(R.id.ADMINBTN);

        ADMIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MAINSCREEn.this, Admindash.class);
                startActivity(intent);

                USER.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MAINSCREEn.this, Userdash.class);
                        startActivity(intent);
                    }
                });
            }}}}