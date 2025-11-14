public class SmartFridge extends Kulkas implements Audible{
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

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public String getInfo() {
        return "\nSmartFridge" + super.getInfo() + "\nVolume: " + volume;
    }
}
