/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorenscapsulation;

/**
 *
 * @author Syaifuddin
 */
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
//        motor.printStatus();
//        motor.kecepatan = 50;
//        motor.printStatus();

motor.printStatus();
motor.tambahKecepatan();

motor.nyalakanMesin();
motor.printStatus();

motor.tambahKecepatan();
motor.printStatus();

motor.tambahKecepatan();
motor.printStatus();

motor.tambahKecepatan();
motor.printStatus();

motor.matikanMesin();
motor.printStatus();


    }
}
