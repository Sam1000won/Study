package Java_Study_11.Ex02; // 패키지 선언

import java.io.IOException; // IOException 클래스를 가져옵니다. 입출력 작업에서 발생할 수 있는 예외를 처리하기 위해 사용됩니다.
import java.net.InetSocketAddress; // InetSocketAddress 클래스를 가져옵니다. IP 주소와 포트 번호를 함께 다루기 위해 사용됩니다.
import java.net.ServerSocket; // ServerSocket 클래스를 가져옵니다. 서버 소켓을 다루기 위해 사용됩니다.
import java.net.Socket; // Socket 클래스를 가져옵니다. 클라이언트 소켓을 다루기 위해 사용됩니다.

public class Server { // Server 클래스를 정의합니다.
    public static void main(String[] args) throws IOException { // 프로그램의 시작점인 main 메서드입니다. IOException을 throws 합니다.
        ServerSocket server = null; // ServerSocket 객체를 null로 초기화합니다.
        
        try {
            server = new ServerSocket(5001); // 포트 5001에서 클라이언트 연결을 기다리는 서버 소켓을 생성합니다.
        
            while (true) { // 무한 루프를 시작하여 클라이언트의 연결을 계속해서 기다립니다.
                System.out.println("기달"); // 클라이언트 연결을 기다리는 메시지를 출력합니다.
                Socket socket = server.accept(); // 클라이언트의 연결을 수락하고 Socket 객체를 반환합니다.
                
                // 클라이언트의 원격 소켓 주소를 가져옵니다.
                InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress(); // getRemoteSocketAddress()를 사용하여 원격 주소를 가져옵니다.
                System.out.println(addr.getAddress() + " " + addr.getPort()); // 클라이언트의 IP 주소와 포트 번호를 출력합니다.
            }
        } catch (Exception e) { // 예외 발생 시
            e.printStackTrace(); // 예외의 스택 트레이스를 출력합니다.
        } finally {
            if (server != null) { // 서버 소켓이 null이 아닐 경우
                server.close(); // 서버 소켓을 닫습니다.
            }
        }
    }
}
