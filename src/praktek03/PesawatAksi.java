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
public class PesawatAksi {
    public static void main(String[] args) {
        Pesawat Arvin = new Pesawat ();
        
        Arvin.Maskapai="Lion Air";
        Arvin.Type="Boeing 737";
        Arvin.Harga=500000;
        Arvin.Kelas="Ekonomi";
        Arvin.Tujuan="Jakarta";
        
        Arvin.cetakInfo();
    }
}
