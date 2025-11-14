public class MotorEnkap04 {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;


    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatanBaru) {
        if (!isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatanBaru >= 100) {
            System.out.println("Kecepatan maksimal 100!");
            this.kecepatan = kecepatanBaru;
        } else if (kecepatanBaru < 0) {
            System.out.println("Kecepatan tidak boleh negatif!");
            this.kecepatan = kecepatanBaru;
        } else {
            this.kecepatan = kecepatanBaru;
        }
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("========================");
    }
}
