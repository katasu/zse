package com.dabrowski.krzysztof.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    final static private int CAPTURE_IMAGE = 1;
    Button p1, p2, p3, p4, p5;
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
                        t1.setText("KOCHAM ZSE <3");
                        t1.setTextColor(Color.CYAN);
                        t1.setTextSize(52);}});


                p3 =(Button) findViewById(R.id.button10);
                p3.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              File mediaDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Apteka");
                                              File imgFile = new File(mediaDir.getPath() + File.separator + "IMG_" + "RECEPTA_" + ".jpg");
                                              Uri photoURI = FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID + ".provider", getOutputMediaFile());
                                              Uri imgUri = Uri.fromFile(new File(imgFile.getAbsolutePath()));
                                              Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE );
                                              if (Build.VERSION.SDK_INT >= 24) {
                                                  intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                                                  startActivityForResult( intent, CAPTURE_IMAGE);
                                              } else {
                                                  intent.putExtra(MediaStore.EXTRA_OUTPUT, imgUri);
                                                  startActivityForResult( intent, CAPTURE_IMAGE);
                                              }


                                          }
                                      }

                );
                t1 = (TextView) findViewById(R.id.textView);
                t1.setVisibility(View.GONE);

                p4= (Button) findViewById(R.id.button11);
                p4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t1.setVisibility(View.GONE);
                        t1.setText("KOCHAM ZSE <3");
                        t1.setTextColor(Color.GRAY);
                        t1.setTextSize(52);}});

                p5 =(Button) findViewById(R.id.button5);
                p5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), scena5.class);
                        startActivity(i);
                    }
                });
            }


                private static File getOutputMediaFile() {
                    File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Apteka");
                    if (!mediaStorageDir.exists()) {
                        if (!mediaStorageDir.mkdirs()) {
                            Log.d("Apteka", "problem z utworzeniem katalogu");
                            return null;
                        }
                    }
                    // Create a media file name
            //        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
            //                .format(new Date());
                    File mediaFile;
                    mediaFile = new File(mediaStorageDir.getPath() + File.separator
                            + "IMG_" + "RECEPTA_" + ".jpg");
                    if (mediaFile.exists()) mediaFile.delete();
                    Log.d("Zdjecie1234567 : ", mediaFile.toString() );
                    return mediaFile;

                }
                protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                    if (requestCode == CAPTURE_IMAGE) {
                        if (resultCode == RESULT_OK) {
                            Intent i = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(i);
                        } else if (resultCode == RESULT_CANCELED) {
                            Log.d("Błąd", "Picture was not taken");
                        } else {
                            Log.d("Błąd", "Picture was not taken");
                        }
                    }
                }
            }
