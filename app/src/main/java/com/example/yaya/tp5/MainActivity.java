package com.example.yaya.tp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnsvg(View view) {

        EditText nom=(EditText)findViewById(R.id.editnom);
        EditText prenom=(EditText)findViewById(R.id.editprenom);
         int n=nom.getText().length();
        int p=prenom.getText().length();
        if(n==0 || p==0){
            Toast.makeText(this,"nom et prenom est vide ",Toast.LENGTH_LONG).show();

        }
else {


            Intent myintent = new Intent(this, Main2Activity.class);

            myintent.putExtra("nom", nom.getText().toString());
            myintent.putExtra("prenom", prenom.getText().toString());


            startActivity(myintent);
        }
    }

    public void annuler(View view) {
        finish();
    }
}
