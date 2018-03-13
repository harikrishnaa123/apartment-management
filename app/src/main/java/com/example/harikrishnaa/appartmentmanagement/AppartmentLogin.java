package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.harikrishnaa.appartmentmanagement.Adapters.SignUp_Adapters;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


public class AppartmentLogin extends AppCompatActivity {
    Button button,button2;
    EditText editText,editText2,editText3;
    TextView login;
    Spinner spinner;
    String t,e1,e2,e3,e4,s10;
    Firebase fb;
    String Url ="";


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

        Firebase.setAndroidContext(this);
        Url = "https://apartment-management-e4797.firebaseio.com/";
        fb = new Firebase(Url);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AppartmentLogin.this,Sign_up.class);
               startActivity(intent);
           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1 = editText.getText().toString();
                e2 = editText2.getText().toString();
                e3 = editText3.getText().toString();
                e4 = spinner.getSelectedItem().toString();
                System.out.println("huuuuuuuuuuu"+e1+"e2"+e2+"e3"+e3+"e4"+e4);

                fb.child("Users").child(e4).child(e3).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        System.out.println("bow"+dataSnapshot.getChildrenCount());
                        if(dataSnapshot.hasChild(e1)){
                            for(DataSnapshot child:dataSnapshot.getChildren()){
                                if(e1.equals(child.getKey())){
                                        SignUp_Adapters adapters = child.getValue(SignUp_Adapters.class);
                                        if(e2.equals(adapters.getPass())){
                                            Toast.makeText(AppartmentLogin.this, "looged in", Toast.LENGTH_SHORT).show();
                                            if(e4.equals("ADMIN")) {


                                                Intent intent = new Intent(AppartmentLogin.this, Date_and_Amount.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                            else{
                                                Intent intent = new Intent(AppartmentLogin.this, User_notice.class);
                                                startActivity(intent);
                                            }
                                            break;
                                        }
                                        else{
                                            Toast.makeText(AppartmentLogin.this, "incorrect password", Toast.LENGTH_SHORT).show();
                                        }



                                }
                                else{
                                Toast.makeText(AppartmentLogin.this, "Invalid User Id", Toast.LENGTH_SHORT).show();
                            }
                        }
                        }

                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        });



    }
}
