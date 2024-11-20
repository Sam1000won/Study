package Java_Study_11.Ex05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class RecvThread extends Thread {

	private Socket socket;
	
	public RecvThread(Socket socket) {
		this.socket = socket;
				
	}

	@Override
	public void run() {
		try {
			// 주 스트림 + 보조 스트림		
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			while (true) {
				String msg = ois.readUTF(); // 읽기
				System.out.println("상대> " + msg); // 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	

}