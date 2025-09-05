public class DemoMesinCuci05 {
    public static void main(String[] args) {
        MesinCuci05 mc1 = new MesinCuci05();
        MesinCuci05 mc2 = new MesinCuci05();

        mc1.merek = "LG";
        mc1.kapasitas = 8;
        mc1.waktuCuci = 30;

        mc1.nyalakanMatikan(true);
        mc1.tambahWaktuCuci(10);
        mc1.aturTingkatAir(3);
        
        mc1.displayInfo();
        
        mc2.merek = "Samsung";
        mc2.kapasitas = 6;
        mc2.waktuCuci = 25;
        
        mc2.nyalakanMatikan(true);
        mc2.kurangiWaktuCuci(5);
        mc2.aturTingkatAir(2);
        
        mc2.displayInfo();
    }
}
