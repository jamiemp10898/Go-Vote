package com.d3if_cool.go_vote;

/**
 * Created by User on 26/02/2018.
 */

public class Voters {
    private String nama, id, noHp, alamat;
    private int foto;

    public Voters(String nama, String id, String noHp, String alamat, int foto) {
        this.nama = nama;
        this.id = id;
        this.noHp = noHp;
        this.alamat = alamat;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getFoto() { return foto; }
}
