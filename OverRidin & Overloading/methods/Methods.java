/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods;

/**
 *
 * @author USER
 */
import java.util.Arrays;
import java.util.Scanner;
public class Methods {

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int skalar;
        int p = 1;
         
        
        System.out.println("Pilih Operasi Perkalian Vektor: ");
        System.out.println("1. Skalar");
        System.out.println("2. Antar Vektor");
        System.out.println("Masukkan pilihan: (1/2)");
         do{
        int pil = input.nextInt();

            switch (pil) {
                case 1 -> {
                        for (int i =0; i < 3; i++){
                            System.out.println("Masukkan nilai ke-"+(i+1)+": ");
                            array1[i] = input.nextInt();
                        }
                        System.out.println(Arrays.toString(array1));
                        System.out.println("Masukkan nilai skalar: ");
                        skalar = input.nextInt();
                        Vektor3 vektor = new Vektor3(array1, skalar);
                        vektor.scalar();
                        System.out.println(Arrays.toString(vektor.getOutput()));
                    }
                case 2 ->{
                        System.out.println("Vektor 1:");
                        for (int i =0; i < 3; i++){
                            System.out.println("Masukkan nilai ke-"+(i+1)+": ");
                            array1[i] = input.nextInt();
                        }           System.out.println(Arrays.toString(array1));
                        System.out.println("Vektor 2: ");
                        for (int i =0; i < 3; i++){
                            System.out.println("Masukkan nilai ke-"+(i+1)+": ");
                            array2[i] = input.nextInt();
                        } System.out.println(Arrays.toString(array2));
                        Vektor3 vektor = new Vektor3(array1, array2);
                        vektor.vektor();
                        System.out.println("Hasil perkalian vektor = "+vektor.getOutput2());
                    }
                default -> {
                    System.out.println("Inputan salah");
                    p=2;
                }
            }
        }while (p==2);
    }
}
