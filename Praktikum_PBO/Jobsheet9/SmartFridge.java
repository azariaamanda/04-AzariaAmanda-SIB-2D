public class SmartFridge extends Kulkas{
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk){
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public void naikkanVolume(int increment){
        volume += increment;
    }

    public void turunkanVolume(int decrement){
        volume -= decrement;
    }

    public String getInfo() {
        return "\nSmartFridge" + super.getInfo() + "\nVolume: " + volume;
    }
}