package com.alice.adminparkingapp.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alice.adminparkingapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Jarak extends AppCompatActivity {
    EditText Jamaks , Jamin;
    Button setJamaks, setJamin;
    FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarak);
        Jamaks = findViewById(R.id.Jamaks);
        Jamin = findViewById(R.id.Jamin);
        setJamaks = findViewById(R.id.setJamaks);
        setJamin = findViewById(R.id.setJamin);

        }

    public void setJamaks(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Jarak").child("JarakMaks");
        myRef.setValue(Jamaks.getText().toString());
    }

    public void setJamin(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Jarak").child("JarakMin");
        myRef.setValue(Jamin.getText().toString());
    }
}
