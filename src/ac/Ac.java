/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author LEGION
 */
public class Ac implements InterfaceAc {

    int statusAc;
    int statusSuhu;

    public void matikan() {
        if (statusAc == KEADAAN_HIDUP_AC) {
            statusAc = KEADAAN_MATI_AC;
            System.out.println("\nMatikan AC --> Ac telah di matikan ");
        } else {
            System.out.println("\nMatikan AC --> Ac sudah di matikan kok!!!");
        }
    }

    public void hidupkan() {
        if (statusAc == KEADAAN_MATI_AC) {
            statusAc = KEADAAN_HIDUP_AC;
            System.out.println("\nHidupkan AC --> Ac telah di hidupkan ");
        } else {
            System.out.println("\nHidupkan AC --> Ac sudah di hidupkan kok!!!");
        }
    }

    public void dinginkan() {
        if (statusSuhu == KEADAAN_PANAS_AC) {
            statusSuhu = KEADAAN_DINGIN_AC;
            System.out.println("\nDinginkan AC --> Ac telah di dinginkan ");
        } else {
            System.out.println("\nDinginkan AC --> Ac sudah di dinginkan kok!!!");
        }
    }

    public void panaskan() {
        if (statusSuhu == KEADAAN_DINGIN_AC) {
            statusSuhu = KEADAAN_PANAS_AC;
            System.out.println("\nPanaskan AC --> Ac telah di panaskan ");
        } else {
            System.out.println("\nPanaskan AC --> Ac sudah di panaskan kok!!!");
        }
    }
}
