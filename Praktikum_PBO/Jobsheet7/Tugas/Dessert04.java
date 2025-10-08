package Tugas;

public class Dessert04 {

    public String nama;
    public double harga;
    public int jumlahKalori;

    public Dessert04() {
        System.out.println("Objek dari class Dessert dibuat.");
    }

    public Dessert04(String nama, double harga, int jumlahKalori) {
        this.nama = nama;
        this.harga = harga;
        this.jumlahKalori = jumlahKalori;
        System.out.println("Objek dari class Dessert dibuat dengan parameter.");
    }

    public String getInfo() {
        String info = "";
        info += "Nama        : " + nama + "\n";
        info += "Harga       : " + harga + "\n";
        info += "Jumlah Kalori: " + jumlahKalori + "\n";
        
        return info;
    }
}