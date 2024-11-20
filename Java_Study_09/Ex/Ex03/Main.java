package Java_Study_09.Ex.Ex03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        
        // 1. 파일 위치 지정 + 객체화
        // 복사할 원본 파일과 복사본을 저장할 파일의 경로를 지정하고 File 객체 생성
        File src = new File("C:/img/img.gif");
        File dst = new File("C:/img/temp/img_copy.gif");
        
        // 2. FileInputStream과 FileOutputStream 준비
        try (
            // src 파일을 읽기 위한 FileInputStream 생성
            FileInputStream fis = new FileInputStream(src);
            // dst 파일에 쓰기 위한 FileOutputStream 생성
            FileOutputStream fos = new FileOutputStream(dst);
        ) {
            // 1024 바이트 크기의 버퍼 배열 준비
            byte[] cup = new byte[1024]; // 파일을 읽어올 때 사용할 배열
            int i = 0; // 복사한 블록 수를 세기 위한 변수
            
            // 3. 파일 복사 시작
            while (fis.read(cup) != -1) { // fis.read(cup)로 버퍼에 데이터를 읽음
                fos.write(cup); // 읽어온 데이터를 dst 파일에 씀
                i++; // 복사한 블록 수 증가
                System.out.println("파일 복사중..." + i); // 진행 상황 출력
            }

            // 5. 모든 데이터를 다 썼는지 확인
            fos.flush(); // 출력 스트림의 남아있는 데이터를 강제로 파일에 기록
            
            // 6. 자원 반납: try-with-resources를 사용하므로 자동으로 자원 닫힘
            
        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스를 출력
            e.printStackTrace(); // 예외 정보를 출력하여 디버깅에 도움을 줌
        }
    }
}
