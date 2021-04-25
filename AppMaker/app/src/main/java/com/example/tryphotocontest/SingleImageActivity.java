package com.example.tryphotocontest;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SingleImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleimage);

        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
        TextView textView = (TextView)findViewById(R.id.textView2);

        textView.setText(getIntent().getStringExtra("Name"));
        imageView.setImageURI(Uri.parse(getIntent().getStringExtra("Image")));
    }
}