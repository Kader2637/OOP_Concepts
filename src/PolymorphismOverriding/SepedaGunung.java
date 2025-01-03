/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismOverriding;

/**
 *
 * @author LEGION
 */
public class SepedaGunung extends Sepeda {

    void setGir(int pertambahanGir) {
        super.setGir(pertambahanGir);
        gir = 2 * getGir();

    }

}
