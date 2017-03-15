package com.dabrowski.krzysztof.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button p1, p2, p3, p4;
    TextView t1;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                p1 =(Button) findViewById(R.id.button13);
                t1 =(TextView) findViewById(R.id.textView);
                p1.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent i = new Intent(getApplicationContext(), scena1.class);
                                              startActivity(i);

                                          }
                                      }

                );

                t1 = (TextView) findViewById(R.id.textView);
                t1.setVisibility(View.GONE);

                p2= (Button) findViewById(R.id.button14);
                p2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t1.setVisibility(View.VISIBLE);


                                          }
                                      }

                );

                p3 =(Button) findViewById(R.id.button10);
                p3.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent i = new Intent(getApplicationContext(), scena3.class);
                                              startActivity(i);

                                          }
                                      }

                );

                p4 =(Button) findViewById(R.id.button11);
                p4.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent i = new Intent(getApplicationContext(), scena4.class);
                                              startActivity(i);

                                          }
                                      }

                );


    }
}
