package com.d3if_cool.go_vote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by User on 04/03/2018.
 */

public class DataVoters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_voters);
    }

    public void verifikasi (View view) {
        Intent i = new Intent(this, VerifikasiActivity.class);
        Toast.makeText(getApplicationContext(),"Memverifikasi",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}
