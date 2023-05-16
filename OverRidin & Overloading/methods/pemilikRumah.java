/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author USER
 */
public class pemilikRumah extends Perumahan {
    protected String no_Rumah;
    protected String luas;
    protected String namaPemilik;
    
    public pemilikRumah (){
        super();
        this.no_Rumah= "B-07";
        this.namaPemilik = "Mustakim";
        this.luas = "200 m2";
    }
    
    public pemilikRumah (String no_Rumah, String luas, String namaPemilik){
        super();
        this.no_Rumah= no_Rumah;
        this.namaPemilik = namaPemilik;
        this.luas = luas;
    }
    
    public void setNamaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }
    
    public String getNamaPemilik(){
        return this.namaPemilik;
    }
    
    public void setLuas(String Luas){
        this.luas = Luas;
    }
    
    public String getLuas(){
        return this.luas;
    }
    
    public void setNomer(String nomer){
        this.no_Rumah = nomer;
    }
    
    public String getNomer(){
        return this.no_Rumah;
    }
    
    public void print(){
        Perumahan Print1 = new Perumahan();
        Print1.print();
        System.out.println("No. Rumah: "+ this.no_Rumah);
        System.out.println("Luas: "+this.luas);
        System.out.println("Nama Pemilik Rumah:" + this.namaPemilik);
    }    
}
