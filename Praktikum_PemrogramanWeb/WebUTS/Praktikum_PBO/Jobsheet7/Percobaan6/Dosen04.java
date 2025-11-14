package Percobaan6;

public class Dosen04 extends Pegawai04  {
    public String nidn;

    public Dosen04(String nip, String nama, double gaji, String nidn){
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    public Dosen04() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getInfo() {
        return "NIDN        : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        
        return info;
    }
}