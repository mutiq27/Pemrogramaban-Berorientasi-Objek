/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class Kubus {
    public int sisi;
    public int volume;
    
    //constructor nama sama dengan class
    public Kubus(int sisi){
        //membedakan refer kemana
        this.sisi = sisi;
    }
    
    public Kubus(){
        //membedakan refer kemana
        this.sisi = 8;
    }
    
    //void krn ga balikin nilai
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public void computeAndSetVolume(){
        //compute volume
        int calculate_vol = this.sisi * this.sisi * this.sisi;
        this.volume = calculate_vol;
    }
    
    //set variabel ada parameter
    public int getVolume(){
        return this.volume;
    }
    
    
}
