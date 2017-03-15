package com.dabrowski.krzysztof.myapplication;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;


public class scena3 extends AppCompatActivity {
    Button p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena3);
        p1 =(Button) findViewById(R.id.button3);
        p1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                      startActivity(i);

                                  }
                              }

        );
    }}
