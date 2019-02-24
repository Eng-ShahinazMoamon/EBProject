package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Main_Classify extends AppCompatActivity {
     GridLayout gridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__classify);
        getSupportActionBar().setTitle("Classification");

        gridlayout =(GridLayout)findViewById(R.id.glayout);
        setSingleEvent(gridlayout);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i=0; i<mainGrid.getChildCount();i++)
        {
            CardView cardview = (CardView)mainGrid.getChildAt(i);
             final int Class=i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Class==0){
                        Intent class1 = new Intent(Main_Classify.this, Com_list.class);
                        startActivity(class1);
                    }

                    else if (Class==1){
                        Intent class2 = new Intent(Main_Classify.this, Com_list.class);
                        startActivity(class2);
                    }
                    else if (Class==2){
                        Intent class3 = new Intent(Main_Classify.this, Com_list.class);
                        startActivity(class3);
                    }
                    else if (Class==3){
                        Intent class4 = new Intent(Main_Classify.this, Com_list.class);
                        startActivity(class4);
                    }
                    else if (Class==4){
                        Intent class5 = new Intent(Main_Classify.this, Com_list.class);
                        startActivity(class5);
                    }
                    else if (Class==5){
                        Intent class6 = new Intent(Main_Classify.this, Other_cam.class);
                        startActivity(class6);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Please set the card", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
