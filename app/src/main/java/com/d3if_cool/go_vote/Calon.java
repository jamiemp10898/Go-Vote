package com.d3if_cool.go_vote;

import android.content.Context;
import android.view.View;

/**
 * Created by User on 22/02/2018.
 */

public class Calon {
    private String nim, nama;
    private int foto;

    public Calon(String nim, String nama, int foto) {
        this.nim = nim;
        this.nama = nama;
        this.foto = foto;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getFoto() { return foto; }
}
