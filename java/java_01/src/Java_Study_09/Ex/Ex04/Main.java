package Java_Study_09.Ex.Ex04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 사용자가 입력한 내용을 c:/img/temp/sample.txt 에 저장
        
        // 1. 내보낼 파일 위치 설정 및 객체화 + 2. 내보낼 빨대 준비
        // "c:/img/temp/sample.txt" 위치에 파일을 열기 위한 FileWriter 객체 생성
        FileWriter writer = new FileWriter("c:/img/temp/sample.txt", true); // true: append 모드로 열기
        
        // 3. 스캐너 준비
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 > "); // 사용자에게 입력을 요청하는 메시지 출력
        
        // 4. 스캐너로부터 입력 받기 + 5. 입력 받은 내용 내보내기
        // 사용자가 입력한 내용을 파일에 작성, \r\n을 사용하여 줄바꿈
        writer.write(scan.nextLine() + "\r\n"); // 입력된 내용을 sample.txt에 기록
        
        // 6. 확실히 내보내고, 자원 반납
        writer.flush(); // 버퍼에 남아 있는 내용을 파일에 강제로 기록
        writer.close(); // FileWriter 객체를 닫아 자원 반납
        scan.close(); // Scanner 객체를 닫아 자원 반납
    }
}
