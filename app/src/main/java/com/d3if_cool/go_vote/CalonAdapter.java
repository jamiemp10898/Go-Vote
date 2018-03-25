package com.d3if_cool.go_vote;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 22/02/2018.
 */

public class CalonAdapter extends ArrayAdapter<Calon>{

    public CalonAdapter(Context context, ArrayList<Calon> calons) {
        super(context, 0, calons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_calon, parent, false);
        }

        Calon currentCalon = getItem(position);

        TextView nimTextView = (TextView) listItemView.findViewById(R.id.list_id_calon);
        nimTextView.setText(currentCalon.getNim());

        TextView namaTextView = (TextView) listItemView.findViewById(R.id.list_nama_calon);
        namaTextView.setText(currentCalon.getNama());

        ImageView fotoImage = (ImageView) listItemView.findViewById(R.id.list_foto_calon);
        fotoImage.setImageResource(currentCalon.getFoto());

        return listItemView;
    }


}
