import java.time.LocalDate;
public class RumahSakitDemo04 {
    public static void main(String[] args) {
        Pegawai04 ani = new Pegawai04("1234", "dr.Ani");
        Pegawai04 bagus = new Pegawai04("4567", "dr.Bagus");

        Pegawai04 desi = new Pegawai04("1234", "Ns.Desi");
        Pegawai04 eka = new Pegawai04("4567", "Ns.Eka");

        Pasien04 pasien1 = new Pasien04("343298","Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2012 , 8 , 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien04 pasien2 = new Pasien04("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
