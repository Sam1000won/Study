package Java_Study_05.Ex01;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("NIIL");
        p.eat();
        p.birth();
        p.talk();
        
        // 추상클래스는 자식외에는 객체화할 수 없다.
    }
}
