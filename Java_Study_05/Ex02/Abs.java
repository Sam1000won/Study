package Java_Study_05.Ex02;

public abstract class Abs {
    public void parent(){
        System.out.println("그냥 쓰거나 오버라이드 해도 되는 메서드");
    }

    // 추상 메서드(몸체가 없는 메서드)
    // 자식이 꼭 오버라이드 해야하는 메서드 - 강제 오버라이드

    public abstract void must1();
    public abstract void mast2();
}
