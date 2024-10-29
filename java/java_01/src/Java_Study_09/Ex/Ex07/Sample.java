package Java_Study_09.Ex.Ex07;

import java.io.Serializable;

// Serializable 인터페이스를 구현하여 직렬화 및 역직렬화를 가능하게 하는 클래스
public class Sample implements Serializable {
    
    // 네트워크에서 객체를 구분하기 위한 고유 ID
    // serialVersionUID는 클래스의 버전을 나타내며,
    // 직렬화된 객체의 일관성을 보장하기 위해 사용됨
    private static final long serialVersionUID = 1L;
    
    // 클래스의 필드
    int num = 11;              // 숫자 필드
    String team = "Edu";      // 팀 이름 필드
    String job = "manager";   // 직무 필드
    
    // 메서드 정의
    public String method() {
        return "메서드 호출완료!!"; // 메서드 호출 시 반환되는 문자열
    }
}
