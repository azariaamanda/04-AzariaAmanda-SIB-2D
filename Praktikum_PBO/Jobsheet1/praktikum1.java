public class praktikum1 {
    public static void main(String[] args) {
        String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        int kapasitasKg1,kapasitasKg2,kapasitasKg3,kapasitasKg4,kapasitasKg5,
            kapasitasKg6,kapasitasKg7,kapasitasKg8,kapasitasKg9,kapasitasKg10,
            waktuCuci1,waktuCuci2,waktuCuci3,waktuCuci4,waktuCuci5,waktuCuci6,waktuCuci7,
            waktuCuci8,waktuCuci9,waktuCuci10;

        merek1 = "Sharp";
        kapasitasKg1 = 3;
        waktuCuci1 = 30;

        merek2 = "Samsung";
        kapasitasKg2 = 4;
        waktuCuci2 = 25;

        merek3 = "LG";
        kapasitasKg3 = 5;
        waktuCuci3 = 20;

        merek4 = "Panasonic";
        kapasitasKg4 = 6;
        waktuCuci4 = 15;

        merek5 = "Toshiba";
        kapasitasKg5 = 7;
        waktuCuci5 = 10;

        merek6 = "Electrolux";
        kapasitasKg6 = 8;
        waktuCuci6 = 35;

        merek7 = "Whirlpool";
        kapasitasKg7 = 9;
        waktuCuci7 = 40;

        merek8 = "Hitachi";
        kapasitasKg8 = 10;
        waktuCuci8 = 45;

        merek9 = "Miyako";
        kapasitasKg9 = 11;
        waktuCuci9 = 50;

        merek10 = "Sanyo";
        kapasitasKg10 = 12;
        waktuCuci10 = 55;

        waktuCuci1 = tambahWaktuCuci(waktuCuci1, 10);
        waktuCuci2 = kurangWaktuCuci(waktuCuci2, 5);
        waktuCuci3 = tambahWaktuCuci(waktuCuci3, 15);
        waktuCuci4 = kurangWaktuCuci(waktuCuci4, 10);
        waktuCuci5 = tambahWaktuCuci(waktuCuci5, 20);
        waktuCuci6 = kurangWaktuCuci(waktuCuci6, 15);
        waktuCuci7 = tambahWaktuCuci(waktuCuci7, 25);
        waktuCuci8 = kurangWaktuCuci(waktuCuci8, 20);
        waktuCuci9 = tambahWaktuCuci(waktuCuci9, 30);
        waktuCuci10 = kurangWaktuCuci(waktuCuci10, 25);

        System.out.println("==========Data Mesin Cuci==========");
        System.out.println("Merek Mesin Cuci : " + merek1);
        System.out.println("Kapasitas : " + kapasitasKg1 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci1 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek2);
        System.out.println("Kapasitas : " + kapasitasKg2 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci2 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek3);
        System.out.println("Kapasitas : " + kapasitasKg3 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci3 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek4);
        System.out.println("Kapasitas : " + kapasitasKg4 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci4 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek5);
        System.out.println("Kapasitas : " + kapasitasKg5 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci5 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek6);
        System.out.println("Kapasitas : " + kapasitasKg6 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci6 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek7);
        System.out.println("Kapasitas : " + kapasitasKg7 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci7 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek8);
        System.out.println("Kapasitas : " + kapasitasKg8 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci8 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek9);
        System.out.println("Kapasitas : " + kapasitasKg9 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci9 + " Menit");

        System.out.println("\nMerek Mesin Cuci : " + merek10);
        System.out.println("Kapasitas : " + kapasitasKg10 + " Kg");
        System.out.println("Waktu Cuci : " + waktuCuci10 + " Menit");
    }

    public static int tambahWaktuCuci(int waktuCuci, int tambah) {
        waktuCuci += tambah;
        return waktuCuci;
    }

    public static int kurangWaktuCuci(int waktuCuci, int kurang) {
        waktuCuci -= kurang;
        return waktuCuci;
    }
}