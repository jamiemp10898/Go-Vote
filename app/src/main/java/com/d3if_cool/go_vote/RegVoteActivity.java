package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegVoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_vote);
    }

    public void done (View view) {

        Intent i = new Intent(this, TabActivity.class);
        Toast.makeText(getApplicationContext(),"Berhasil Membuat",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

    public void inputCandidate (View view) {
        Intent i = new Intent(this, InputCandidateActivity.class);
        startActivity(i);
    }

    public void inviteOfficer (View view) {
        Intent i = new Intent(this, InviteOfficerActivity.class);
        startActivity(i);
    }
}
