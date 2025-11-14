package Tugas;

public class IceCream04 extends Dessert04 {
    public String rasa;

    // constructor tanpa parameter
    public IceCream04() {
        System.out.println("Objek dari class IceCream dibuat.");
    }

    // constructor dengan parameter
    public IceCream04(String nama, double harga, int jumlahKalori, String rasa) {
        super(nama, harga, jumlahKalori); // memanggil constructor dari superclass (Dessert)
        this.rasa = rasa;
        System.out.println("Objek dari class IceCream dibuat dengan parameter.");
    }

    // method overriding
    public String getInfo() {
    String info = super.getInfo();
    info += "Rasa        : " + rasa + "\n";
    return info;
    }

}
