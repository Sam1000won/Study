package Java_Study_07.Ex04;

public class Main {
    public static void main(String[] args) {
        // 회원가입을 위한 JoinMember 클래스의 인스턴스 생성
        JoinMember join = new JoinMember();
        String id = "admin"; // 테스트할 ID
        String age = "19";   // 테스트할 나이 (문자열로 입력)
    
        // 실행 예외 처리
        try {
            // 예약어 체크 메소드 호출
            join.reservedCheck(id);  // ID가 예약어인지 확인
        } catch (Exception e) {  // 다형성을 활용하여 모든 예외를 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력 (개발 후 주석 처리 필요)
        }
        
        // 일반 예외 처리
        try {
            // 나이 체크 메소드 호출
            join.ageCheck(age); // 나이가 적절한지 확인
        } catch (NumberFormatException e) {
            // 문자열을 정수로 변환할 때 발생하는 예외 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        } catch (AdultException e) {
            // 20세 미만일 경우 발생하는 예외 처리
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        }
    }
    
}
