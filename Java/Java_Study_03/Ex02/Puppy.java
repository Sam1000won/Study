package Java_Study_03.Ex02;

public class Puppy {
    // 이 객체가 사라질 때까지 이름과 목적이 유지된다.
    public String name;
    public String goal;
    public int age;

    // 이름과 목적을 받는 생성자
    public Puppy(String name, String goal) {
        this.name = name; // 매개변수 name을 인스턴스 변수 name에 할당
        this.goal = goal; // 매개변수 goal을 인스턴스 변수 goal에 할당
        System.out.println("이름은 " + name + "이고, 목적은 " + goal + "입니다.");
    }

    // 이름만 받는 생성자
    public Puppy(String name) {
        this.name = name; // 매개변수 name을 인스턴스 변수 name에 할당
        System.out.println("이름은 " + name + "입니다.");
    }

    // 기본 생성자
    public Puppy() {
        this.age = 0; // 기본값으로 나이를 0으로 설정
        System.out.println("기본 생성자 호출: 나이는 " + age + "입니다.");
    }

    // 나이를 받는 생성자
    public Puppy(int age) {
        this.age = age; // 매개변수 age을 인스턴스 변수 age에 할당
        System.out.println("나이는 " + age + "입니다.");
    }
}
