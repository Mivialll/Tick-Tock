package com.example.linghanli.drug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

public class second extends AppCompatActivity {

    private Button yesBtn;
    private Button noBtn;

    private FirebaseFirestore mFireStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mFireStore= FirebaseFirestore.getInstance();

        yesBtn = findViewById(R.id.button5);
        noBtn = findViewById(R.id.button6);

     }
}
