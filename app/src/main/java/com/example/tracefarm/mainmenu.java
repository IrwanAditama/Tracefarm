package com.example.tracefarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tracefarm.login.Petani_login;
//import com.example.tracefarm.ui.login.Petani_login;

public class mainmenu extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button1 = findViewById(R.id.ptn);
    Button button2 = findViewById(R.id.kolektor);
    Button button3 = findViewById(R.id.koperasi);
    Button button4 = findViewById(R.id.Pdgbesar);
    Button button5 = findViewById(R.id.buyer);
    Button button6 = findViewById(R.id.fasilitator);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Petani_login();
        }
    });
}

public void Petani_login(){
    Intent intent = new Intent(this, Petani_login.class);
    startActivity(intent);
}
}
