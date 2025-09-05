public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Mahasiswa05 m1 = new Mahasiswa05();
        Mahasiswa05 m3 = new Mahasiswa05();
        Mahasiswa05 m2 = new Mahasiswa05();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtias";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";

        m2.nim = "023433";
        m2.nama = "Rizky Ramadhan";
        m2.alamat = "Bandung, Jawa Barat";
        m2.kelas = "2B";

        m3.nim = "023434";
        m3.nama = "Dodik Satria";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2C";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
