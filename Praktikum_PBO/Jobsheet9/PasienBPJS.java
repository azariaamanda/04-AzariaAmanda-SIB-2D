public class PasienBPJS extends Pasien implements IRegistrasi {
    private String noBPJS;

    public PasienBPJS(String noRM, String nama, int umur, String noBPJS) {
        super(noRM, nama, umur);
        this.noBPJS = noBPJS;
    }

    public String getNoBPJS() {
        return noBPJS;
    }

    public void setNoBPJS(String noBPJS) {
        this.noBPJS = noBPJS;
    }

    @Override
    public void daftar() {
        System.out.println(getNama() + " melakukan pendaftaran dengan nomor BPJS: " + noBPJS);
    }

    @Override
    public void bayarAdministrasi() {
        System.out.println(getNama() + " tidak membayar administrasi karena ditanggung BPJS.");
    }
}
