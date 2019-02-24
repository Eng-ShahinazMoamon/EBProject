package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2 , btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Register");


        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button1);
        btn3 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }
    public void onClick(View w) {
        switch (w.getId()) {

            case R.id.button:
                Intent rr = new Intent(Register.this, Log_Reg_op.class);
                startActivity(rr);
                break;
            case R.id.button1:
                Intent rr1 = new Intent(Register.this, Log_Reg_op.class);
                startActivity(rr1);
                break;
            case R.id.button3:
                Intent rr3 = new Intent(Register.this, Log_Reg_op.class);
                startActivity(rr3);
                break;
        }
    }
}

