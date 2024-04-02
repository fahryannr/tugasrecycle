package com.example.tugasrecyleview;

public class modelbarang {
    private String namabarang;
    private String deskripsi;
    private String harga;
    private int gambar; //=> mengambil dari list item

    public modelbarang(String namabarang, String deskripsi, String harga, int gambar) {
        this.namabarang = namabarang;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}






