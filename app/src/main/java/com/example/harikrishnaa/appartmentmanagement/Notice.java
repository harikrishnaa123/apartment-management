package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Notice extends AppCompatActivity {
    Button b9;
    EditText et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        b9=(Button) findViewById(R.id.b9);
        et7=(EditText)findViewById(R.id.et7);
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Notice.this,Queries1.class);
                startActivity(intent);
            }
        });
    }
}
