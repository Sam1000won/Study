package Java_Study_04.Ex02;

public class Child extends Parent {
    public Child(){
        super(); // 부모 생성자를 부르는 키워드
        System.out.println("자식 생성자 호출");
    }
}
