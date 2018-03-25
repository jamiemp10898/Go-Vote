package com.d3if_cool.go_vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class VotingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        ArrayList<Calon> calon = new ArrayList<Calon>();

        calon.add(new Calon("6706160107","Diki Iskandar" , R.drawable.foto1));
        calon.add(new Calon("6706164007","Jamie Megaputra", R.drawable.foto2));
        calon.add(new Calon("6706162119","Ridwan Junaedi", R.drawable.foto3));

        CalonAdapter itemsAdapter = new CalonAdapter(this, calon);
        ListView listView = (ListView) findViewById(R.id.list_calon);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==i){
                   Intent intent = new Intent(VotingActivity.this, DataCandidate.class);
                   startActivity(intent);
                }
            }
        });

    }
}
