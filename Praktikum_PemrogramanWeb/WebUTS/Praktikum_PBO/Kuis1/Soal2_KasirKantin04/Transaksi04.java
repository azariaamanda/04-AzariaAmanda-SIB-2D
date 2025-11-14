package Soal2_KasirKantin04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaksi04 {
    private LocalDate tanggal;
    private ArrayList<ItemTransaksi04> daftarItem;
    private double totalHarga;

    public Transaksi04(LocalDate tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0;
    }

    public void tambahItem(Produk04 p, int jumlah) {
        ItemTransaksi04 item = new ItemTransaksi04(p, jumlah);
        daftarItem.add(item);
    }

    public double hitungTotal() {
        totalHarga = 0;
        for (ItemTransaksi04 item : daftarItem) {
            totalHarga += item.getSubtotal();
        }
        return totalHarga;
    }

    public void tampilNota() {
        String nota = "======= NOTA PEMBELIAN =======\n";
        nota += "Tanggal : " + tanggal + "\n";
        nota += "------------------------------------\n";
        for (ItemTransaksi04 item : daftarItem) {
            nota += item.getInfo();
        }
        nota += "------------------------------------\n";
        nota += "TOTAL : " + hitungTotal() + "\n";
        System.out.println(nota);
    }
}

