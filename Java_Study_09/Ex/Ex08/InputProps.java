package Java_Study_09.Ex.Ex08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InputProps {

    public static void main(String[] args) throws IOException {
        
        // 1. 주 스트림 생성
        // 설정 파일을 읽기 위한 파일 입력 스트림 생성
        FileInputStream file = new FileInputStream("src\\chapter09\\exam09\\setting.properties");
        
        // 2. 보조 스트림 생성
        // 성능 향상을 위해 BufferedInputStream 사용
        BufferedInputStream bis = new BufferedInputStream(file);
        
        // 3. 파일 읽기
        // Properties 객체 생성 및 파일로부터 데이터를 로드
        Properties prop = new Properties();
        prop.load(bis);
        
        // 3-1. 데이터 꺼내오기
        // "id"와 "pass" 속성 값을 읽어옴
        String id = (String) prop.get("id"); // id 값 가져오기
        String pass = prop.getProperty("pass"); // pass 값 가져오기
        System.out.println(id + " / " + pass); // id와 pass 출력
        
        // 모든 속성 키와 값을 출력
        for (Object key : prop.keySet()) {
            System.out.println((String) key + " : " + prop.get(key)); // 각 키와 값 출력
        }
        
        // 4. 자원 반납
        // 사용한 BufferedInputStream을 닫아 자원 관리
        bis.close();
    }
}