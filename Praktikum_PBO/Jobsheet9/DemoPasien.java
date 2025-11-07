public class DemoPasien {
    public static void main(String[] args) {
        PasienUmum pasien1 = new PasienUmum("RM001", "Andi", 30, 50000);
        
        System.out.println("=== Data Pasien Umum ===");
        pasien1.tampilkanInfo();
        pasien1.daftar();
        pasien1.bayarAdministrasi();
        pasien1.periksaDokter();
        pasien1.periksaLaboratorium();
        
        System.out.println();

        PasienBPJS pasien2 = new PasienBPJS("RM002", "Budi", 25, "BPJS123456");
        
        System.out.println("=== Data Pasien BPJS ===");
        pasien2.tampilkanInfo();
        pasien2.daftar();
        pasien2.bayarAdministrasi();
    }
}
