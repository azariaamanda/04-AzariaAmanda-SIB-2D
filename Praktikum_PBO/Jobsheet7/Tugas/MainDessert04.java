package Tugas;

public class MainDessert04 {
    public static void main(String[] args) {
        IceCream04 iceCream1 = new IceCream04("Magnum", 15000, 250, "Vanilla");
        IceCream04 iceCream2 = new IceCream04("Walls", 16000, 300, "Chocolate");

        System.out.println("\n=== Informasi Ice Cream ===");
        System.out.println(iceCream1.getInfo());
        System.out.println(iceCream2.getInfo());
    }
}
