/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class INHERITANCE {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String judul, penerbit;
         int tahun;
         System.out.print("Masukkan Judul: ");
         judul =input.next();
         System.out.print("Masukkan Nama Penerbit: ");
         penerbit =input.next();
         System.out.println("Masukkan Tahun terbit: ");
         tahun = input.nextInt();
         Koleksi collect = new Koleksi(judul, penerbit, tahun);
         collect.setJudul(judul);
         collect.setPenerbit(penerbit);
         collect.setTahun(tahun);
         
         String answer, penulis, edisi;
         
         System.out.println("Apakah Koleksi ini termasuk Buku? (Y/N)");
         answer = input.next().toUpperCase();
         
         if (answer.equalsIgnoreCase("Y")){
            System.out.print("Masukkan nama Penulis: ");
            penulis =input.next();
            Buku book = new Buku(judul, penerbit, tahun, penulis);
            book.setPenulis(penulis);
            
            String answer2, NPM;
             System.out.println("Apakah Buku tersebut merupkan sebuah Skripsi? (Y/N)");
             answer2 = input.next().toUpperCase();
             
             if (answer2.equalsIgnoreCase("Y")){
                 System.out.println("Masukkan NPM Penulis: ");
                 NPM = input.next();
                 Skripsi papper = new Skripsi (judul, penerbit, tahun, penulis, NPM);
                 papper.setNPM(NPM);
                 
                 System.out.println(papper.ToStringSkripsi());
             }
             else{
                 System.out.println(book.ToStringBuku());
             }
             
         }
         else{
             System.out.println("Masukkan Edisi Majalah: ");
             edisi = input.next();
             Majalah magazine = new Majalah (judul, penerbit, tahun, edisi);
             magazine.setEdisi(edisi);
             System.out.println(magazine.ToStringMajalah());
         }
         
         
    }
}
