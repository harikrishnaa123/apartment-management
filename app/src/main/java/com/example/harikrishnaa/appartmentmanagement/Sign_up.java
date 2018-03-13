package com.example.harikrishnaa.appartmentmanagement;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sign_up extends AppCompatActivity {
    Button b1;
    EditText e,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    Spinner spinner;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
    Firebase fb;
    String Url ="";


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
        spinner=(Spinner)findViewById(R.id.s1);

        Firebase.setAndroidContext(this);

        Url = "https://apartment-management-e4797.firebaseio.com/";
        System.out.println("Bow"+Url);
        fb = new Firebase(Url);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                s1 = e.getText().toString();
                s2 = e1.getText().toString();
                s3 = e2.getText().toString();
                s4 = e3.getText().toString();
                s5 = e4.getText().toString();
                s6 = e5.getText().toString();
                s7 = e6.getText().toString();
                s8 = e7.getText().toString();
                s9 = e8.getText().toString();
                s10 = e9.getText().toString();
                s11 = e10.getText().toString();
                s12 = spinner.getSelectedItem().toString();

                new Signup_Upload_Task().execute();



            }
        });

    }

    public class Signup_Upload_Task extends AsyncTask<String, Integer, String>{

        @Override
        protected String doInBackground(String... strings) {
            final SignUp_Adapters adapters = new SignUp_Adapters();
            adapters.setName(s1);
            adapters.setPhone(s2);
            adapters.setApartment(s3);
            adapters.setFloor(s4);
            adapters.setBlock(s5);
            adapters.setDoor(s6);
            adapters.setUserID(s9);
            adapters.setPass(s10);

           // fb.child("Users").child(s12).child(s3).child(s9).setValue(adapters);

            System.out.println("Input...");

            fb.child("Users").child(s12).child(s3).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    System.out.println("BOw"+dataSnapshot.getChildrenCount());
                    for(DataSnapshot child:dataSnapshot.getChildren()){
                        System.out.println("BOwwww"+child.getKey());
                        if(s9.equals(child.getKey())){
                            Toast.makeText(Sign_up.this, "Already exists...", Toast.LENGTH_SHORT).show();
                        }else{
                            fb.child("Users").child(s12).child(s3).child(s9).setValue(adapters);
                            Intent intent = new Intent(Sign_up.this,AppartmentLogin.class);
                            startActivity(intent);
                        }
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            return null;
        }
    }
}
