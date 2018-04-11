package com.example.yaya.tp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TransferQueue;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView infonom=(TextView)findViewById(R.id.textView2);
        TextView infoprenom=(TextView)findViewById(R.id.textView3);

        Bundle extras = getIntent().getExtras();
        String nom=extras.getString("nom");
        String prenom=extras.getString("prenom");
        infonom.setText("Nom : "+nom);
        infoprenom.setText("Prénom : "+prenom);

    }
}
