package com.f52124071.daftargunungsulteng;

public class Gunung {
    private final String nama;
    private final String ketinggian;
    private final String lokasi;
    private final int gambar;

    public Gunung(String nama, String ketinggian, String lokasi, int gambar) {
        this.nama = nama;
        this.ketinggian = ketinggian;
        this.lokasi = lokasi;
        this.gambar = gambar;
    }

    public String getNama() { return nama; }
    public String getKetinggian() { return ketinggian; }
    public String getLokasi() { return lokasi; }
    public int getGambarResId() { return gambar; }
}