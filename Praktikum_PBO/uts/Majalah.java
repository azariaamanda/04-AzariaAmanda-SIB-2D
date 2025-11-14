public class Majalah extends BahanPustaka {
    private int edisi;

    public Majalah(String judul, String penulis, int tahunTerbit, int edisi) {
        super(judul, penulis, tahunTerbit);
        this.edisi = edisi;
    }

    public int getEdisi() { return edisi; }

    public void tampilInfo() {
        System.out.println("Majalah: " + getJudul() + " oleh " + getPenulis() + " - Edisi ke-" + edisi);
    }
}
