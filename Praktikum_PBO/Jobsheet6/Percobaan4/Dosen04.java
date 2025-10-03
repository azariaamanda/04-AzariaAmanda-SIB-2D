package Percobaan4;

public class Dosen04 extends Pegawai04  {
    public String nidn;

    public Dosen04() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP         : " + this.nip + "\n";
        info += "Nama        : " + this.nama + "\n";
        info += "Gaji        : " + this.gaji + "\n";
        info += "NIDN        : " + this.nidn + "\n";
        
        return info;
    }
}