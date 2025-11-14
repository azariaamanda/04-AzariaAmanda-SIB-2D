package ReservasiHotel04;

public class Tamu04 {
    private String idTamu;
    private String nama;
    private String email;
    private String telp;

    public Tamu04(String idTamu, String nama, String email, String telp) {
        this.idTamu = idTamu;
        this.nama = nama;
        this.email = email;
        this.telp = telp;
    }

    public String getIdTamu() {
        return idTamu;
    }

    public void setIdTamu(String idTamu) {
        this.idTamu = idTamu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getInfo() {
        String info = "";
        info += "ID Tamu    : " + idTamu + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Email      : " + email + "\n";
        info += "Telepon    : " + telp + "\n";
        return info;
    }
}
