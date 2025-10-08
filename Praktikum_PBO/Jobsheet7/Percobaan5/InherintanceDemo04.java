package Percobaan5;

public class InherintanceDemo04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();

        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getAllInfo());
    }
}
