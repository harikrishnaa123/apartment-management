package com.example.harikrishnaa.appartmentmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Queries1 extends AppCompatActivity {
    EditText ed18;
    TextView tv18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queries1);
        ed18=(EditText)findViewById(R.id.ed18);
        tv18=(TextView)findViewById(R.id.tv18);

        ed18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String s = ed18.getText().toString();
                tv18.setText(s);
                return false;
            }
        });

    }
}