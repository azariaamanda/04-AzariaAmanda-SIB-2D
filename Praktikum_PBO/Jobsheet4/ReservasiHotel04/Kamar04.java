package ReservasiHotel04;

public class Kamar04 {
    private String nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private String status;

    public Kamar04(String nomorKamar, String tipeKamar, double hargaPerMalam, String status) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = status;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getInfo() {
        String info = "";
        info += "Nomor Kamar      : " + this.nomorKamar + "\n";
        info += "\tTipe Kamar       : " + this.tipeKamar + "\n";
        info += "\tHarga per Malam  : " + this.hargaPerMalam + "\n";
        info += "\tStatus           : " + this.status + "\n";
        return info;
    }
}
