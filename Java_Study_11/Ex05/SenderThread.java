package Java_Study_11.Ex05;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// 보내기 전용 스레드
public class SenderThread extends Thread {
	
	Scanner sc = new Scanner(System.in);
	
	private Socket socket = null;	
		
	public SenderThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		// 1. Socket에서 부터 OutputStream 뽑아내기(주 스트림)
		try {
			OutputStream os = socket.getOutputStream();
			// 2. 보조스트림 생성
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			while (true) {
				// Scan으로 사용자 입력 내용을 가져오기
				String msg = sc.nextLine();
				// 3. 데이터 보내기			
				oos.writeUTF("당신> " + msg);
				// 4. flush()
				oos.flush();				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}