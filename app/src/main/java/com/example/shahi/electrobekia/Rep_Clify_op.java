package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rep_Clify_op extends AppCompatActivity  implements View.OnClickListener{
 Button btnsell,btnrep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep__clify_op);
        btnsell = (Button) findViewById(R.id.btnselling);
        btnrep = (Button) findViewById(R.id.btnrep);
        btnsell.setOnClickListener(this);
        btnrep.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnselling:
                Intent rr = new Intent(Rep_Clify_op.this, Main_Classify.class);
                startActivity(rr);
                break;
            case R.id.btnrep:
                Intent rr1 = new Intent(Rep_Clify_op.this, Repair_City.class);
                startActivity(rr1);
                break;
        }
    }
}
