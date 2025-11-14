import java.time.LocalDate;
public class Konsultasi04 {
    private LocalDate tanggal;
    private Pegawai04 dokter;
    private Pegawai04 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai04 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai04 dokter) {
        this.dokter = dokter;
    }

    public Pegawai04 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai04 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";

        return info;
    }
}
