

public class Demo04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04("19940201", "Widia, S.Kom. M.Kom", "199402");

        Pegawai04 pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        System.out.println(pegawai1.nidn);
        pegawai1.mengajar();

    }
}