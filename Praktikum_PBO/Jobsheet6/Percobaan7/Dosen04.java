package Percobaan7;

public class Dosen04 extends Pegawai04  {
    public String nidn;

    public Dosen04(String nip, String nama, double gaji, String nidn){
        System.out.println("Dengan Parameter");
        super();
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
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