package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pemilihan> pemilihans = new ArrayList<Pemilihan>();

        pemilihans.add(new Pemilihan("1234", "Pemilihan KM XII-A", R.drawable.open_lock));
        pemilihans.add(new Pemilihan("8732", "Pemilihan Presiden 2018", R.drawable.open_lock));
        pemilihans.add(new Pemilihan("4567","Pemilihan Ketua HIMADIF 17", R.drawable.open_lock));

        PemilihanAdapter itemsAdapter = new PemilihanAdapter(this, pemilihans);
        ListView listView = (ListView) findViewById(R.id.list_pemilihan);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(MainActivity.this, VotingActivity.class);
                    startActivity(intent);
                }else if (i==1){
                    Intent intent = new Intent(MainActivity.this, VerifikasiActivity.class);
                    startActivity(intent);
                }else if (i==2){
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void pemimlihanLainnya (View view) {
        Intent i = new Intent(this, ListPemilihanActivity.class);
        startActivity(i);
    }

    public void voting (View view) {
        Intent i = new Intent(this, VotingActivity.class);
        startActivity(i);
    }

    public void register (View view) {
        Intent i = new Intent(this, RegVoteActivity.class);
        startActivity(i);
    }
}
