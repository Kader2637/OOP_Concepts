/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author LEGION
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilDiah = new Mobil();
        
        mobilDiah.warna = "pink";
        mobilDiah.tahunProduksi = 1960;
        
        System.out.println("Warna : " + mobilDiah.warna);
        System.out.println("Tahun produksi : " + mobilDiah.tahunProduksi);
    }
}
