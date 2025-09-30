import java.time.LocalDate;
import java.util.ArrayList;

public class Reservasi04 {
    private LocalDate tanggal;
    private int durasi;
    private Ruangan04 ruangan;
    private ArrayList<Mahasiswa04> daftarMahasiswa;

    public Reservasi04(LocalDate tanggal, int durasi, Ruangan04 ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa04 mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilReservasi() {
        String info = "===== DATA RESERVASI =====\n";
        info += "Tanggal : " + tanggal + "\n";
        info += "Durasi  : " + durasi + " jam\n";
        info += "\n-- Data Ruangan --\n";
        info += ruangan.getInfo();
        info += "\n-- Daftar Mahasiswa --\n";
        for (Mahasiswa04 mhs : daftarMahasiswa) {
            info += mhs.getInfo() + "\n";
        }
        System.out.println(info);
    }
}
