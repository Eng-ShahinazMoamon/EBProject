package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Repair_City extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair__city);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Button btndone = (Button) findViewById(R.id.btndone);
        btndone.setOnClickListener(this);
    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton) findViewById(radioId);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btndone:
                Intent ll = new Intent(Repair_City.this, Repair_center.class);
                startActivity(ll);
                break;

        }
    }
}