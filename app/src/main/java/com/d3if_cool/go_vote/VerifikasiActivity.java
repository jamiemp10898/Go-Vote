package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class VerifikasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi);

        ArrayList<Voters> voters = new ArrayList<Voters>();

        voters.add(new Voters("Doko Handoko","6706162119","081320142874","Jl. Gatot Subroto Kiaracondong Bandung Jawa Barat", R.drawable.foto4));
        voters.add(new Voters("Hilsat", "6706164002", "081321746297", "Tangerang", R.drawable.user));
        voters.add(new Voters("Mumaenah", "6706160107", "08906297227", "Sumedang" ,R.drawable.user));

        VotersAdapter itemsAdapter = new VotersAdapter(this, voters);
        ListView listView = (ListView) findViewById(R.id.list_voters);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==i){
                    Intent intent = new Intent(VerifikasiActivity.this, DataVoters.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void selesai (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
