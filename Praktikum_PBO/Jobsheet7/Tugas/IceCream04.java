package Tugas;

public class IceCream04 extends Dessert04 {
    public String rasa;

    public IceCream04() {
        System.out.println("Objek dari class IceCream dibuat.");
    }

    public IceCream04(String nama, double harga, int jumlahKalori, String rasa) {
        super(nama, harga, jumlahKalori);
        this.rasa = rasa;
        System.out.println("Objek dari class IceCream dibuat dengan parameter.");
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Rasa        : " + rasa + "\n";
        return info;
    }
}
