public class Pegawai04 {
    public String nip;
    public String nama;

    public Pegawai04(){

    }

    public Pegawai04(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo()
    {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
