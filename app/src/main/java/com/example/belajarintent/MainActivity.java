package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.net.Uri;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;
    Button test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        test = (Button)findViewById(R.id.test);
        test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.explicitintent:

                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:

                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(implicit);
                break;
            case R.id.test:

                Intent coba = new Intent(MainActivity.this, TestActivity.class);
                startActivity(coba);
                break;
            default:
                break;
        }
    }
}
