/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author USER
 */
public class Skripsi extends Buku{
    private String NPM;

    public Skripsi (String judul, String penerbit, int tahun, String penulis, String NPM) {
        super(judul, penerbit, tahun, penulis);
        this.NPM=NPM;
    }
 
    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }
    
    public String ToStringSkripsi() {
        return "Skripsi{" +
                "judul='" + this.getJudul() + '\'' +
                ", penulis='" + getPenulis() + '\'' +
                ", NPM='" + getNPM() + '\'' +
                ", penerbit='" + this.getPenerbit() + '\'' +
                ", tahun=" + this.getTahun() +
                '}';
    }
    
}
