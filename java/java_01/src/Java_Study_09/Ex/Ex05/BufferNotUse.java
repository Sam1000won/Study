package Java_Study_09.Ex.Ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferNotUse {
    public static void main(String[] args) throws Exception {
        
        // 1. 데이터 위치 지정 및 스트림 준비
        // 파일 복사 시간을 측정하기 위해 TimeChecker 객체 생성
        TimeChecker checker = new TimeChecker();
        // 입력 파일 스트림 생성
        FileInputStream fis = new FileInputStream("C:/img/img.gif");
        // 출력 파일 스트림 생성
        FileOutputStream fos = new FileOutputStream("C:/img/temp/img1.gif");
        
        // 2. 파일 읽기 및 쓰기 시작
        // 복사 시작 시간 측정
        checker.timeStart();
        int data; // 데이터를 저장할 변수
        
        // 파일에서 데이터를 하나씩 읽어 출력 파일에 기록
        while ((data = fis.read()) != -1) {
            fos.write(data); // 읽어온 데이터를 출력 스트림에 기록
        }        
        
        // 3. 소요 시간 출력
        System.out.println("버퍼 미사용 시 : " + checker.timeEnd() + " ms"); 
        
        // 4. 남아 있는 데이터를 강제로 출력하고 스트림 닫기
        fos.flush(); // 출력 스트림의 버퍼를 비움
        fos.close(); // 출력 스트림 종료
        fis.close(); // 입력 스트림 종료
    }
}
