public abstract class Pengguna04 {
    private String nama;
    private String id;

    public Pengguna04(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void aktivitas();

    public void tampilkanInfo(){
        System.out.println("Nama            : " + nama);
        System.out.println("ID              : " + id);
    }
}
