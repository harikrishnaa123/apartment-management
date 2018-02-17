package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class User_notice extends AppCompatActivity {
    Button b19;
    TextView tv19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_notice);
        b19=(Button) findViewById(R.id.b19);
        tv19=(TextView) findViewById(R.id.tv19);

        b19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(User_notice.this,User_queries.class);
                startActivity(intent);
            }
        });
    }
}
