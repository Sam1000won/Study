package Java_Study_09.Ex.Ex06;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInput {

    public static void main(String[] args) throws Exception {
        
        // [Input]
        // 1. 내보낼 파일 위치 설정
        // 읽어올 파일의 경로를 지정
        FileInputStream fis = new FileInputStream("C:\\img\\temp\\data.dat");
        
        // 2. Input Stream 준비
        // 3. 보조 버퍼 추가 (Data, Buffer)
        BufferedInputStream bis = new BufferedInputStream(fis); // 버퍼를 추가하여 성능 향상
        DataInputStream dis = new DataInputStream(bis); // 데이터 입력 스트림을 생성
        
        // 4. 데이터 읽고 출력하기
        // 각 데이터 타입에 맞게 읽기
        String name = dis.readUTF();               // 문자열 읽기
        int salary = dis.readInt();                // 정수 읽기
        boolean promotion = dis.readBoolean();     // boolean 읽기
                
        // 읽어온 데이터를 출력
        System.out.println(name + " / " + salary + " / " + promotion);
        
        // 5. 사용한 자원 닫기
        dis.close(); // 데이터 입력 스트림 닫기
    }
}
