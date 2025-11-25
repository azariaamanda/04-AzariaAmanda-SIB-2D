import java.util.ArrayList;

public class DemoPercobaan1 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen04 dosen2 = new Dosen04("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan04 tendik1 = new TenagaKependidikan04("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan04 tendik2 = new TenagaKependidikan04("19650304", "Rika, S.T.", "Tenaga Laboratorium");
        
        ArrayList<Pegawai04> daftarPegawai = new ArrayList<Pegawai04>();

        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }
}