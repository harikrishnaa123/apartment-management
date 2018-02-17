package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AppartmentLogin extends AppCompatActivity {
    Button button,button2;
    EditText editText,editText2,editText3;
    TextView login;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appartment_login);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        login=(TextView)findViewById(R.id.login);
        spinner=(Spinner)findViewById(R.id.spinner);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(AppartmentLogin.this,Sign_up.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(AppartmentLogin.this,Date_and_Amount.class);
                startActivity(intent);
            }
        });
        spinner.getSelectedItem().toString();
    }
}
