public class Mahasiswa04 extends Pengguna04 implements IStudy04 {
    private String jurusan;

    public Mahasiswa04(String nama, String id, String jurusan) {
        super(nama, id);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void aktivitas() {
        System.out.println(getNama() + " sedang mengikuti perkuliahan.");
    }

    @Override
    public void belajar() {
        System.out.println(getNama() + " sedang belajar di jurusan " + jurusan + ".");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jurusan         : " + jurusan);
    }
    
}
