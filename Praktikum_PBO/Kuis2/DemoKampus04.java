public class DemoKampus04 {
    public static void main(String[] args) {
        Mahasiswa04 mhs = new Mahasiswa04("Azaria Amanda", "M001", "Informatika");
        Dosen04 dosen = new Dosen04("Dr. Budi", "D001", "Informatika");
        AsistenDosen04 asdos = new AsistenDosen04("Siti Nurhaliza", "AD001", "Informatika", "Lab Pemrograman");

        System.out.println("=== Informasi Mahasiswa ===");
        mhs.tampilkanInfo();
        mhs.aktivitas();
        mhs.belajar();

        System.out.println("\n=== Informasi Dosen ===");
        dosen.tampilkanInfo();
        dosen.aktivitas();
        dosen.mengajar();
        dosen.menilai();

        System.out.println("\n=== Informasi Asisten Dosen ===");
        asdos.tampilkanInfo();
        asdos.aktivitas();
        asdos.belajar();
        asdos.mengajar();
    }
}
