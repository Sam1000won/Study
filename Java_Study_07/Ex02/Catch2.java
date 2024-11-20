package Java_Study_07.Ex02;

public class Catch2 {
    public static void main(String[] args) {
        // 크기가 2인 String 배열 생성
        String[] arr = new String[2];

        try {
            // 배열의 첫 번째 인덱스에 값 할당
            arr[0] = "1234";
            // 배열의 두 번째 인덱스에 값 할당
            arr[1] = "1235";
            // 배열의 세 번째 인덱스에 값 할당 시도 (예외 발생)
            arr[2] = "1234"; // 여기서 ArrayIndexOutOfBoundsException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            // 배열 인덱스 범위를 초과했을 때 발생하는 예외 처리
            System.out.println("배열의 인덱스를 확인 바람"); // 사용자에게 배열 인덱스 확인 요청
            System.out.println(e.toString()); // 예외의 문자열 표현 출력
        } catch (ArithmeticException e) {
            // 산술 연산에서 발생하는 예외 처리 (이 경우에는 발생하지 않음)
            System.out.println("산술 연산 오류 발생"); 
            System.out.println(e.toString());
        } catch (NumberFormatException e) {
            // 숫자 변환에서 발생하는 예외 처리 (이 경우에는 발생하지 않음)
            System.out.println("숫자만 넣어");
            e.printStackTrace(); // 예외의 상세한 정보 출력
        } finally {
            // 예외 발생 여부와 관계없이 항상 실행되는 블록
            System.out.println("끝"); // 프로그램 종료 메시지
        }
    }
}
