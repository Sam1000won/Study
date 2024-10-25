package Java_Study_07.Ex03;

public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub(); // Sub 클래스의 인스턴스를 생성합니다.

        try {
            // method1을 호출하여 예외가 발생할 수 있는 코드 블록을 실행합니다.
            sub.method1(); // method1 호출
        } catch (NumberFormatException e) {
            // NumberFormatException이 발생했을 경우 이 블록이 실행됩니다.
            // 변환할 수 없는 문자열에 대한 오류 메시지를 출력합니다.
            System.out.println("숫자로 변환할 수 없는 문자열입니다: " + e.getMessage());
        } catch (Exception e) {
            // 그 외의 모든 예외를 처리하기 위한 블록입니다.
            // 일반적인 예외 메시지를 출력합니다.
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
