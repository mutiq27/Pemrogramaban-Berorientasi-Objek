/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangunruang;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BangunRuang {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int pil;
    
        
        do{

                System.out.println("Pilih Bangun Ruang: ");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Limas Segi Empat");
                System.out.println("5. Bola");
                System.out.println("6. Selesai");
                System.out.print("Masukkan angka 1...5: ");
                pil= input.nextInt();

                switch (pil){
                   case 1 -> {
                       int sisi;
                       
                       System.out.println("Volume Kubus dengan inputan");
                       System.out.print("Masukkan sisi: ");
                       sisi=input.nextInt();
                       Kubus kubus = new Kubus(sisi);
                       kubus.computeAndSetVolume();
                       System.out.println("Kubus dengan sisi " + kubus.sisi +" adalah "+ kubus.getVolume());
                       
                       System.out.println("\nVolume Kubus tanpa inputan");
                       Kubus kubus2 = new Kubus(sisi);
                       kubus2.computeAndSetVolume();
                       System.out.println("Kubus dengan sisi " + kubus2.sisi +" adalah "+ kubus2.getVolume());
                       
                    }
                  
                   case 2 -> {
                       double panjang, lebar, tinggi;
                       System.out.println("\nVolume dengan semua inputan");
                       System.out.print("Masukkan panjang: ");
                       panjang=input.nextDouble();
                       System.out.print("Masukkan lebar: ");
                       lebar=input.nextDouble();
                       System.out.print("Masukkan tinggi: ");
                       tinggi=input.nextDouble();
                       Balok balok = new Balok(panjang,lebar,tinggi);
                       balok.ComputeAndSetVolume();
                       System.out.println("Lebar: "+balok.lebar+" Panjang: "+balok.panjang+" Tinggi: "+balok.tinggi);
                       System.out.println("Volume Balok adalah "+ balok.GetVolume());
                       
                       System.out.println("\nVolume dengan inputan lebar dan panjang");
                       Balok balok2 = new Balok(panjang,lebar);
                       balok2.ComputeAndSetVolume();
                       System.out.println("Lebar: "+balok2.lebar+" Panjang: "+balok2.panjang+" Tinggi: "+balok2.tinggi);
                       System.out.println("Volume Balok adalah "+ balok2.GetVolume());
                       
                       System.out.println("\nVolume tanpa inputan:");
                       Balok balok3 = new Balok();
                       balok3.ComputeAndSetVolume();
                       System.out.println("Lebar: "+balok3.lebar+" Panjang: "+balok3.panjang+" Tinggi: "+balok3.tinggi);
                       System.out.println("Volume Balok adalah "+ balok3.GetVolume()+"\n");
                       
                       
                   }
                   case 3 ->{
                       double tinggi,radius;
                       System.out.println("\nVolume dengan semua inputan");
                       System.out.print("Masukkan tinggi: ");
                       tinggi=input.nextDouble();
                       System.out.print("Masukkan jari-jari: ");
                       radius=input.nextDouble();
                       
                       Tabung tabung = new Tabung (radius,tinggi);
                       tabung.ComputeAndSetVolume();
                       System.out.println("Radius: "+tabung.radius+" Tinggi: "+tabung.tinggi);
                       System.out.println("Volume: "+ tabung.GetVolume()+"\n");
                       
                       System.out.println("\nVolume tanpa inputan:");
                       Tabung tabung2 = new Tabung ();
                       tabung2.ComputeAndSetVolume();
                       System.out.println("Radius: "+tabung2.radius+" Tinggi: "+tabung2.tinggi);
                       System.out.println("Volume: "+ tabung2.GetVolume()+"\n");
                   }
                   case 4->{
                       double height,side;
                       System.out.println("\n Volume dengan inputan: ");
                       System.out.print("Masukkan sisi: ");
                       side=input.nextDouble();
                       System.out.print("Masukkan tinggi: ");
                       height=input.nextDouble();
                       
                       LimasSegiEmpat limas1 = new LimasSegiEmpat(side,height);
                       limas1.ComputeAndSetVolume();
                       System.out.println("Sisi: "+limas1.sisi+" Tinggi: "+limas1.tinggi);
                       System.out.println("Volume: "+limas1.GetVolume());
                       
                       System.out.println("\nVolume tanpa inputan: ");
                       LimasSegiEmpat limas2 = new LimasSegiEmpat();
                       limas2.ComputeAndSetVolume();
                       System.out.println("Sisi: "+limas2.sisi+" Tinggi: "+limas2.tinggi);
                       System.out.println("Volume: "+limas2.GetVolume()+"\n");
                   }
                   case 5->{
                       double radius;
                       System.out.println("\n Volume dengan inputan: ");
                       System.out.print("Masukkan jari-jari bola: ");
                       radius=input.nextDouble();
                       
                       Bola bola1 = new Bola(radius);
                       bola1.ComputeAndSetVolume();
                       System.out.println("Jari-jari: "+bola1.radius);
                       System.out.println("Volume Bola: "+bola1.GetVolume());
                       
                       System.out.println("\nVolume tanpa inputan: ");
                       Bola bola2=new Bola();
                       bola2.ComputeAndSetVolume();
                      System.out.println("Jari-jari: "+bola2.radius);
                      System.out.println("Volume Bola: "+bola2.GetVolume()+"\n");
                   }
                 
                    default -> System.out.println("Selesai");
               }
           }while(pil!=6);
   
    }
}


