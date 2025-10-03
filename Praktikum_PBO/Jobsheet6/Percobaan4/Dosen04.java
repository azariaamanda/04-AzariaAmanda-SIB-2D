package Percobaan4;

public class Dosen04 extends Pegawai04  {
    public String nidn;

    public Dosen04() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP         : " + super.nip + "\n";
        info += "Nama        : " + super.nama + "\n";
        info += "Gaji        : " + super.gaji + "\n";
        info += "NIDN        : " + super.nidn + "\n";
        
        return info;
    }
}