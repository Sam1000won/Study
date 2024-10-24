package Java_Study_03.Ex02;

public class Main {
    public static void main(String[] args) {
        // 첫 번째 Puppy 객체 생성: 이름과 목적을 지정
        @SuppressWarnings("unused")
        Puppy p = new Puppy("멍멍이", "집을 지키는 것");
        
        // 두 번째 Puppy 객체 생성: 이름만 지정
        @SuppressWarnings("unused")
        Puppy p2 = new Puppy("진돗개");
    }
}
