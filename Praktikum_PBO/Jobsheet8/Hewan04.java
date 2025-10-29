public class Hewan04 {
    public double berat;
    public String makanan;
    public String habitat;

    public Hewan04(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public void bergerak(){
        //
    }

    public void bernafas() {
        //
    }

    public void cetakInfo() {
        System.out.println("Berat       : " + this.berat);
        System.out.println("Makanan     : " + this.makanan);
        System.out.println("Habitat     : " + this.habitat);
    }
}