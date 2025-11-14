public class MotorDemo04 {
    public static void main(String[] args) {
        Motor04 motor1 = new Motor04();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";

        int kecepatanBaru = 50;

        if (!motor1.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor1.kecepatan = kecepatanBaru;
        }

        motor1.displayStatus();

        Motor04 motor2 = new Motor04();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        motor2.kecepatan = 40;

        if (!motor2.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor2.kecepatan = kecepatanBaru;
        }

        motor2.displayStatus();

        Motor04 motor3 = new Motor04();
        motor3.platNomor = "D 8343 CV";
        motor3.kecepatan = 60;

        if (!motor3.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else{
            motor3.kecepatan = kecepatanBaru;
        }

        motor3.displayStatus();

    }
}
