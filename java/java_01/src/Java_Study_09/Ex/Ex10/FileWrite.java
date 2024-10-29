package Java_Study_09.Ex.Ex10;

import java.io.IOException;
import java.nio.file.Files; // 파일 작업을 위한 클래스
import java.nio.file.Path; // 파일 경로를 나타내는 클래스
import java.nio.file.Paths; // 경로를 생성하기 위한 클래스
import java.nio.file.StandardOpenOption; // 파일 열기 옵션
import java.util.Scanner; // 사용자 입력을 받기 위한 클래스

public class FileWrite {

    public static void main(String[] args) throws IOException {
        
        // 1. 파일 위치 지정 + 주 스트림 준비
        Path path = Paths.get("C:\\img\\temp\\write.txt"); // 파일 경로 설정
        
        // 파일이 존재하지 않으면 생성
        if (Files.notExists(path)) {
            System.out.println("파일 생성");
            Files.createFile(path); // 파일 생성
        }
        
        // 2. 보조 스트림 준비 => 필요 없음. (Java NIO에서 직접 파일에 쓰기 가능)
                                
        // 3-1. Scanner를 이용하여 값 받기
        Scanner scan = new Scanner(System.in); // Scanner 객체 생성
        System.out.println("입력 > ");
        String msg = scan.nextLine() + "\r\n"; // 사용자 입력을 받고 줄바꿈 추가
        
        // 3-2. 받은 값 쓰기
        Files.writeString(path, msg, StandardOpenOption.APPEND); // 파일에 입력된 문자열을 추가
        /* StandardOpenOption
         * APPEND : 파일 끝에 내용을 추가
         * CREATE : 파일이 없으면 새 파일 생성
         * READ : 파일을 읽기 모드로 열기
         * CREATE_NEW : 이미 파일이 존재하는 경우 새 파일 생성
         */
        System.out.println("파일 저장이 완료되었습니다."); // 저장 완료 메시지 출력
        
        // 4. 자원 반납
        scan.close(); // Scanner 객체 닫기
    }
}
