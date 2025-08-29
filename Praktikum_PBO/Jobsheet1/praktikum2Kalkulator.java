import java.util.Scanner;
public class praktikum2Kalkulator {
    public static void main(String[] args) {
        Scanner sc5 = new Scanner(System.in);
        int angka1, angka2, hasil;
        String operator;

        System.out.println("=========Kalkulator Sederhana=========");
        System.out.print("Masukkan angka pertama: ");
        angka1 = sc5.nextInt();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sc5.next();
        
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc5.nextInt();

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                System.out.println("==========Hasil Perhitungan==========");
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println("==========Hasil Perhitungan==========");
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println("==========Hasil Perhitungan==========");
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("==========Hasil Perhitungan==========");
                    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operator tidak dikenali!");
        }
    }
}
