/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class LimasSegiEmpat {
    public double sisi; 
    public double tinggi;
    public double volume;
    
   
    public LimasSegiEmpat (double sisi,double tinggi ){
        this.sisi=sisi;
        this.tinggi=tinggi;
    }
    
    public LimasSegiEmpat (){
        this.sisi=7;
        this.tinggi=12;
    }
    
    public void setSisi(double sisi){
        this.sisi=sisi;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume=(this.sisi*this.sisi*this.tinggi)/3;
    }
    public double GetVolume(){
        return this.volume;
    }
    
    
}
