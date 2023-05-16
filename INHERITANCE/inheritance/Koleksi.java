/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author USER
 */
public class Koleksi {
    public String judul;
    public String penerbit;
    public int tahun;
    
    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahun = tahun;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String Judul) {
        this.judul = Judul;
    }
    
    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String ToStringKoleksi() {
        return "Buku{" +
                "judul='" + this.getJudul() + '\'' +
                ", penerbit='" + this.getPenerbit() + '\'' +
                ", tahun=" + this.getTahun() +
                '}';
    }
    
    
}
