/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingMatematika;

/**
 *
 * @author LEGION
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        System.out.println("\n====== Pertambahan =======");
        System.out.printf("Hasil pertambahan: %.1f%n", mtk.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Hasil pertambahan: " + mtk.pertambahan(12, 28, 14));
        System.out.println("Hasil pertambahan: " + mtk.pertambahan(23, 34));
        System.out.printf("Hasil pertambahan: %.1f%n", mtk.pertambahan(3.4, 4.9));
    }
}