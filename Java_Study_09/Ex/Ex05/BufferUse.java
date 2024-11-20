package Java_Study_09.Ex.Ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferUse {
    public static void main(String[] args) throws Exception {
        
        // 파일 복사 시간을 측정하기 위해 TimeChecker 객체를 생성
        TimeChecker checker = new TimeChecker();
        
        // 주 스트림 준비
        FileInputStream fis = new FileInputStream("C:/img/img.gif"); // 입력 파일 스트림 생성
        FileOutputStream fos = new FileOutputStream("C:/img/temp/img1.gif"); // 출력 파일 스트림 생성
        
        // 보조 스트림을 사용하여 성능 향상
        // BufferedInputStream과 BufferedOutputStream을 사용하여 속도 향상
        BufferedInputStream bis = new BufferedInputStream(fis); 
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        // 파일 복사 시작 시간을 측정
        checker.timeStart();
        
        // 입력 스트림에서 읽어온 Binary 값을 저장할 정수형 변수 선언
        int data; 
        
        // 입력 스트림으로부터 데이터를 읽어와 새로운 파일에 복사
        // 더 이상 읽을 값이 없으면 -1을 반환하여 반복문 종료
        while ((data = bis.read()) != -1) {
            bos.write(data); // 입력 스트림으로부터 읽어온 값을 출력 스트림에 기록
        }
        
        // 파일 복사에 걸린 시간을 출력
        System.out.println("버퍼 사용 시 : " + checker.timeEnd() + " ms"); 
        
        // 버퍼에 남아 있는 데이터를 모두 출력
        bos.flush(); // 남아 있는 데이터를 모두 출력
        // 사용한 자원을 닫아 자원 관리
        bos.close(); // 출력 스트림 닫기
        bis.close(); // 입력 스트림 닫기
    }
}
