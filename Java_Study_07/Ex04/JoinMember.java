package Java_Study_07.Ex04;

public class JoinMember {
    // 예약어 체크
	public void reservedCheck(String id) throws ReservedException{
		String[] reserved = {"admin", "tester", "manager"};
		
        // 예약어의 입력된 ID 비교
        for(String str : reserved) {
			if(str.equals(id)) {
				// 상황이 되면 강제로 예외를 발생시킨다.
				throw new ReservedException(id + "는 예약어입니다.");
			}
		}
	}
	
	// 나이 체크
	public void ageCheck(String ageStr) throws AdultException, NumberFormatException {
        // 입력된 문자열을 정수로 변환
		int age = Integer.parseInt(ageStr);
		
        // 나이가 20세 미만일 경우 예외를 출력
		if(age<20) {
			throw new AdultException("20세 미만은 가입이 불가능합니다.");
		}
	}
}

