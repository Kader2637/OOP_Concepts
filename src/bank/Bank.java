/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author LEGION
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Bank {

    int saldo;

    public Bank(int saldo) {
        this.saldo = saldo;
    }

    void getSaldo() {
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: " + formatRupiah(saldo));
    }

    void simpanSaldo(int simpan) {
        saldo += simpan;
        System.out.println("\nSimpan uang anda sebesar: " + formatRupiah(simpan));
        System.out.println("Saldo saat ini: " + formatRupiah(saldo));
    }

    void ambilSaldo(int ambil) {
        saldo -= ambil;
        System.out.println("\nAmbil uang anda sebesar: " + formatRupiah(ambil));
        System.out.println("Saldo saat ini: " + formatRupiah(saldo));
    }

    String formatRupiah(int jumlah) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatRupiah.setMaximumFractionDigits(0);
        String hasil = formatRupiah.format(jumlah);
        return hasil.replace("Rp", "Rp.");
    }

}
