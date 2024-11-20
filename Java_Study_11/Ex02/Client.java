package Java_Study_11.Ex02; // 패키지 선언

import java.net.Socket; // Socket 클래스를 가져옵니다. 네트워크 소켓을 다루기 위해 사용됩니다.

public class Client { // Client 클래스를 정의합니다.
    public static void main(String[] arss) throws Exception { // 프로그램의 시작점인 main 메서드입니다. 모든 예외를 throws 합니다.
        // 서버에 연결하기 위해 소켓을 생성합니다.
        Socket socket = new Socket("localhost", 5001); // localhost(자기 자신)와 포트 5001에 연결하는 소켓을 생성합니다.
        
        // 연결 성공 메시지 출력
        System.out.println("접완"); // "접완" 메시지를 출력하여 연결 성공을 알립니다.
        
        // 종료 메시지 출력
        System.out.println("종료"); // "종료" 메시지를 출력합니다.

        // 소켓을 닫습니다.
        socket.close(); // 연결이 완료되면 소켓을 닫습니다. (여기서 세미콜론이 누락되어 오류가 발생합니다)
    }
}
