public class Ruangan04 {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;
    private String status;

    public Ruangan04(String kodeRuangan, String namaRuangan, int kapasitas, String status){
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        String info = "";
        info += "Kode Ruangan : " + kodeRuangan + "\n";
        info += "Nama Ruangan : " + namaRuangan + "\n";
        info += "Kapasitas    : " + kapasitas + "\n";
        info += "Status       : " + status + "\n";
        return info;
    }
}