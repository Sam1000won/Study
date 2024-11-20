package Java_Study_07.Ex01;

public class NullPointException {
    public static void main(String[] args) {
        // null 인 값을 가지고 무언가를 하려고 할 때 발생하는 예외
        String data = null; // data 변수를 null로 초기화
        
        // data가 null이기 때문에, 다음 메소드 호출에서 예외 발생
        data.contains("a"); // data가 null일 때 contains() 메소드를 호출하려고 시도
        
        // 실제 오류 발생 부분
        // Exception in thread "main" java.lang.NullPointerException
        // 이 예외는 null 객체에 메소드를 호출하려 할 때 발생합니다.
    }
}
