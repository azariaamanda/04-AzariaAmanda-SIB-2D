public class Pasien {
    private String noRM;
    private String nama;
    private int umur;

    public Pasien(String noRM, String nama, int umur) {
        this.noRM = noRM;
        this.nama = nama;
        this.umur = umur;
    }

    public String getNoRM() {
        return noRM;
    }

    public void setNoRM(String noRM) {
        this.noRM = noRM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("No RM : " + noRM);
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
    }
}
