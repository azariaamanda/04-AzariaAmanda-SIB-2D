import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien04 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi04> riwayatKonsultasi;

    public Pasien04(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi04>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return getNama();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tamnahKonsultasi (LocalDate tanggal, Pegawai04 dokter, Pegawai04 perawat) {
        Konsultasi04 konsultasi = new Konsultasi04();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        String info = "";
        info+= "No Rekam Medis      : " + this.noRekamMedis + "\n";
        info+= "Nama                : " + this.nama + "\n";

        return info;
    }
}
