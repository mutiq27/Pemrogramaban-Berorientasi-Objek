/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.karyawan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Gaji {
    public String nama="A";
    public String alamat = "B";
    public int pil1=0, upah1=0;
    public int pil2=0, upah2=0;
    public int pil3=0, upah3=0;
    public int total;
    
    public void name(){
        System.out.print("Masukkan nama: ");
        nama();
    }
    public String nama(){
        Scanner input = new Scanner(System.in);
        nama = input.nextLine();
        return nama;
    }
    public String getName(){
        return nama;
    }
    public void address(){
        System.out.print("Alamat: ");
        alamat();
    }
    public String alamat(){
        Scanner input = new Scanner(System.in);
        alamat = input.nextLine();
        return alamat;
    }
    public String getAddress(){
        return alamat;
    }
    public void PilDepart () { 
        System.out.println("Departemen:");
        System.out.println("1. IT");
        System.out.println("2. HRD");
        System.out.println("3. Finance");
        System.out.print("Pilih Departemen: ");
        
}
    public int Depart(){
    
    Scanner input = new Scanner(System.in);
    pil1 = input.nextInt();
        switch (pil1){
            case 1 -> upah1 = 8000000;
            case 2 -> upah1 = 5000000;
            case 3 -> upah1= 4000000;
            default -> System.out.println("Input tidak sesuai");
        }
        return upah1;
    }
    
    public void PilExperience(){
        
        System.out.println("Pengalaman: ");
        System.out.println("1. Pemula");
        System.out.println("2. Menengah");
        System.out.println("3. Expert");
        System.out.print("Pilih Tingkat Pengalaman: "); 
    }
    public int Experience(){
    
    Scanner input = new Scanner(System.in);
    pil2 = input.nextInt();
        switch (pil2){
            case 1 -> upah2 = 500000;
            case 2 -> upah2 = 1000000;
            case 3 -> upah2=2000000;
            default -> System.out.println("Input tidak sesuai");
        }
        return upah2;
}
  public void PilSkill () {
        
        System.out.println("Skill:");
        System.out.println("1. Web");
        System.out.println("2. Mobile");
        System.out.println("3. Desktop");
        System.out.print("Pilih Skill: ");
        
}
    public int Skill(){
    
    Scanner input = new Scanner(System.in);
    pil3 = input.nextInt();
        switch (pil3){
            case 1 -> upah3 = 1000000;
            case 2 -> upah3 = 2000000;
            case 3 -> upah3=2500000;
            default -> System.out.println("Input tidak sesuai");
        }
        return upah3;
    };
    
    public  int Total(){
        
        this.total = this.upah1 + this.upah2 + this.upah3;
        return total;
    }
    
    
}
