package Java_Study_10.Ex09;

public class Inter extends Thread {
	
	@Override
	public void run() {
		
		// 첫번째 방법) 강제로 예외를 발생해서 catch로 보내는 원리
		// InterruptedException은 sleep(), wait() 등에서만 일어난다.(뭔가를 멈추는 것들)
		// 따라서, sleep(1)이라도 넣어줘야한다.
//		try {
//			while (true) {
//				System.out.println("Inter 실행 중...");
//				Thread.sleep(1);
//			}
//			
//		} catch (InterruptedException e) {
//			System.out.println("자원 정리");
//			System.out.println("종료");
//		}		
		
		// 두번째 방법) 현재 인터럽트가 걸려있는지 확인 후 빠져나오는 원리
		// 이 경우에는 예외를 발생시키기위해서 sleep을 넣을 필요가 없다.
		while (true) {
			System.out.println("Inter 실행 중...");
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("종료");
		
	}
	
}