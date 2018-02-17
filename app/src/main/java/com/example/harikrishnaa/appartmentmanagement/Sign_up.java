package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity {
    Button b1;
    EditText e,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    Spinner s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b1=(Button)findViewById(R.id.b1);
        e=(EditText)findViewById(R.id.e);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        e5=(EditText)findViewById(R.id.e5);
        e6=(EditText)findViewById(R.id.e6);
        e7=(EditText)findViewById(R.id.e7);
        e8=(EditText)findViewById(R.id.e8);
        e9=(EditText)findViewById(R.id.e9);
        e10=(EditText)findViewById(R.id.e10);
        s1=(Spinner)findViewById(R.id.s1);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Sign_up.this,AppartmentLogin.class);
                startActivity(intent);
            }
        });

    }
}
