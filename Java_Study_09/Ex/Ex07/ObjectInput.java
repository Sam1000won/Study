package Java_Study_09.Ex.Ex07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

public class ObjectInput {
    public static void main(String[] args) throws Exception {
        // 1. 경로 설정 및 주 스트림 준비
        // 객체를 읽어올 파일의 경로를 지정하고 입력 스트림을 생성
        FileInputStream fis = new FileInputStream("C:\\img\\temp\\obj.dat");
        BufferedInputStream bis = new BufferedInputStream(fis); // 버퍼를 추가하여 성능 향상
        ObjectInputStream ois = new ObjectInputStream(bis); // 객체를 읽기 위한 스트림 생성
        
        // 2. 데이터 가져오기
        // - Map 객체 읽기
        Map<String, String> map = (Map<String, String>) ois.readObject(); // 객체를 Map으로 형변환
        System.out.println(map); // 읽어온 Map 출력
        
        // - int 배열 읽기
        int[] scores = (int[]) ois.readObject(); // 객체를 int 배열로 형변환
        System.out.println(Arrays.toString(scores)); // 배열 내용을 출력
        
        // - String 객체 읽기
        String msg = ois.readUTF(); // UTF 형식으로 문자열 읽기
        System.out.println(msg); // 읽어온 문자열 출력
        
        // - Sample 객체 읽기
        Sample sample = (Sample) ois.readObject(); // 객체를 Sample로 형변환
        System.out.println("team : " + sample.team); // Sample 객체의 team 출력
        System.out.println(sample.method()); // Sample 객체의 메서드 호출 결과 출력
        
        // 3. 자원 반납
        ois.close(); // 사용한 객체 입력 스트림 닫기
    }
}
