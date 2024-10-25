package Java_Study_07.Ex01;

public class ClassCastException {
    public static void main(String[] args) {
        
       // Object는 Java의 최상위 객체로서 모든 객체를 담을 수 있다.
    Object value = 1234;
        
    // 명시적 형변환을 통해 Object 타입에서 String 타입으로 변환을 시도하지만,
    // 실제로 value는 Integer 타입이므로 ClassCastException이 발생한다.
    String str = (String)value; // 이 줄에서 예외가 발생함

    System.out.println(str);
    }
}
