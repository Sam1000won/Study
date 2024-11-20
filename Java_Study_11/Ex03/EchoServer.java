package Java_Study_11.Ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; // ObjectOutputStream을 가져옵니다.
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        try {
            server = new ServerSocket(5001); // 포트 5001에서 클라이언트 연결을 기다리는 서버 소켓을 생성합니다.
            while (true) {
                System.out.println("요청중"); // 클라이언트 연결을 기다리는 메시지를 출력합니다.
                Socket socket = server.accept(); // 클라이언트의 연결을 수락합니다.
                
                InputStream is = socket.getInputStream(); // 클라이언트로부터 입력 스트림을 가져옵니다.
                ObjectInputStream ois = new ObjectInputStream(is); // 입력 스트림을 ObjectInputStream으로 감쌉니다.
                String msg = ois.readUTF(); // 메시지를 읽어옵니다.
                System.out.println(msg); // 읽어온 메시지를 출력합니다.
                
                OutputStream os = socket.getOutputStream(); // 클라이언트로 보낼 출력 스트림을 가져옵니다.
                ObjectOutputStream oos = new ObjectOutputStream(os); // 출력 스트림을 ObjectOutputStream으로 감쌉니다.
                oos.writeUTF(msg); // 클라이언트에게 메시지를 보냅니다.
                oos.flush(); // 출력 스트림의 내용을 즉시 전송합니다.

                ois.close(); // 입력 스트림을 닫습니다.
                oos.close(); // 출력 스트림을 닫습니다.
            }
        } catch (Exception e) {
            if (server != null) {
                server.close(); // 서버 소켓을 닫습니다.
            }
            System.out.println("서버 종료"); // 서버 종료 메시지를 출력합니다.
        }
    }
}
