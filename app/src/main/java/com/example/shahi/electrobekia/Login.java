package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener{
    Button button1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        button1 = (Button) findViewById(R.id.btnlog);
        button1.setOnClickListener(this);


    }

    public void onClick(View w) {
        switch (w.getId()) {
            case R.id.btnlog:
                Intent ll = new Intent(Login.this, Rep_Clify_op.class);
                startActivity(ll);
                break;

        }
    }
}