package Java_Study_04.Ex10;

public class DriveController {
    public static void main(String[] args) {
        //레이서 섭외
        Racer racer = new Racer();

        // 차량 준비
        // 비어있는 차
        Car car =null;

        // 차량 지정 및 운전 시작
        car = new Audi();
        System.out.println(racer.drive(car));
    
        car = new Bmw();
        System.out.println(racer.drive(car));

        car = new Benz();
        System.out.println(racer.drive(car));

    }
}
