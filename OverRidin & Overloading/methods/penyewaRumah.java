/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author USER
 */
public class penyewaRumah extends pemilikRumah {
    
    private String namaPenyewa;
    private String hargaSewa;
    private String waktu;
    
    public penyewaRumah() {
        super();
       this.namaPenyewa = "Noviar";
       this.hargaSewa = "20.000.000";
       this.waktu="15";
    }
    public penyewaRumah(String namaPenyewa, String hargaSewa, String waktu) {
        super();
       this.namaPenyewa = "Noviar";
       this.hargaSewa = "20.000.000";
       this.waktu="15";
    }
    
    public void setNama(String namaPenyewa){
        this.namaPenyewa=namaPenyewa;
    }
    
    public String getNama(){
        return this.namaPenyewa;
    }
    
    public void setHargaSewa(String harga){
        this.hargaSewa=harga;
    }
    
    public String getHargaSewa(){
        return this.hargaSewa;
    }
    
    public void setWaktu(String waktu){
        this.waktu=waktu;
    }
    
    public String getWaktu(){
        return this.waktu;
    }
    
    public int getHargaSewa(String harga, String waktu){
        int price=Integer.parseInt(harga.replaceAll("\\.", ""));
        int time = Integer.parseInt (waktu);
        int hasil = price*time;
        return hasil;
    }
    
    public void print(){
        pemilikRumah Print2 = new pemilikRumah();
        Print2.print();
        System.out.println("Nama Penyewa Rumah: "+this.namaPenyewa);
        System.out.println("Harga Sewa Rumah: "+this.hargaSewa);
        System.out.println("Waktu Sewa: "+this.waktu);
    }    
    
}
