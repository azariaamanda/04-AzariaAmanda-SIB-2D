package ReservasiHotel04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservasi04 {
    private String idReservasi;
    private LocalDate tanggal;
    private Tamu04 tamu;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int lamaInap;
    private double totalHarga;
    private ArrayList<Kamar04> daftarKamar;

    public Reservasi04(String idReservasi, LocalDate tanggal, Tamu04 tamu, LocalDate checkIn, LocalDate checkOut, int lamaInap) {
        this.idReservasi = idReservasi;
        this.tanggal = tanggal;
        this.tamu = tamu;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.lamaInap = lamaInap;
        this.daftarKamar = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public String getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    
    public Tamu04 getTamu() {
        return tamu;
    }
    
    public void setTamu(Tamu04 tamu) {
        this.tamu = tamu;
    }
    
    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public ArrayList<Kamar04> getDaftarKamar() {
        return daftarKamar;
    }
    
    public void tambahKamar(Kamar04 kamar) {
        daftarKamar.add(kamar);
        totalHarga += kamar.getHargaPerMalam() * lamaInap;
    }
    
    public String getInfo() {
    String info = "";
    info += "===============================================" + "\n";
    info += "ID Reservasi       : " + this.idReservasi + "\n";
    info += "Tanggal Reservasi  : " + this.tanggal + "\n";
    info += "Tamu               :\n";
    info += this.tamu.getInfo();
    info += "Check-in   : " + this.checkIn + "\n";
    info += "Check-out  : " + this.checkOut + "\n";
    info += "Lama Inap  : " + this.lamaInap + "\n";
    
    info += "Daftar Kamar yang Dipesan:\n";
    for (Kamar04 kamar : daftarKamar) {
        info += "\t" + kamar.getInfo();
    }
    
    info += "Total Harga: " + this.totalHarga + "\n";
    
    return info;
}
}