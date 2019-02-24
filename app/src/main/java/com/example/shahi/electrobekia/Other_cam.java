package com.example.shahi.electrobekia;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Other_cam extends AppCompatActivity implements View.OnClickListener {
    Button btnscan, btnsend;
    private static final int CAMERA_REQUEST = 123;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_cam);
        getSupportActionBar().setTitle("Other Order");

        btnscan = (Button) findViewById(R.id.scan);
        btnsend = (Button) findViewById(R.id.send);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnscan.setOnClickListener(this);
        btnsend.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scan:
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST);
                break;
            case R.id.send:
                Toast.makeText(getApplicationContext(), "Your Order send", Toast.LENGTH_SHORT).show();
                Intent rr = new Intent(Other_cam.this, Main_Classify.class);
                startActivity(rr);
                break;
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}
