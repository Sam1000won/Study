package Java_Study_11.Ex04;

import java.io.BufferedInputStream; // 버퍼링된 입력 스트림을 위한 클래스
import java.io.BufferedOutputStream; // 버퍼링된 출력 스트림을 위한 클래스
import java.io.DataOutputStream; // 데이터 출력 스트림을 위한 클래스
import java.io.File; // 파일을 다루기 위한 클래스
import java.io.FileInputStream; // 파일 입력 스트림을 위한 클래스
import java.io.IOException; // 입출력 예외를 처리하기 위한 클래스
import java.io.OutputStream;
import java.net.Socket; // 소켓을 다루기 위한 클래스
import java.net.UnknownHostException; // 호스트를 찾을 수 없을 때 발생하는 예외

public class FileClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // 1. 소켓 준비
        Socket socket = new Socket("localhost", 5001); // 192.168.70.135
        // 2. 예외가 발생하지 않았으면 접속 성공
        System.out.println("접속완료");

        // 3. 소켓을 통한 통신 준비					
        // 3-1. FileInputStream 준비
        File file = new File("C:\\img\\temp\\img1234.gif");
        FileInputStream fis = new FileInputStream(file);

        // 3-2. 보조 스트림 준비
        BufferedInputStream bis = new BufferedInputStream(fis);		

        // 3-3. 소켓에서 내보낼 주 스트림 준비
        OutputStream os = socket.getOutputStream();

        // 3-4. 보조 스트림 준비
        BufferedOutputStream bos = new BufferedOutputStream(os);

        // 3-5. 읽어온 바이너리 데이터 전송		
        byte[] arr = new byte[(int) file.length()];  // file객체의 length메소드로 파일의 크기를 알아낸다.
        bis.read(arr); // 파일 내용을 바이트 배열에 읽어옵니다.
        String fileName = file.getName(); // file객체의 getName메소드로 파일의 이름을 가져옵니다.

        // 문자열, 바이너리를 보낸다.
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeUTF(fileName); // 파일 이름을 서버에 전송합니다.
        dos.write(arr); // 파일 내용을 서버에 전송합니다.

        // 3-6. flush()
        dos.flush(); // 출력 스트림의 내용을 즉시 전송합니다.
        System.out.println("전송완료, 전송된 파일 사이즈 : " + (file.length() / 1024 / 1024) + "MB");

        // 4. 자원 반납
        bis.close(); // 입력 스트림을 닫습니다.
        dos.close(); // 출력 스트림을 닫습니다.
        socket.close(); // 소켓을 닫습니다.
    }
}
