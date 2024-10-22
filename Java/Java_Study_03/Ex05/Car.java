package Java_Study_03.Ex05;

public class Car {
    int gear = 0;
    boolean on = false;

    public Car(){
        this.gear = 0;
        this.on = false;
    }

    void start(){
        if(on==false){
            on = true;
            System.out.println("시동 온");
        }else{
            System.out.println("이미 시동 온");
        }
    }
    void change(int gear){
        this.gear = gear;
        System.out.println(this.gear+"변경");
    }
}
