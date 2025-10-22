import java.time.LocalDate;

public class Peminjaman {
    private Anggota anggota;
    private BahanPustaka bahan;
    private LocalDate tanggalPinjam;

    public Peminjaman(Anggota anggota, BahanPustaka bahan, LocalDate tanggalPinjam) {
        this.anggota = anggota;
        this.bahan = bahan;
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setPeminjaman(Anggota anggota, BahanPustaka bahan) {
        this.anggota = anggota;
        this.bahan = bahan;
        this.tanggalPinjam = LocalDate.now();
    }

    public void setPeminjaman(Anggota anggota, BahanPustaka bahan, LocalDate tanggal) {
        this.anggota = anggota;
        this.bahan = bahan;
        this.tanggalPinjam = tanggal;
    }
    
    public void tampilPeminjaman() {
        System.out.println("- Anggota : " + anggota.getNama());
        System.out.println("- Judul   : " + bahan.getJudul());
        System.out.println("- Tanggal : " + tanggalPinjam);
    }
}
