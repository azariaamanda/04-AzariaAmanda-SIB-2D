package Soal2_KasirKantin04;

public class Produk04 {
    private String kodeProduk;
    private String namaProduk;
    private double harga;

    public Produk04(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfo() {
        String info = "";
        info += "Kode : " + kodeProduk + "\n";
        info += "Nama : " + namaProduk + "\n";
        info += "Harga: " + harga + "\n";
        return info;
    }
}
