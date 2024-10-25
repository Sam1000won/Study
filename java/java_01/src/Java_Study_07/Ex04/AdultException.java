package Java_Study_07.Ex04;

// 성인 관련 예외를 정의하는 클래스
public class AdultException extends Exception {
    // 생성자: 메시지를 받아서 부모 클래스인 Exception에 전달
    public AdultException(String message) {
        super(message); // 부모 클래스의 생성자 호출
    }
}
