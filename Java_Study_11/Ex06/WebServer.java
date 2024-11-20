package Java_Study_11.Ex06;

import java.io.DataInputStream; // 데이터 입력 스트림을 위한 클래스
import java.io.DataOutputStream; // 데이터 출력 스트림을 위한 클래스
import java.io.IOException; // 입출력 예외를 처리하기 위한 클래스
import java.io.PrintStream; // 출력 스트림을 위한 클래스
import java.net.ServerSocket; // 서버 소켓을 다루기 위한 클래스
import java.net.Socket; // 소켓을 다루기 위한 클래스
import java.util.concurrent.ExecutorService; // 스레드 풀을 위한 클래스
import java.util.concurrent.Executors; // 스레드 풀 생성을 위한 클래스

public class WebServer { // WebServer 클래스를 정의합니다.
    public static void main(String[] args) throws IOException { // 프로그램의 시작점인 main 메서드입니다.
        // 1. 스레드 풀 생성
        int n = Runtime.getRuntime().availableProcessors(); // 사용 가능한 프로세서 수
        ExecutorService pool = Executors.newFixedThreadPool(n); // 고정 크기의 스레드 풀 생성
        
        // 2. 서버 소켓 생성
        ServerSocket server = new ServerSocket(8080); // 포트 8080에서 클라이언트의 연결을 기다립니다.
        
        // 3. 요청 대기
        while (true) {
            System.out.println("접속 요청 대기");
            Socket socket = server.accept(); // 클라이언트의 요청을 수락
            System.out.println("접속 완료");
            
            // 스레드가 할 일(pool에 대여 요청)
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        // 주 스트림 + 보조 스트림
                        DataInputStream dis = new DataInputStream(socket.getInputStream()); // 입력 스트림 준비
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // 출력 스트림 준비
                        
                        // HTTP 프로토콜에 의하면 최대 65536 byte를 넘지 못하게 되어있다.						
                        byte[] arr = new byte[65536]; // 요청을 위한 바이트 배열
                        dis.read(arr); // 요청 데이터 읽기
                        
                        // byte 배열 => String으로 변환
                        String request = new String(arr); // 요청을 문자열로 변환
                        System.out.println(request); // 요청 내용을 출력
                        
                        // 응답(response) : 응답이 없으면 브라우저는 계속 기다린다.
                        PrintStream ps = new PrintStream(socket.getOutputStream()); 
                        ps.print("HTTP/1.1 200 OK\r\n"); // HTTP 응답 헤더
                        ps.print("Content-type: text/html\r\n"); // 콘텐츠 타입 헤더
                        ps.print("\r\n"); // 헤더와 바디 구분
                        ps.print("<h3>Success Receive</h3>"); // 응답 바디
                        ps.flush(); // 데이터 전송
                        
                        // 자원 반납
                        dis.close();
                        dos.close();						
                        ps.close();
                        socket.close(); 						
                    } catch (Exception e) {
                        e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력합니다.
                    }
                }
            };
            
            // 반환 값이 없는 Runnable은 execute로 실행!
            pool.execute(run); // 스레드 풀에 작업 요청
        }
    }
}
