package Tugas;

public class MainTanaman {
    public static void main(String[] args) {
        
        Bunga mawar = new Bunga("Mawar", "Kebun", "Bunga Hias", "Merah");
        Pohon mangga = new Pohon("Mangga", "Pekarangan", "Pohon Buah", 5);

        System.out.println("=== Informasi Bunga ===");
        mawar.deskripsi();
        mawar.fotosintesis();
        mawar.berkembangBiak();

        System.out.println("\n=== Informasi Pohon ===");
        mangga.deskripsi();
        mangga.fotosintesis();
        mangga.berkembangBiak();
    }
}