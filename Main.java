/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

/**
 *
 * @author LENOVO
 */
public class Main {
       public static void main(String[] args) {
        //Membuat Objek Mobil
        Mobil BMW = new Mobil (4, "Andi", "B1234XYZ", "Mobil");
        System.out.println("=== Informasi Kendaraan ===");
        BMW.infoKendaraan();
        
         // Membuat spasi agar output lebih rapi
        System.out.println("\n");
        
        //Membuat Objek Motor
        Motor ZX25R = new Motor (true, "Budi", "D5678ABC", "Motor");
        System.out.println("=== Informasi Kendaraan ===");
        ZX25R.infoKendaraan();
        
         // Membuat spasi agar output lebih rapi
        System.out.println("\n");
        
        ZX25R.serviceKendaraan();
        ZX25R.serviceKendaraan("Tune Up");
    }
}