/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulator;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        operator hitung = new operator();
        Scanner input = new Scanner(System.in);
        double hasil = 0 ; 
        double angka1;
        double angka2;
        int pil;
        int i=0;
       
        System.out.print("Masukan angka: ");
        angka1= input.nextDouble();
         do{
            
            System.out.println("Pilih Operasi ");
            System.out.println("1. penjumlahan (+)");
            System.out.println("2. pengurangan (-)");
            System.out.println("3. perkalian (x)");
            System.out.println("4. pembagian (/)");
            System.out.println("5. Selesai");
            System.out.print("Masukkan angka 1...5: ");
            pil= input.nextInt();
            
            switch (pil){
               case 1 -> {
                   System.out.print("Masukkan angka: ");
                   angka2=input.nextDouble();
                   hasil=hitung.plus(angka1, angka2);
                }
               case 2 -> {
                   System.out.print("Masukkan angka: ");
                   angka2=input.nextDouble();
                   hasil=hitung.substract(angka1, angka2);
                }
               case 3 -> {
                   System.out.print("Masukkan angka: ");
                   angka2=input.nextDouble();
                   hasil=hitung.multiple(angka1, angka2);
                }
               case 4 -> {
                   System.out.print("Masukkan angka: ");
                   angka2=input.nextDouble();
                   hasil=hitung.divide(angka1, angka2);
                }
               case 5 -> {
                   hasil=angka1;
               }
               default -> System.out.println("Inputan tidak sesuai");
           }
             System.out.println("Hasil: " + hasil);
            angka1=hasil;
         }while(pil != 5);
         
        System.out.print("Hasil Akhir: "+hasil);
    }
}
