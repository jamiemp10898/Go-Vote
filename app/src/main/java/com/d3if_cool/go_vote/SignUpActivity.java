package com.d3if_cool.go_vote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jamiemegaputra on 2/22/18.
 */

public class SignUpActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void daftar (View view) {
        Intent i = new Intent(this, LoginActivity.class);
        Toast.makeText(getApplicationContext(),"Berhasil Mendaftar",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

}
