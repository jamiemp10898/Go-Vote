package com.d3if_cool.go_vote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jamiemegaputra on 2/23/18.
 */

public class PemilihanAdapter extends ArrayAdapter<Pemilihan> {

    public PemilihanAdapter(Context context, ArrayList<Pemilihan> pemilihans) {
        super(context, 0, pemilihans);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_pemilihan, parent, false);
        }

        Pemilihan currentPemilihan = getItem(position);

        TextView idTextView = (TextView) listItemView.findViewById(R.id.list_id_pemilihan);
        idTextView.setText(currentPemilihan.getId());


        TextView namaTextView = (TextView) listItemView.findViewById(R.id.list_nama_pemilihan);
        namaTextView.setText(currentPemilihan.getNama());

        ImageView statusImageView = (ImageView) listItemView.findViewById(R.id.list_status_pemilihan);
        statusImageView.setImageResource(currentPemilihan.getStatus());

        return listItemView;
    }

}
