package Java_Study_09.Ex.Ex08;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutputProps {

    public static void main(String[] args) throws IOException {
        
        // 1. 주 스트림 및 보조 스트림 준비
        // 설정 파일을 작성하기 위한 출력 스트림 생성
        FileOutputStream fos = new FileOutputStream("src\\chapter09\\exam09\\setting.properties");
        BufferedOutputStream bos = new BufferedOutputStream(fos); // 성능 향상을 위한 보조 스트림
        
        // 1-1. Properties 객체 생성
        Properties prop = new Properties();
        
        // 1-2. 데이터 추가
        // Properties 객체에 key-value 쌍으로 데이터 추가
        prop.put("id", "admin");                     // 사용자 ID
        prop.put("pass", "1234");                    // 비밀번호
        prop.put("name", "kim, ji-hoon");           // 이름
        prop.put("phone", "01012341234");            // 전화번호
        prop.put("email", "admin@email.com");        // 이메일
        
        // 2. 내보내기
        // Properties 객체의 데이터를 파일에 저장
        prop.store(bos, "simple comment"); // 주석과 함께 저장
        System.out.println("저장완료"); // 저장 완료 메시지 출력
        
        // 3. flush 및 자원 반납
        bos.close(); // 사용한 보조 출력 스트림을 닫아 자원 관리
    }
}
