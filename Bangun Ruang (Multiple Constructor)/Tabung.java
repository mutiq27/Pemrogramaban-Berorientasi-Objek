/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class Tabung {
    public double radius;
    public double tinggi;
    public double volume;
    
    public Tabung (){
        this.radius=7;
        this.tinggi=10;
    }
    
    public Tabung (double radius, double height){
        this.radius=radius;
        this.tinggi=height;
    }
    
    public void SetRadius (double radius){
        this.radius=radius;
    }
    
    public void SetTinggi (double height){
        this.tinggi=height;
    }
    
    public void ComputeAndSetVolume() {
        this.volume=3.14*this.radius*this.radius*this.tinggi;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
