package Java_Study_07.Ex02;

public class Catch {
        public static void main(String[] args) {
            String[] arr = new String[2]; // 크기가 2인 문자열 배열 생성
    
            // 모든 예외를 한번에 처리해주고 싶을 경우 사용 (다형성을 활용)
            try {
                arr[0] = "12345"; // 배열의 첫 번째 인덱스에 값 할당
                arr[1] = "a12345"; // 배열의 두 번째 인덱스에 비숫자 문자열 할당
                arr[2] = "45678"; // 여기서 ArrayIndexOutOfBoundsException 발생
    
                // 문자열을 정수로 변환
                int var1 = Integer.parseInt(arr[0]); // 정상적으로 변환
                int var2 = Integer.parseInt(arr[1]); // 여기서 NumberFormatException 발생 (문자열이 숫자가 아님)
                System.out.println(var1 + var2); // 두 개의 변환된 값을 출력
    
            } catch (Exception e) { // 모든 예외를 포괄적으로 처리
                System.out.println("예외가 발생했습니다."); // 사용자에게 예외 발생 알림
                e.printStackTrace(); // 예외의 상세한 정보 출력
            } finally {
                System.out.println("끝"); // 항상 실행되는 블록
        }
    }
}
    
