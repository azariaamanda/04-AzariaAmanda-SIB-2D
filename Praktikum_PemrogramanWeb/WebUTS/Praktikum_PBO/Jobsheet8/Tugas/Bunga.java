package Tugas;

public class Bunga extends Tanaman {
    public String warna;

    public Bunga(String nama, String habitat, String jenis, String warna) {
        super(nama, habitat, jenis);
        this.warna = warna;
    }
    
    public void berkembangBiak() {
        System.out.println(nama + " berkembang biak melalui penyerbukan dan pembuahan.");
    }

    public void deskripsi() {
        super.deskripsi();
        System.out.println("Warna         : " + warna);
    }
}