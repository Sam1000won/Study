package Java_Study_09.Ex.Ex02;

import java.io.File;
import java.io.FileWriter;

public class OutputMain {
    public static void main(String[] args) {
        
        // 1. 저장할 위치 + 파일 객체 생성
        // "C:/img/temp/user001.txt" 경로의 File 객체 생성
        File file = new File("C:/img/temp/user001.txt");
        
        // 2. FileWriter 준비
        // FileWriter는 지정된 파일에 문자 데이터를 쓸 수 있게 해주는 클래스
        // 'true'를 사용하여 파일에 내용을 추가(append) 모드로 열기
        try (FileWriter writer = new FileWriter(file, true);) {
            // 3. 내보내기
            // 지정된 파일에 문자열을 작성
            writer.write("Hello, JAVA I.O."); // "Hello, JAVA I.O."를 파일에 작성
            
            // 4. flush 및 자원 반납
            // flush()는 버퍼에 남아 있는 데이터를 강제로 파일에 기록
            writer.flush(); // FileWriter에서 버퍼를 비우고 파일에 내용을 기록
        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스를 출력
            e.printStackTrace(); // 예외 정보를 출력하여 디버깅에 도움을 줌
        }   
    }
}
