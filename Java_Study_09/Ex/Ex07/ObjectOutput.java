package Java_Study_09.Ex.Ex07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectOutput {
    public static void main(String[] args) throws IOException {
        
        // 1. 경로 설정 및 스트림 준비
        // 객체를 저장할 파일의 경로를 지정하고 출력 스트림을 생성
        FileOutputStream fos = new FileOutputStream("C:/img/temp/obj.dat");
        
        // 2. 보조 스트림 준비
        // BufferedOutputStream을 통해 성능을 향상시키고,
        // ObjectOutputStream을 사용하여 객체를 직렬화하여 기록
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        
        // 3. 데이터 내보내기
        // Map 객체 생성 및 데이터 추가
        Map<String, String> map = new HashMap<String, String>(); // Map 생성
        map.put("name", "홍길동"); // 이름 추가
        map.put("phone", "01012341234"); // 전화번호 추가
        
        // Map 객체를 직렬화하여 파일에 기록
        oos.writeObject(map);
        
        // int 배열 직렬화하여 기록
        oos.writeObject(new int[] {70, 80, 90, 100}); // 배열 저장
        
        // 문자열 직렬화하여 기록
        oos.writeUTF("기본적엔 데이터도 넣을 수 있다."); // UTF 형식으로 문자열 저장
        
        // Sample 객체 직렬화하여 기록
        oos.writeObject(new Sample()); // Sample 객체 저장
        
        // 4. 마무리
        // 버퍼에 남아 있는 데이터를 파일로 전송하고 스트림 종료
        oos.flush(); // 남아 있는 데이터 강제로 출력
        oos.close(); // 사용한 객체 출력 스트림 닫기
    }
}
