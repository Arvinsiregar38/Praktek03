/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek03;

/**
 *
 * @author Smekma
 */
public class PesawatAksi3 {
    public static void main(String[] args) {
        Pesawat Iqy = new Pesawat();
        
        Iqy.Maskapai="Citilink";
        Iqy.Type="Boeing 707";
        Iqy.Harga=6500000;
        Iqy.Kelas="Bisnis";
        Iqy.Tujuan="Yogyakarta";
        
        Iqy.cetakInfo();
    }
}
