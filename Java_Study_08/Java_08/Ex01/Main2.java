package Java_Study_08.Java_08.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        
        // Integer 타입의 점수를 저장할 ArrayList 선언
        List<Integer> score = new ArrayList<Integer>();
        
        // 점수 데이터 추가
        score.add(70);  // index 0에 70 추가
        score.add(80);  // index 1에 80 추가
        score.add(50);  // index 2에 50 추가
        score.add(90);  // index 3에 90 추가
        score.add(100); // index 4에 100 추가
        score.add(90);  // index 5에 90 추가 (중복 값 허용)
        
        // 데이터 수정
        // 3번 인덱스의 값을 95로 변경하고, 이전 값을 prev 변수에 저장
        int prev = score.set(3, 95);     
        System.out.println("변경 전 값 : " + prev); // 변경 전의 값을 출력
        System.out.println(score); // 현재 리스트 상태 출력
        
        // 특정 값 검색(포함 여부 확인)
        // score 리스트에 95가 포함되어 있는지 확인
        System.out.println("95 있나요? " + score.contains(95));
        
        // 특정 값 검색(index 반환)
        // score 리스트에서 95의 위치(index)를 반환
        System.out.println("95의 위치 : " + score.indexOf(95));
        
        // 모든 데이터 삭제
        score.clear(); // score 리스트의 모든 요소를 삭제
        
        // score를 완전히 비우고 싶다면, 새로운 ArrayList 객체를 생성하는 것이 더 효율적일 수 있음
        score = new ArrayList<Integer>(); // 새로운 ArrayList로 score 재초기화
        
        // 데이터 존재 여부 확인
        // score 리스트가 비어 있는지 확인
        System.out.println(score.isEmpty()); // 비어 있으면 true, 아니면 false 출력
    }
}