public class Lebah04 extends Hewan04 {
    public String kasta;

    public Lebah04(String kasta, double berat, String makanan, String habitat){
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirim oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void bernafas() {
        System. out.println("Mengepakkan sayap ke depan");
        System. out.println("Memutar sayap hampir 90 derajat");
        System. out.println("Mengepakkan sayap ko belakang");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta       : " + this.kasta);
    }
}
