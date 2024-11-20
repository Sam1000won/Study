package Java_Study_11.Ex05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = null;
		try {
			// 1. 서버소켓 생성
			server = new ServerSocket(7777);
			System.out.println("접속 대기...");
			// 2. 응답대기
			// 3. 응답승인
			Socket socket = server.accept();
			System.out.println("접속 수락, 소켓획득"); 
				
			// 4. 소켓으로 할일 수행
			SenderThread sender = new SenderThread(socket);
			RecvThread recv = new RecvThread(socket);
			sender.start();
			recv.start();
			
		} catch (Exception e) {
			// 5. 예외발생시 서버종료
			server.close();
			e.printStackTrace();
		}

	}

}