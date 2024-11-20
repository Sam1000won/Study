package Java_Study_11.Ex04;

import java.io.BufferedInputStream; // 버퍼링된 입력 스트림을 위한 클래스
import java.io.BufferedOutputStream; // 버퍼링된 출력 스트림을 위한 클래스
import java.io.DataInputStream; // 데이터 입력 스트림을 위한 클래스
import java.io.FileOutputStream; // 파일 출력 스트림을 위한 클래스
import java.io.IOException; // 입출력 예외를 처리하기 위한 클래스
import java.io.InputStream; // 입력 스트림을 위한 클래스
import java.net.ServerSocket; // 서버 소켓을 다루기 위한 클래스
import java.net.Socket; // 소켓을 다루기 위한 클래스

public class FileServer2 {

	public static void main(String[] args) throws IOException {
		// 1. 서버소켓 생성
		ServerSocket server = null;
		try {
			server = new ServerSocket(5001);
			while (true) { // 2. 요청대기
				// 3. 요청승인
				Socket socket = server.accept();
				
				// 4. 접속된 소켓의 정보 가져오기 - 주스트림 
				InputStream is = socket.getInputStream();
				// 4-1. 보조스트림 
				BufferedInputStream bis = new BufferedInputStream(is);
				// 4-2. 보조스트림 - 데이터스트림
				DataInputStream dis = new DataInputStream(bis);
				
				// 5. 입력받을 주스트림 생성
				// 5-1. 데이터스트림으로부터 이름, 파일(바이너리)데이터 가져오기
				String fileName = dis.readUTF();
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\GOODEE\\Downloads\\" + fileName);
				// 5-2. 보조스트림 생성
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				System.out.println("파일 수신중...");
				int data;
				while((data = dis.read()) != -1) {
					bos.write(data);
				}								
				
				// 6. flush처리
				bos.flush();
				System.out.println("다운로드 완료");
				
				// 7. 자원반납
				dis.close();
				bos.close();
				socket.close();
				
				
			}
			
		} catch (Exception e) {
			server.close();
			System.out.println("서버를 종료시킵니다.");
		}

	}

}