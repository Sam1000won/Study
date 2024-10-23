package Java_Study_04.Ex04;

public class ParentCar {
    public void start(){
        System.out.println("시동");
    }
    public int run(){
        return 60;
    }
    public void stop(){
        System.out.println("정지");
    }

    public final void test(){
        System.out.println("점검");
    }
}
