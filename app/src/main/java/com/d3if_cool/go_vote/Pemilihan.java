package com.d3if_cool.go_vote;

/**
 * Created by jamiemegaputra on 2/23/18.
 */

public class Pemilihan {
    private String id, nama;
    private int status;

    public Pemilihan(String id, String nama, int status) {
        this.id = id;
        this.nama = nama;
        this.status = status;
    }

    public String getId() { return id; }

    public String getNama() {
        return nama;
    }

    public int getStatus() { return status; }
}
