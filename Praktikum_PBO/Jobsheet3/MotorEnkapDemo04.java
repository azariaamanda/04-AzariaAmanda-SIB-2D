public class MotorEnkapDemo04 {
    public static void main(String[] args) {
        MotorEnkap04 motor1 = new MotorEnkap04();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        MotorEnkap04 motor2 = new MotorEnkap04();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setMesinOn(true);
        motor2.setKecepatan(140);
        motor2.displayStatus();

        MotorEnkap04 motor3 = new MotorEnkap04();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

        MotorEnkap04 motor4 = new MotorEnkap04();
        motor4.setMesinOn(true);
        motor4.setPlatNomor("B 2222 CV");
        motor4.setKecepatan(-60);
        motor4.displayStatus();
    }
}

// motor1.platNomor = "B 0838 XZ";

// int kecepatanBaru = 50;

// if (!motor1.isMesinOn && kecepatanBaru > 0) {
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// }
// else{
//     motor1.kecepatan = kecepatanBaru;
// }

// motor1.displayStatus();

// MotorEnkap04 motor2 = new MotorEnkap04();
// motor2.platNomor = "N 9840 AB";
// motor2.isMesinOn = true;
// motor2.kecepatan = 40;

// if (!motor2.isMesinOn && kecepatanBaru > 0) {
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// }
// else{
//     motor2.kecepatan = kecepatanBaru;
// }

// motor2.displayStatus();

// MotorEnkap04 motor3 = new MotorEnkap04();
// motor3.platNomor = "D 8343 CV";
// motor3.kecepatan = 60;

// if (!motor3.isMesinOn && kecepatanBaru > 0) {
//     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
// }
// else{
//     motor3.kecepatan = kecepatanBaru;
// }

// motor3.displayStatus();