package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Date_and_Amount extends AppCompatActivity {
    Button b5,b6,b13;
    EditText ed11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and__amount);
         b5 = (Button) findViewById(R.id.b5);
         b6=(Button) findViewById(R.id.b6);
        b13=(Button) findViewById(R.id.b13);
        ed11=(EditText)findViewById(R.id.ed11);


        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Date_and_Amount.this,From_date.class);
                startActivity(intent);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Date_and_Amount.this,To_date.class);
                startActivity(intent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Date_and_Amount.this,Notice.class);
                startActivity(intent);
            }
        });

    }
}
