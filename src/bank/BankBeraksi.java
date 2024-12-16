/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author LEGION
 */

public class BankBeraksi {
    public static void main(String[] args) {
        Bank bk =  new Bank(100000);
        bk.getSaldo();
        bk.simpanSaldo(500000);
        bk.ambilSaldo(150000);
    }
}
