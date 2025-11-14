public class PasienUmum extends Pasien implements IRegistrasi, ICheckUp {
    private double biayaPendaftaran;

    public PasienUmum(String noRM, String nama, int umur, double biayaPendaftaran) {
        super(noRM, nama, umur);
        this.biayaPendaftaran = biayaPendaftaran;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Biaya Pendaftaran: Rp " + biayaPendaftaran);
    }

    @Override
    public void daftar() {
        System.out.println(getNama() + " melakukan pendaftaran di loket pendaftaran umum.");
    }

    @Override
    public void bayarAdministrasi() {
        System.out.println(getNama() + " membayar administrasi sebesar Rp " + biayaPendaftaran);
    }

    @Override
    public void periksaDokter() {
        System.out.println(getNama() + " selesai diperiksa oleh dokter umum.");
    }

    @Override
    public void periksaLaboratorium() {
        System.out.println(getNama() + " selesai menjalani pemeriksaan laboratorium.");
        System.out.println("Hasil pemeriksaan laboratorium untuk " + getNama() + " akan keluar dalam 1x24 jam.");
    }

}
