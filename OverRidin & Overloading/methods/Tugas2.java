/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        penyewaRumah rent = new penyewaRumah();

        
        System.out.println("Menampilkan informasi: ");
        System.out.println("Nama Perumahan: "+rent.getNamaPerumahan());
        System.out.println("Alamat Perumahan: " + rent.getAlamatPerumahan());
        System.out.println("Nama Pemilik Rumah: "+rent.getNamaPemilik());
        System.out.println("Nomer Rumah: "+rent.getNomer());
        System.out.println("Luas Rumah: "+rent.getLuas());
        System.out.println("Fasilitas: \n");
        rent.getFasilitas();
        System.out.println("Nama Penyewa: "+rent.getNama());
        System.out.println("Harga Sewa per-Bulan: Rp "+rent.getHargaSewa());
        System.out.println("Lama Sewa (Bulan): "+rent.getWaktu()+" Bulan");
        System.out.println("Jumlah harga Sewa: Rp "+rent.getHargaSewa(rent.getHargaSewa(),rent.getWaktu()));
        
        System.out.println("\n Apakah ingin merubah data? (Y/N)");
        String jwb1 = input.next().toUpperCase();
        
        if("Y".equals(jwb1)){
            System.out.println("1. Nama Perumahan");
            System.out.println("2. Alamat Perumahan");
            System.out.println("3. Pemilik Rumah");
            System.out.println("4. Nomer Rumah");
            System.out.println("5. Luas Rumah");
            System.out.println("6. Penyewa Rumah");
            System.out.println("7. Harga Sewa (masukkan angka dengan titik)");
            System.out.println("8. Waktu Sewa");
            System.out.println("Pilih [1...8]: ");
            int jwb2 = input.nextInt();
            
            System.out.print("\n Masukkan data: ");
            switch (jwb2) {
                case 1 -> {
                    rent.setNamaPerumahan(input.next());
                }
                case 2 -> {
                    rent.setAlamatPerumahan(input.next());
                }
                case 3 -> {
                    rent.setNamaPemilik(input.next());
                }
                case 4 -> {
                    rent.setNomer(input.next());
                }
                case 5 -> {
                    rent.setLuas(input.next());
                }
                case 6 -> {
                    rent.setNama(input.next());
                }
                case 7 -> {
                    System.out.print("Rp ");
                    rent.setHargaSewa(input.next());
                    
                }
                case 8 -> {
                    rent.setWaktu(input.next());
                }
                default -> {
                    System.out.println("Inputan salah");
                }
                
            }
        System.out.println("\n Menampilkan informasi: ");
        System.out.println("Nama Perumahan: "+rent.getNamaPerumahan());
        System.out.println("Alamat Perumahan: " + rent.getAlamatPerumahan());
        System.out.println("Nama Pemilik Rumah: "+rent.getNamaPemilik());
        System.out.println("Nomer Rumah: "+rent.getNomer());
        System.out.println("Luas Rumah: "+rent.getLuas());
        System.out.println("Fasilitas: \n");
        rent.getFasilitas();
        System.out.println("Nama Penyewa: "+rent.getNama());
        System.out.println("Harga Sewa per-Bulan: Rp "+rent.getHargaSewa());
        System.out.println("Lama Sewa (Bulan): "+rent.getWaktu()+" Bulan");
        System.out.println("Jumlah harga Sewa: Rp "+rent.getHargaSewa(rent.getHargaSewa(),rent.getWaktu()));
            
        }
        
        
    }
    
}
