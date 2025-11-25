public class Demo04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan04 tendik1 = new TenagaKependidikan04("19750301", "Aida, A.Md", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);

    }

    public static void train(Pegawai04 pegawai){
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        System.out.println(pegawai.nidn);
        System.out.println(pegawai.kategori);
        pegawai.mengajar();
    }
}