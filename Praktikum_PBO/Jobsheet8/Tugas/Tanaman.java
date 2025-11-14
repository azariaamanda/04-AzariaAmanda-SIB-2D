package Tugas;

public abstract class Tanaman {
    public String nama;
    public String habitat;
    public String jenis;

    public Tanaman(String nama, String habitat, String jenis) {
        this.nama = nama;
        this.habitat = habitat;
        this.jenis = jenis;
    }

    public abstract void berkembangBiak();

    public void fotosintesis() {
        System.out.println(nama + " melakukan fotosintesis untuk menghasilkan makanannya sendiri.");
    }

    public void deskripsi() {
        System.out.println("Nama Tanaman  : " + nama);
        System.out.println("Habitat       : " + habitat);
        System.out.println("Jenis         : " + jenis);
    }
}