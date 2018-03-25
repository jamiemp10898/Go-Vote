package com.d3if_cool.go_vote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jamiemegaputra on 2/22/18.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View view) {
        Intent i = new Intent(this, TabActivity.class);
        startActivity(i);
    }

    public void daftar (View view) {
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);
    }
}
