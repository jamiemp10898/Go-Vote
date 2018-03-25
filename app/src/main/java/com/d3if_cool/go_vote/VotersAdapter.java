package com.d3if_cool.go_vote;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by User on 26/02/2018.
 */

public class VotersAdapter extends ArrayAdapter{

    public VotersAdapter(Context context, ArrayList<Voters> voters ) {
        super(context, 0, voters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_voters, parent, false);
        }

        Voters currentVoters = (Voters) getItem(position);

        TextView idTextView = (TextView) listItemView.findViewById(R.id.list_id_voters);
        idTextView.setText(currentVoters.getId());

        TextView namaTextView = (TextView) listItemView.findViewById(R.id.list_nama_voters);
        namaTextView.setText(currentVoters.getNama());

        ImageView fotoImage = (ImageView) listItemView.findViewById(R.id.list_foto_voters);
        fotoImage.setImageResource(currentVoters.getFoto());

        return listItemView;
    }
}
