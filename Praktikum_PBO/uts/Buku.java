public class Buku extends BahanPustaka {
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() { return jumlahHalaman; }

    public void tampilInfo() {
        System.out.println("Buku: " + getJudul() + " oleh " + getPenulis() + " (" + jumlahHalaman + " halaman)");
    }
}
