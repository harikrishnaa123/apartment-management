package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class From_date extends AppCompatActivity {

    TextView tv1;
    DatePicker dp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_date);

        tv1=(TextView)findViewById(R.id.tv1);



    }
}
