package Java_Study_04.Ex10;

public class DriveController {
    public static void main(String[] args) {
        Racer racer = new Racer();

        Car car =null;
        car = new Audi();
        System.out.println(racer.drive(car));
    
        car = new Bmw();
        System.out.println(racer.drive(car));

        car = new Benz();
        System.out.println(racer.drive(car));

    }
}
