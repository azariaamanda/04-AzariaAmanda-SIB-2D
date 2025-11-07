public class PasienUmum extends Pasien implements IRegistrasi {
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
        System.out.println("Pasien umum melakukan pendaftaran di loket pendaftaran umum.");
    }

    @Override
    public void bayarAdministrasi() {
        System.out.println("Pasien umum membayar administrasi sebesar Rp " + biayaPendaftaran);
    }
}
