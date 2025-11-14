import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Amanda", "A001");

        Buku buku1 = new Buku("Pemrograman Java", "Azaria", 2023, 250);
        Majalah majalah1 = new Majalah("Tekno Harian", "Redaksi", 2024, 23);

        BahanPustaka bp1 = buku1;
        BahanPustaka bp2 = majalah1;

        Rak rak1 = new Rak("R01", bp1);
        Rak rak2 = new Rak("R02", bp2);

        Peminjaman pinjam1 = new Peminjaman(anggota1, bp1, LocalDate.now());
        Peminjaman pinjam2 = new Peminjaman(anggota1, bp2, LocalDate.now().minusDays(2));

        pinjam1.setPeminjaman(anggota1, bp1);
        pinjam2.setPeminjaman(anggota1, bp2, LocalDate.of(2025, 10, 20));

        System.out.println("=== DATA PERPUSTAKAAN ===\n");

        anggota1.tampilInfo();
        System.out.println();

        System.out.println("\n=== Data Rak ===");
        rak1.tampilRak(true);   // overloading dengan lokasi
        rak2.tampilRak();       // overloading tanpa lokasi

        System.out.println("\n=== Data Peminjaman ===");
        pinjam1.tampilPeminjaman();
        pinjam2.tampilPeminjaman();
    }
}
