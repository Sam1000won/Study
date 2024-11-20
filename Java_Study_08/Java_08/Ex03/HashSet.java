package Java_Study_08.Java_08.Ex03;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        // Set 인터페이스의 구현체인 HashSet 객체 생성
        Set<String> set = new java.util.HashSet<String>();

        // 문자열 데이터 추가 (중복된 "Java"는 무시됨)
        set.add("Java");
        set.add("Jsp");
        set.add("DB");
        set.add("Spring Boot");
        set.add("Java"); // 중복 데이터
        set.add("Python");

        // 현재 Set의 크기 출력
        System.out.println("Set의 크기: " + set.size()); // 중복을 제거한 크기 출력

        // Member 객체를 저장할 HashSet 생성
        Set<Member> member = new java.util.HashSet<Member>();
        member.add(new Member()); // Member 객체 추가
        member.add(new Member()); // 중복된 Member 객체 추가 (중복 처리됨)
        System.out.println("Member Set의 크기: " + member.size()); // 중복을 제거한 크기 출력
        
        // Set의 내용을 Iterator를 사용하여 하나씩 꺼내기
        // 1. Iterator 객체 생성
        Iterator<String> iter = set.iterator();
        
        // 2. next() 메소드를 통해 요소를 하나씩 출력
        System.out.println("Set의 요소:");
        while(iter.hasNext()) {
            String item = iter.next(); // 다음 요소 가져오기
            System.out.println(item); // 요소 출력
        }
        
        // 데이터 삭제 (인덱스가 아닌 값으로 삭제)
        set.remove("DB"); // "DB" 요소 삭제
        System.out.println("삭제 후 Set의 요소:");
        for(String item : set) {
            System.out.println("향상된 for : " + item); // 향상된 for문을 사용하여 요소 출력
        }
        
        // Set의 모든 요소를 삭제하고 비어 있는지 확인
        if(!set.isEmpty()) { // Set이 비어 있지 않다면
            set.clear(); // 모든 요소 삭제
        }
        
        // 비어 있는 Set 출력
        System.out.println("비어 있는 Set: " + set); // 출력 시 비어 있는 Set을 확인
    }
}

// Member 클래스 정의 (아직 필드나 메소드가 없음)
class Member {}
/*
출력 결과
5
2
Java
Jsp
Spring Boot
DB
Python

향상된 for : Java
향상된 for : Jsp
향상된 for : Spring Boot
향상된 for : Python
[]
 
 */