package Java_Study_07.Ex01;

public class NumberFormatException {
    public static void main(String[] args) { 
        String data; // String 변수를 선언
        int val; // int 변수를 선언

        // "1234" -> 1234로 변환
        data = "1234"; // data에 문자열 "1234" 할당
        val = Integer.parseInt(data); // 문자열을 정수로 변환
        System.out.println(val); // 1234 출력

        data = "1234"; // 다시 data에 문자열 "1234" 할당
        val = Integer.parseInt(data); // 문자열을 정수로 변환
        System.out.println(val); // 1234 출력

        // 실제 오류 발생 부분
        data = null; // data가 null로 설정
        val = Integer.parseInt(data); // null을 정수로 변환하려고 시도, NumberFormatException 발생
        System.out.println(val); // 이 줄까지 도달하지 않음
    }
}
