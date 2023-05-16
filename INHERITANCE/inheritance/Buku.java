/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author USER
 */
public class Buku extends Koleksi{
    
    private String penulis;

    public Buku(String judul, String penerbit, int tahun, String penulis) {
        super(judul, penerbit, tahun);
        this.penulis=penulis;
    }
 
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public String ToStringBuku() {
        return "Buku{" +
                "judul='" + this.getJudul() + '\'' +
                ", penulis='" + getPenulis() + '\'' +
                ", penerbit='" + this.getPenerbit() + '\'' +
                ", tahun=" + this.getTahun() +
                '}';
    }
}
