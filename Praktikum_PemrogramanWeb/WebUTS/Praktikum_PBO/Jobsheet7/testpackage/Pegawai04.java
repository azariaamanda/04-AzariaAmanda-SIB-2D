package testpackage;

public class Pegawai04 {
    public String nip;
    public String nama;
    protected double gaji;

    public Pegawai04() {
        System.out.println("Objek dari class Pegawai dibuat.");
    }

    public String getInfo() {
        String info = "";
        info += "NIP         : " + nip + "\n";
        info += "Nama        : " + nama + "\n";
        info += "Gaji        : " + gaji + "\n";
        
        return info;
    }
}
