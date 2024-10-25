package Java_Study_07.Ex03;

public class Sub {
    // method1은 호출자에게 예외를 던질 수 있는 메소드입니다.
    void method1() throws Exception {
        // method2를 호출하여 처리하도록 지시합니다.
        method2(); // method2에게 일을 시킨다.
    }

    // method2는 숫자로 변환할 수 없는 문자열을 처리합니다.
    // 이 메소드는 NumberFormatException을 던질 수 있습니다.
    void method2() throws NumberFormatException {
        // Integer.parseInt() 메소드를 사용하여 문자열을 정수로 변환합니다.
        // 그러나 "a1234"는 숫자가 아니므로 예외가 발생합니다.
        Integer.parseInt("a1234"); // 처리하다가 문제 발생.
    }
}