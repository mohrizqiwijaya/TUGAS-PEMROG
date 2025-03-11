/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

/**
 *
 * @author JARKOM 15
 */
public class Main {
    public static void main(String[] args) {
        //Membuat Objek Mobil
        Mobil Avanza = new Mobil (4, "Ranggis", "B 12 CT", "Mobil");
        System.out.println("=== Informasi Kendaraan ===");
        Avanza.infoKendaraan();
        Avanza.serviceKendaraan();
        Avanza.serviceKendaraan("Ganti OLI");
        
        //Membuat Objek Motor
        Motor Vario = new Motor (true, "Ranggis", "B 12 CT", "Motor");
        System.out.println("=== Informasi Kendaraan ===");
        Vario.infoKendaraan();
        Vario.infoKendaraan();
    }
}
