public abstract class BahanPustaka {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public BahanPustaka(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public abstract void tampilInfo();

}

