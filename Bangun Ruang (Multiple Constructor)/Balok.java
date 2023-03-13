/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class Balok {
    public double panjang;
    public double lebar;
    public double tinggi;
    public double volume;
    
    public Balok(){
        this.panjang=8;
        this.lebar=4;
        this.tinggi=10;
    }
    
    public Balok(double length, double width){
        this.lebar=width;
        this.panjang=length;
        this.tinggi=10;
    }
    public Balok (double length, double width, double height){
        this.panjang=length;
        this.lebar=width;
        this.tinggi=height;
    }
    //methods untuk menampilkan nilai panjang, lebar, tinggi
    public void SetPanjang (double length){
        this.panjang=length;
    }
    public void SetLebar (double width){
        this.lebar=width;
    }
    public void SetTinggi (double height){
        this.tinggi=height;
    }
    
    public void ComputeAndSetVolume(){
        this.volume=this.lebar*this.panjang*this.tinggi;
    }
    
    public double GetVolume(){
        return this.volume;
    }
    
}
