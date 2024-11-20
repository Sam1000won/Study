package Java_Study_10.Ex07;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// 메인 스레드 -> 계산 한 값을 출력
		System.out.println("1~100까지 합은? : ");
		
		// Oper스레드 -> 1~100까지 계산
		OperThread oper = new OperThread();
		oper.start();
		
		// 스레드는 동시 수행이 가능하나 순서제어가 되지 않는다.
		// 그래서 지금처럼 계산하는 스레드보다 출력하는 스레드가 더 빠르면 결과를 낼 수 없다.		
		// sleep으로 1초대기시간을 주는것은 계산이 더 빨리 끝날 수도있기 때문에 비효율적이다.
		oper.join(); // oper thread와 만날때(join)까지 기다리라는 뜻.
		// 그다음 아래를 실행해라		
		System.out.println("답 : " + oper.getSum());
	}

}