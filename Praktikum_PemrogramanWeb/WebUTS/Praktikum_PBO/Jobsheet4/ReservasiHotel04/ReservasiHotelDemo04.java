package ReservasiHotel04;

import java.time.LocalDate;

public class ReservasiHotelDemo04 {
    public static void main(String[] args) {
        Tamu04 tamu1 = new Tamu04("T001", "Azaria Amanda", "azaria.amanda@email.com", "081234567890");
        Tamu04 tamu2 = new Tamu04("T002", "Joko Susilo", "joko.susilo@email.com", "087654321098");

        Kamar04 kamar1 = new Kamar04("101", "Deluxe", 500000.0, "Tersedia");
        Kamar04 kamar2 = new Kamar04("205", "Suite", 1200000.0, "Tersedia");
        Kamar04 kamar3 = new Kamar04("303", "Standard", 350000.0, "Tersedia");

        Reservasi04 reservasi1 = new Reservasi04("R-001", LocalDate.of(2025, 10, 20), tamu1, LocalDate.of(2025, 10, 20), LocalDate.of(2025, 10, 22), 2);
        reservasi1.tambahKamar(kamar1);
        reservasi1.tambahKamar(kamar2);
        
        System.out.println(reservasi1.getInfo());

        Reservasi04 reservasi2 = new Reservasi04("R-002", LocalDate.of(2025, 11, 3), tamu2, LocalDate.of(2025, 11, 4), LocalDate.of(2025, 11, 7), 3);
        reservasi2.tambahKamar(kamar3);
        
        System.out.println(reservasi2.getInfo());
    }
}