/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

/**
 *
 * @author JARKOM 15
 */
public class Kendaraan {
    String NamaPemilik;
    String NomorPlat;
    String JenisKendaraan;

    public Kendaraan(String NamaPemilik, String NomorPlat, String JenisKendaraan) {
        this.NamaPemilik = NamaPemilik;
        this.NomorPlat = NomorPlat;
        this.JenisKendaraan = JenisKendaraan;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public void setNamaPemilik(String NamaPemilik) {
        this.NamaPemilik = NamaPemilik;
    }

    public String getNomorPlat() {
        return NomorPlat;
    }

    public void setNomorPlat(String NomorPlat) {
        this.NomorPlat = NomorPlat;
    }

    public String getJenisKendaraan() {
        return JenisKendaraan;
    }

    public void setJenisKendaraan(String JenisKendaraan) {
        this.JenisKendaraan = JenisKendaraan;
    }
    
    public void infoKendaraan(){
        System.out.println("Nama Pemilik" + getNamaPemilik());
        System.out.println("Nomor Plat Kendaraan" + getNomorPlat());
        System.out.println("Jenis Kendaraan" + getJenisKendaraan());
    }
    
    public void serviceKendaraan(){
        System.out.println("Service Kendaraan Sedang Di Lakukan");
    }           
    
    public void serviceKendaraan(String JenisServis){
        System.out.println("Servis Jenis" + JenisServis + "Sedang dilakukan");
    }
}
