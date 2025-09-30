import java.time.LocalDate;

public class DemoReservasi04 {
    public static void main(String[] args) {
        Ruangan04 r1 = new Ruangan04("R101", "Lab Komputer", 40, "Tersedia");
        
        Reservasi04 reservasi = new Reservasi04(LocalDate.of(2025, 9, 30), 2, r1);

        Mahasiswa04 m1 = new Mahasiswa04("234176001", "Andi");
        Mahasiswa04 m2 = new Mahasiswa04("234176002", "Budi");
        Mahasiswa04 m3 = new Mahasiswa04("234176003", "Dini");

        reservasi.tambahMahasiswa(m1);
        reservasi.tambahMahasiswa(m2);
        reservasi.tambahMahasiswa(m3);

        reservasi.tampilReservasi();
    }
}