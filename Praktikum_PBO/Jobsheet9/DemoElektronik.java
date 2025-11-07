public class DemoElektronik {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("blower", 1000000, "hitam", "politron");
        TV tv = new TV("LED", 6, 70000000, "pink", "Samsung");
        Kulkas kulkas = new Kulkas(2, 1000000, "merah", "Sharp");
        SmartFridge smartFridge = new SmartFridge(9, 2, 6000000, "Silver", "politron");

        System.out.println(kipas.getInfo());
        System.out.println();
        System.out.println(tv.getInfo());
        System.out.println();
        System.out.println(kulkas.getInfo());
        System.out.println();
        System.out.println(smartFridge.getInfo());
    }
}
