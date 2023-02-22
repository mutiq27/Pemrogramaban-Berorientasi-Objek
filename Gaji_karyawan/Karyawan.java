/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karyawan;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Karyawan {

    public static void main(String[] args) {
        Gaji gaji = new Gaji();
        
        gaji.name();
        gaji.address();
        gaji.PilDepart();
        gaji.Depart();
        gaji.PilExperience();
        gaji.Experience();
        gaji.PilSkill();
        gaji.Skill();
    
        System.out.println("Nama Karyawan: " + gaji.getName());
        System.out.println("Alamat: "+gaji.getAddress());
        System.out.println("Gaji: " + gaji.Total());
    }
}
