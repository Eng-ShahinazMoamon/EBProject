package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Log_Reg_op extends AppCompatActivity  implements View.OnClickListener {
    private Button btnreg, btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__reg_op);
        getSupportActionBar().setTitle("Login/Register");

        btnreg = (Button) findViewById(R.id.btnRegister);
        btnlog = (Button) findViewById(R.id.btnlogin);
        btnreg.setOnClickListener(this);
        btnlog.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnRegister:
                Intent rr = new Intent(Log_Reg_op.this, Home_register.class);
                startActivity(rr);
                break;
            case R.id.btnlogin:
                Intent rr1 = new Intent(Log_Reg_op.this, Login.class);
                startActivity(rr1);
                break;
        }
    }
}