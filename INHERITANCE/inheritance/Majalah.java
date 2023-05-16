/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author USER
 */
public class Majalah extends Koleksi{
    
    private String edisi;

    public Majalah(String judul, String penerbit, int tahun, String edisi) {
        super(judul, penerbit, tahun);
        this.edisi=edisi;
    }
 
    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }
    
    public String ToStringMajalah() {
        return "Buku{" +
                "judul='" + this.getJudul() + '\'' +
                ", edisi='" + getEdisi() + '\'' +
                ", penerbit='" + this.getPenerbit() + '\'' +
                ", tahun=" + this.getTahun() +
                '}';
    }
}
