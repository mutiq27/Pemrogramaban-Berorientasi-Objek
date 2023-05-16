/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author USER
 */
public class Perumahan {
    protected String nama;
    protected String alamat;
    
    public Perumahan(){
        this.nama = "Perumahan Bluru Kidul";
        this.alamat = "Desa Bluru Kidul Sidoarjo";
    }
    
    public Perumahan(String nama, String alamat ){
        this.nama=nama;
        this.alamat=alamat;
    }
    
    public void setNamaPerumahan(String nama){
        this.nama = nama;
    }
    
    public String getNamaPerumahan(){
        return this.nama;
    }
    
    public void setAlamatPerumahan(String alamat){
        this.alamat = alamat;
    }
    
     public String getAlamatPerumahan(){
        return this.alamat;
    }
    
    public void getFasilitas(){
        System.out.println("1. Satpam yang berjaga selama 24 jam");
        System.out.println("2. Taman di setiap 30 rumah");
        System.out.println("3. Pusat Pelayanan Perumahan");
    }
    
    public void print(){
        System.out.println("Nama Perumahan: "+nama);
        System.out.println("Alamat Perumahan: "+alamat);
    }
}
