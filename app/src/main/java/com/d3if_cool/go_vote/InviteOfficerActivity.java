package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InviteOfficerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_officer);
    }

    public void doneInvite (View view) {
        Intent i = new Intent(this, RegVoteActivity.class);
        Toast.makeText(getApplicationContext(),"Berhasil Mengundang",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}
