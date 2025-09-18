public class Anggota04 {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota04(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlahAngsur) {
        if (jumlahAngsur < (jumlahPinjaman * 0.1)) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= jumlahAngsur;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
