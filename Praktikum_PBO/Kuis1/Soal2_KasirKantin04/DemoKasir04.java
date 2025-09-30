package Soal2_KasirKantin04;

import java.time.LocalDate;

public class DemoKasir04 {
    public static void main(String[] args) {
        Produk04 p1 = new Produk04("M01", "Nasi Goreng", 15000);
        Produk04 p2 = new Produk04("M02", "Es Teh", 5000);
        Produk04 p3 = new Produk04("M03", "Ayam Geprek", 20000);

        Transaksi04 tr = new Transaksi04(LocalDate.of(2025, 9, 25));

        tr.tambahItem(p1, 2);
        tr.tambahItem(p2, 3);
        tr.tambahItem(p3, 5);

        tr.tampilNota();
    }
}
