package Tugas;

public class Pohon extends Tanaman {
    public int tinggi;

    public Pohon(String nama, String habitat, String jenis, int tinggi) {
        super(nama, habitat, jenis);
        this.tinggi = tinggi;
    }

    public void berkembangBiak() {
        System.out.println(nama + " berkembang biak melalui biji yang tumbuh menjadi tanaman baru.");
    }

    public void deskripsi() {
        super.deskripsi();
        System.out.println("Tinggi        : " + tinggi + " meter");
    }

}
