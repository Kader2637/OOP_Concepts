/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GirCar;

/**
 *
 * @author LEGION
 */
public class GirBereaksi {
    public static void main(String[] args) {
        Gir gr = new Gir();
        gr.tambahgir(1);
        System.out.println("Gir Saat ini : " + gr.getgir());
        gr.tambahgir(3);
        System.out.println("Gir saat ini : " + gr.getgir());
    }
}
