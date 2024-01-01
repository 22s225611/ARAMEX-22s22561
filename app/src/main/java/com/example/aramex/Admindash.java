package com.example.aramex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admindash extends AppCompatActivity {
    Button INS;
    Button VIO;
    Button UPDATE;
    Button CLEAR;
    Button DELETE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);
        INS=(Button) findViewById(R.id.bu1);
        VIO=(Button) findViewById(R.id.bu4);
        UPDATE=(Button) findViewById(R.id.bu2);
        CLEAR=(Button) findViewById(R.id.b5);
        DELETE=(Button) findViewById(R.id.bu3);

        INS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admindash.this,INS.class);
                startActivity(intent);}});

    VIO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Admindash.this, VIO.class);
                    startActivity(intent);}});

                    UPDATE.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Admindash.this, UPDATE.class);
                            startActivity(intent);
                        }
                    });


                    CLEAR.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Admindash.this, CLEAR.class);
                            startActivity(intent);
                        }
                    });

                    DELETE.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Admindash.this, DELETE.class);
                            startActivity(intent);
                        }
                    });
                }}