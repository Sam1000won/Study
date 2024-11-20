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

public class FileClient2 { // FileClient2 클래스를 정의합니다.
    public static void main(String[] args) throws UnknownHostException, IOException { // 프로그램의 시작점인 main 메서드입니다.
        // 1. 소켓 생성
        Socket socket = new Socket("localhost", 5001); // 로컬 서버의 포트 5001에 연결합니다.
        
        // 2. 예외가 발생하지 않았으면 접속 성공
        System.out.println("접속완료");
        
        // 2. 내 PC의 파일을 읽어온다.
        File file = new File("C:\\img\\temp\\img1.gif"); // 전송할 파일을 지정합니다.
        // 2-1. 주 스트림
        FileInputStream fis = new FileInputStream(file); // 파일 입력 스트림을 생성합니다.
        // 2-2. 보조 스트림
        BufferedInputStream bis = new BufferedInputStream(fis); // 버퍼링된 입력 스트림을 생성합니다.
        
        // 3. 소켓을 스트림에 담아준다.
        // 3-1. 주 스트림
        OutputStream os = socket.getOutputStream(); // 소켓으로부터 출력 스트림을 가져옵니다.
        // 3-2. 보조 스트림 
        BufferedOutputStream bos = new BufferedOutputStream(os); // 버퍼링된 출력 스트림을 생성합니다.
        // 3-3. 보조 스트림 - 데이터 스트림 사용
        DataOutputStream dos = new DataOutputStream(bos); // 데이터 출력 스트림을 생성합니다.
                    
        // 4. 데이터 스트림에 데이터 넣어주기 
        // 4-1. 내 PC에서 읽어온 파일의 이름, 길이를 가져온다.
        byte[] arr = new byte[(int) file.length()]; // 파일 크기만큼의 바이트 배열을 생성합니다.
        bis.read(arr); // 파일 내용을 바이트 배열에 읽어옵니다.
        
        dos.writeUTF(file.getName()); // 파일 이름을 서버에 전송합니다.
        dos.write(arr); // 파일 내용을 서버에 전송합니다.
        
        // 5. flush 처리
        dos.flush(); // 출력 스트림의 내용을 즉시 전송합니다.
        System.out.println("전송할 파일의 사이즈는 " + (file.length() / 1024 / 1024) + "MB"); // 전송된 파일의 크기를 출력합니다.
        
        // 6. 자원 반납
        bis.close(); // 입력 스트림을 닫습니다.
        dos.close(); // 출력 스트림을 닫습니다.
        socket.close(); // 소켓을 닫습니다.
    }
}
