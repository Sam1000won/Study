package Java_Study_11.Ex04;

import java.io.BufferedInputStream; // 버퍼링된 입력 스트림을 위한 클래스
import java.io.BufferedOutputStream; // 버퍼링된 출력 스트림을 위한 클래스
import java.io.DataInputStream; // 데이터 입력 스트림을 위한 클래스
import java.io.FileOutputStream; // 파일 출력 스트림을 위한 클래스
import java.io.IOException; // 입출력 예외를 처리하기 위한 클래스
import java.io.InputStream; // 입력 스트림을 위한 클래스
import java.net.ServerSocket; // 서버 소켓을 다루기 위한 클래스
import java.net.Socket; // 소켓을 다루기 위한 클래스

public class FileServer { // FileServer 클래스를 정의합니다.
    public static void main(String[] args) throws IOException { // 프로그램의 시작점인 main 메서드입니다.
        ServerSocket server = null; // 서버 소켓 객체를 null로 초기화합니다.
        
        // 1. 서버 소켓 생성		
        try {
            server = new ServerSocket(5001); // 포트 5001에서 클라이언트 연결을 기다리는 서버 소켓을 생성합니다.
            
            while (true) { // 2. 요청 대기				
                System.out.println("요청 대기중...");
                // 3. 요청 수락
                Socket socket = server.accept(); 
                
                Thread thread = new Thread() { // 클라이언트 요청을 처리하기 위한 새로운 스레드를 생성합니다.

                    @Override
                    public void run() { // 스레드 실행 메서드
                        try {							
                            // 4-1. 주 스트림 준비
                            InputStream is = socket.getInputStream();
                            
                            // 4-2. 보조 스트림 준비
                            BufferedInputStream bis = new BufferedInputStream(is);
                            DataInputStream dis = new DataInputStream(bis);
                            
                            // 4-3. 읽기(파일명, 바이너리)
                            String fileName = dis.readUTF();
                            
                            // 4-4. 파일 스트림 준비 + 보조 스트림 준비
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\GOODEE\\Downloads\\" + fileName);
                            BufferedOutputStream bos = new BufferedOutputStream(fos);
                                                        
                            // 바이너리를 읽어올 때는 상대방이 배열로 보내왔다 하더라도 하나하나 읽어주는 것이 안전.
                            int data;
                            System.out.println("파일 수신중...");
                            while ((data = dis.read()) != -1) {
                                bos.write(data);
                            }				
                            
                            // 4-5. flush()
                            bos.flush();
                            System.out.println("다운로드 완료");
                            
                            // 5. 자원 반납
                            dis.close();
							bos.close();
							socket.close();
						} catch (Exception e) {
							e.printStackTrace();
						}					
					}					
				};
				thread.start();
				
			}
			
		} catch (Exception e) {
			server.close();
			System.out.println("서버를 종료시킵니다.");
		}
	}
}