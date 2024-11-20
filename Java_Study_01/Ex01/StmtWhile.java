package Ex01;

public class StmtWhile {
    public static void main(String[] args) {
        int cnt = 10;
		// while : 조건체크 -> 반복실행.
		while (cnt<10) { // cnt가 10보다 작은지 확인.
			cnt++; // 증가
		}
		System.out.println("while cnt : " + cnt);
		
		//do while : 일단실행 -> 조건체크
		cnt = 10;
		do {
			cnt++;
		} while (cnt<10);
		System.out.println("do while cnt : " + cnt);
		// while과 do while은 조건이 부합할 때는 같은 결과를 낸다.
		// 하지만 조건이 맞지않는 경우 다른결과를 낸다.
		// 예 : 선불제 버스와 후불제 버스의 차이.
    }
}
