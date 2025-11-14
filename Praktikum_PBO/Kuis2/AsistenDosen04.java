public class AsistenDosen04 extends Pengguna04 implements IStudy04, ITeach04 {
    private String mataKuliah;
    private String laboratorium;

    public AsistenDosen04(String nama, String id, String mataKuliah, String laboratorium) {
        super(nama, id);
        this.mataKuliah = mataKuliah;
        this.laboratorium = laboratorium;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }

    @Override
    public void aktivitas() {
        System.out.println(getNama() + " sedang membantu perkuliahan.");
    }

    @Override
    public void belajar() {
        System.out.println(getNama() + " sedang belajar untuk mata kuliah " + mataKuliah + ".");
    }

    @Override
    public void mengajar() {
        System.out.println(getNama() + " sedang membantu mengajar praktikum " + mataKuliah + " di " + laboratorium + ".");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mata Kuliah     : " + mataKuliah);
        System.out.println("Lab Praktikum   : " + laboratorium);
    }
    
}
