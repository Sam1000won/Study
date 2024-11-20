package Java_Study_09.Ex.Ex02;

import java.io.File;
import java.io.FileReader;

public class InputMain {
    public static void main(String[] args) {
        
        // 1. 읽어올 경로 지정 + 2. 파일 객체 생성
        // "C:/img/temp/test.txt" 경로의 File 객체 생성
        File file = new File("C:/img/temp/test.txt");
        
        // 3. FileReader를 사용하여 파일 읽기 준비
        try (FileReader reader = new FileReader(file);) { // try-with-resources 구문을 사용하여 자원 관리
            // 4. 읽어오기
            int data; // 파일에서 읽어온 데이터를 저장할 변수
            // read() 메서드를 사용하여 파일에서 한 문자씩 읽음
            while ((data = reader.read()) != -1) { // -1은 EOF(End Of File)를 의미
                // 읽어온 데이터를 문자로 변환하여 출력
                System.out.print((char)data); // 읽은 문자를 콘솔에 출력
            }
            
            // 5. 사용한 자원 닫기 - try-with-resources를 사용하면 자동으로 자원이 닫힘
            // reader.close(); // 이 줄은 필요 없음, try-with-resources가 자동으로 닫음
        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스를 출력
            e.printStackTrace(); // 예외 정보를 출력하여 디버깅에 도움을 줌
        }
    }
}
