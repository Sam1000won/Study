package Java_Study_10.Ex08;

public class Main {

	public static void main(String[] args) {
		
		// 1. 공용으로 사용할 객체 생성
		WorkObj obj = new WorkObj();
		
		// 2. 스레드 2개 생성
		WorkThread th1 = new WorkThread(obj);
		WorkThread th2 = new WorkThread(obj);
		
		// 3. 두개의 스레드가 공용객체를 사용하도록 하여 실행
		th1.start();
		th2.start();		
		
	}

}