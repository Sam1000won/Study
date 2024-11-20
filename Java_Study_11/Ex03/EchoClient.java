package Java_Study_11.Ex03;

import java.io.IOException;
import java.io.ObjectInputStream; // 객체 입력 스트림을 처리하기 위한 클래스
import java.io.ObjectOutputStream; // 객체 출력 스트림을 처리하기 위한 클래스
import java.net.Socket; // 소켓을 사용하기 위한 클래스
import java.io.InputStream; // 입력 스트림을 처리하기 위한 클래스
import java.io.OutputStream; // 출력 스트림을 처리하기 위한 클래스
import java.net.UnknownHostException; // 호스트를 찾을 수 없을 때 발생하는 예외

public class EchoClient { // EchoClient 클래스를 정의합니다.
    public static void main(String[] args) throws UnknownHostException, IOException { // 프로그램의 시작점인 main 메서드입니다.
        
        // 1. 소켓 생성 (IP와 포트 지정)
        Socket socket = new Socket("localhost", 5001); // "localhost"의 포트 5001에 연결합니다.
        
        // 2. 예외가 발생하지 않으면, 연결 완료
        System.out.println("접속 완료");
        
        // socket을 통해 통신 진행
        // 1. 내보낼 스트림 준비
        OutputStream os = socket.getOutputStream(); // 소켓으로부터 출력 스트림을 가져옵니다.
        ObjectOutputStream oos = new ObjectOutputStream(os); // 출력 스트림을 ObjectOutputStream으로 감쌉니다.
        
        // 2. 데이터 쓰기
        oos.writeUTF("Hello Server"); // 서버에 메시지를 보냅니다.
        
        // 3. flush
        oos.flush(); // 출력 스트림의 내용을 즉시 전송합니다.
        
        // 데이터 받기
        InputStream is = socket.getInputStream(); // 소켓으로부터 입력 스트림을 가져옵니다.
        ObjectInputStream ois = new ObjectInputStream(is); // 입력 스트림을 ObjectInputStream으로 감쌉니다.
        String msg = ois.readUTF(); // 서버로부터 메시지를 읽어옵니다.
        System.out.println("[server 메시지] " + msg); // 읽어온 메시지를 출력합니다.
        
        // 5. 자원 정리
        oos.close(); // 출력 스트림을 닫습니다.
        ois.close(); // 입력 스트림을 닫습니다.
        
        // 6. 접속 종료
        socket.close(); // 소켓을 닫습니다.
    }
}
