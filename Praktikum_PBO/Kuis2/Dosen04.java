public class Dosen04 extends Pengguna04 implements ITeach04, Ievaluate {
    private String mataKuliah;

    public Dosen04(String nama, String id, String mataKuliah) {
        super(nama, id);
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void aktivitas() {
        System.out.println(getNama() + " sedang mengajar perkuliahan.");
    }

    @Override
    public void mengajar() {
        System.out.println(getNama() + " mengajar mata kuliah " + mataKuliah);
    }

    public void menilai() {
        System.out.println(getNama() + " menilai hasil UTS");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mata Kuliah     : " + mataKuliah);
    }
}
