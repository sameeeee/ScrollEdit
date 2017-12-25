package com.example.sameera.scrolledit;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   /* @Override
    protected void onResume() {
        super.onResume();

        AlertDialog.Builder b = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        b.setView(view);
        b.setTitle("Content Management page");

        b.create().show();
    }*/
}
