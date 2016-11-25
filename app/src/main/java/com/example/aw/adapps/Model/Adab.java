package com.example.aw.adapps.Model;

/**
 * Created by AW on 11/24/2016.
 */

public class Adab {
    private int id;
    private String nama;
    private String deskripsi;
    private int urlImage;

    public Adab(){}

    public Adab(int id, String nama, String deskripsi, int urlImage) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.urlImage = urlImage;
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

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }
}
