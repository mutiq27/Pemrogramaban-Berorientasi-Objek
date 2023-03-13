/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class Bola {
    public double radius;
    public double volume;
    
    public Bola(){
        this.radius=14;
    }
    
    public Bola (double radius){
        this.radius=radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public void ComputeAndSetVolume(){
        this.volume=(4*3.14*this.radius*this.radius*this.radius)/3;
    }
    public double GetVolume(){
        return this.volume;
    }
}
