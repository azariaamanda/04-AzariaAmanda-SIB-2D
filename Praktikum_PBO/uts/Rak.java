public class Rak {
    private String kodeRak;
    private BahanPustaka bahan;

    public Rak(String kodeRak, BahanPustaka bahan) {
        this.kodeRak = kodeRak;
        this.bahan = bahan;
    }

    public void tampilRak() {
        System.out.println("Rak " + kodeRak + " menyimpan:");
        bahan.tampilInfo();
    }

    public void tampilRak(boolean tampilLokasi) {
        tampilRak();
        if (tampilLokasi) {
            System.out.println("(Lokasi rak: Lantai 1 - Sisi Timur)");
        }
    }
}
