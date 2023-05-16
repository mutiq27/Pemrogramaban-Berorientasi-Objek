/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author USER
 */
public class Vektor3 {
    public int[] arrayOfInteger;
    public int[] arrayOfInteger2;
    private int[] output;
    public int output2;
    int y;
    private int value;
    
    public Vektor3 (int[] array1, int value){
        this.arrayOfInteger=  array1;
        this.value=value;
    }
    public Vektor3 (int[] array1, int[] array2){
        this.arrayOfInteger=  array1;
        this.arrayOfInteger2=  array2;
    }
    
    
    public void scalar(){
    this.output = new int[this.arrayOfInteger.length];
    for (int i = 0; i < this.arrayOfInteger.length; i++){
        this.output[i] = this.arrayOfInteger[i] * this.value;
    }
}

    
    public void vektor(){
        int[] vektor1 = getArray();
        int[] vektor2 = getArray2();
        int hasil = 0;
        for (int i = 0; i < vektor1.length; i++) {
            hasil += vektor1[i] * vektor2[i];
        }
        this.output2=hasil;  
    }
    
    
    public int[] getArray(){
        return this.arrayOfInteger;
    }
    public int[] getArray2(){
        return this.arrayOfInteger2;
    }
    public int[] getOutput(){
        return this.output;
    }
    public int getOutput2(){
        return this.output2;
    }
    public int getScalar(){
        return this.value;
    }
}
