package Soal2_KasirKantin04;

public class ItemTransaksi04 {
    private Produk04 produk;
    private int jumlah;

    public ItemTransaksi04(Produk04 produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk04 getProduk() {
        return produk;
    }

    public void setProduk(Produk04 produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public String getInfo() {
        String info = "";
        info += produk.getNamaProduk() + " (" + produk.getHarga() + ") x ";
        info += jumlah + " = " + getSubtotal() + "\n";
        return info;
    }

}

