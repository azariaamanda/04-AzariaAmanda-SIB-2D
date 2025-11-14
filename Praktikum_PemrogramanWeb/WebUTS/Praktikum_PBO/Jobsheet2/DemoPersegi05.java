public class DemoPersegi05 {
    public static void main(String[] args) {
        PersegiPanjang05 pp1 = new PersegiPanjang05();
        PersegiPanjang05 pp2 = new PersegiPanjang05();

        pp1.panjang = 10;
        pp1.lebar = 5;

        pp2.panjang = 20;
        pp2.lebar = 15;

        pp1.displayInfo();
        pp2.displayInfo();
    }
}
