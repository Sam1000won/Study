package Java_Study_11.Ex05;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// java chapter11.exam05.ChatClient
public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = null;
		
		try {			
			// 1. Socket 생성 (IP, PORT)
			socket = new Socket("localhost",7777);
			// 2. 예외 발생하지 않으면 연결성공
			System.out.println("연결 성공");
			// 3. 보내기/받기 스레드에 소켓전달.
			SenderThread sender = new SenderThread(socket);
			RecvThread recv = new RecvThread(socket);
			sender.start();
			recv.start();
			
		} catch (Exception e) {
			socket.close();
			e.printStackTrace();
		}
		
		
		// 3. 예외 발생시 소켓종료
		// 채팅의 경우 계속 대화를 해야하기 때문에 예외가 발생하지 않는 이상 연결유지.
		
		
		
	}

}