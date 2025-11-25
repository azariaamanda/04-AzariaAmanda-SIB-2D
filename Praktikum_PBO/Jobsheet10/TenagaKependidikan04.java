public class TenagaKependidikan04 extends Pegawai04 {
    public String kategori;

    public TenagaKependidikan04() {

    }

    public TenagaKependidikan04(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}
