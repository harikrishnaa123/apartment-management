package com.example.harikrishnaa.appartmentmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class User_queries extends AppCompatActivity {
    EditText et20;
    TextView tv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_queries);
        et20=(EditText)findViewById(R.id.et20);
        tv20=(TextView)findViewById(R.id.tv20);
    }
}
