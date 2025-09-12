public class MotorDemo04 {
    public static void main(String[] args) {
        Motor04 motor1 = new Motor04();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        motor1.displayStatus();

        Motor04 motor2 = new Motor04();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        motor2.kecepatan = 40;
        motor2.displayStatus();

        Motor04 motor3 = new Motor04();
        motor3.platNomor = "D 8343 CV";
        motor3.kecepatan = 60;
        motor3.displayStatus();

    }
}
