public class AbstractClassDemo {
    public static void main(String[] args) {
        Hewan04 hewan1 = new Hewan04(10, "Rumput", "Savana");
        hewan1.cetakInfo();
        hewan1.bergerak();
        hewan1.bernafas();

        Lebah04 lebah1 = new Lebah04("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernafas();
    }
}
