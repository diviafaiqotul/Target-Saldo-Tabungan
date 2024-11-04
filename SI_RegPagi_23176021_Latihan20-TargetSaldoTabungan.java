/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini akan menampilkan jumlah target saldo tabungan setiap bulan dalam 8 bulan.
 */
import java.text.DecimalFormat;
public class TargetSaldoTabungan {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 3500000; // Saldo awal
        double bungaPerBulan = 0.08; // Bunga 8% per bulan
        double saldoTarget = 6000000; // Saldo target
        
        // Format Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("Rp#,###.##");

        int bulan = 1;

        // Perhitungan saldo setiap bulan hingga mencapai target
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * bungaPerBulan;
            saldoAwal += bunga;

            // Menampilkan saldo per bulan
            System.out.println("Saldo di bulan ke-" + bulan + " " + formatRupiah.format(saldoAwal));
            bulan++; // Menaikkan bulan
        }
    }
}

