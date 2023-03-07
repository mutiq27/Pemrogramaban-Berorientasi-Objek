/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulator;

/**
 *
 * @author USER
 */


public class operator {
    public double angka1;
    public double angka2;
    
    public double plus(double nilai1, double nilai2){
      this.angka1=nilai1;
      this.angka2=nilai2;
      double hasil= angka1 + angka2;
      return hasil;
    }
    public double substract(double nilai1, double nilai2){
      this.angka1=nilai1;
      this.angka2=nilai2;
      double hasil=angka1 - angka2;
      return hasil;
    }
    public double multiple(double nilai1, double nilai2){
      this.angka1=nilai1;
      this.angka2=nilai2;
      double hasil=angka1 * angka2;
      return hasil;
    }
    public double divide(double nilai1, double nilai2){
      this.angka1=nilai1;
      this.angka2=nilai2;
      double hasil=angka1 / angka2;
      return hasil;
    }
}
