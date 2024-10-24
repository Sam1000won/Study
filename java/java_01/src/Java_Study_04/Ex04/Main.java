package Java_Study_04.Ex04;

public class Main {
    public static void main(String[] args){
        MyCar car = new MyCar();
        car.start();
        System.out.println(car.run());
        car.turbo = true;
        System.out.println(car.run());

        car.stop();
    }
}
