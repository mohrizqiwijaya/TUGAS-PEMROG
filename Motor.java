/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projek;

/**
 *
 * @author JARKOM 15
 */
public class Motor extends Kendaraan{
    boolean memilikibox;

    public Motor(boolean memilikibox, String NamaPemilik, String NomorPlat, String JenisKendaraan) {
        super(NamaPemilik, NomorPlat, JenisKendaraan);
        this.memilikibox = memilikibox;
    }
    
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Apakah Motor Memiliki Box" + (memilikibox? "Ya" : "Tidak"));
    }
}
