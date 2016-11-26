package com.example.aw.adapps.Model;

/**
 * Created by AW on 11/26/2016.
 */

public class Developer {

    private int id;
    private String nama;

    public Developer(){}

    public Developer(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
