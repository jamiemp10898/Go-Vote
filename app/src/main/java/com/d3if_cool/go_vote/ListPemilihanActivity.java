package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListPemilihanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pemilihan);

        ArrayList<Pemilihan> pemilihans = new ArrayList<Pemilihan>();

        pemilihans.add(new Pemilihan("732188","Pemilihan Ketua RT", R.drawable.open_lock));
        pemilihans.add(new Pemilihan("4264", "Pemilihan Ketua BEM FIT", R.drawable.lock));
        pemilihans.add(new Pemilihan("8647", "Pemilihan Gubernur Jawa Barat", R.drawable.lock));

        PemilihanAdapter itemsAdapter = new PemilihanAdapter(this, pemilihans);
        ListView listView = (ListView) findViewById(R.id.list_pemilihan);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(ListPemilihanActivity.this, VotingActivity.class);
                    startActivity(intent);
                }else if (i==1){
                    Intent intent = new Intent(ListPemilihanActivity.this, InputDataVoters.class);
                    startActivity(intent);
                }else if (i==2){
                    Intent intent = new Intent(ListPemilihanActivity.this, InputDataVoters.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void pemimlihanDiikuti (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void register (View view) {
        Intent i = new Intent(this, RegVoteActivity.class);
        startActivity(i);
    }
}
