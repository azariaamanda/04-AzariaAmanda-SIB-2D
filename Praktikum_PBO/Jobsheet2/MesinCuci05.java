public class MesinCuci05 {
    public String merek;
    public int kapasitas;
    public int waktuCuci;
    public boolean statusDaya;

    public void nyalakanMatikan(boolean status) {
        statusDaya = status;
        if (statusDaya) {
            System.out.println("Mesin Cuci " + merek + " dinyalakan.");
        } else {
            System.out.println("Mesin Cuci " + merek + " dimatikan.");
        }
    }

    public int tambahWaktuCuci(int increment) {
        waktuCuci += increment;
        return waktuCuci;
    }

    public int kurangiWaktuCuci(int decrement) {
        waktuCuci -= decrement;
        return waktuCuci;
    }

    public void aturTingkatAir(int tingkatAir) {
        System.out.println("Tingkat air diatur ke level: " + tingkatAir);
    }

    public void displayInfo() {
        System.out.println("=== Info Mesin Cuci ===");
        System.out.println("Merek        : " + merek);
        System.out.println("Kapasitas    : " + kapasitas + " kg");
        System.out.println("Waktu Cuci   : " + waktuCuci + " menit");
        System.out.println("Status Daya  : " + (statusDaya ? "Hidup" : "Mati"));
        System.out.println("=======================\n");
    }
}
