/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

/**
 *
 * @author JARKOM 15
 */
public class Mobil extends Kendaraan{
    int JumlahPintu;

    public Mobil(int JumlahPintu, String NamaPemilik, String NomorPlat, String JenisKendaraan) {
        super(NamaPemilik, NomorPlat, JenisKendaraan);
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }
    
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Jumlah Pintu Mobil" + getJumlahPintu() );
    }
}
