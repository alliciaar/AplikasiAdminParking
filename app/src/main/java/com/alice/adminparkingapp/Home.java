package com.alice.adminparkingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alice.adminparkingapp.Model.Jarak;

public class Home extends AppCompatActivity {
    CardView GetLocation;
    CardView CheckIn;
    CardView CheckOut;
    CardView Jarak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CheckIn = (CardView)findViewById(R.id.CheckIn);
        CheckOut = (CardView)findViewById(R.id.CheckOut);
        GetLocation = (CardView)findViewById(R.id.GetLocation);
        Jarak = (CardView) findViewById(R.id.Jarak);

        CheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,CheckIn.class));
            }
        });
        CheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,CheckOut.class));
            }
        });
        GetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, com.alice.adminparkingapp.GetLocation.class));
            }
        });
        Jarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, com.alice.adminparkingapp.Model.Jarak.class));
            }
        });


    }
}
