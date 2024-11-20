package Java_Study_08.Java_08.Ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        // HashMap 객체 생성: 학생 이름과 점수를 저장
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("김철호", 99);    
        map.put("박동빈", 80);
        map.put("박은비", 75);
        map.put("신솔비", 43);
        map.put("한은정", 52);
        map.put("김민지", 100);
        map.put("김윤경", 80);
        map.put("정철수", 99);
        map.put("안은호", 87);
        map.put("최영일", 75);
        
        // 특정 키(학생 이름)가 존재하는지 확인
        if (map.containsKey("박은비")) {
            System.out.println("박은비라는 키가 존재합니다.");
        } else {
            System.out.println("박은비라는 키가 존재하지 않습니다.");
        }
                
        // 특정 값(점수)이 존재하는지 확인
        if (map.containsValue(99)) {
            System.out.println("99라는 값이 있습니다.");
        } else {
            System.out.println("99라는 값이 없습니다.");
        }
        
        // 99점을 받은 학생의 이름을 찾는 방법
        String result = "";
        
        // ============================================
        // 방법 1: keySet을 이용하여 값 비교
        for (String st : map.keySet()) {
            if (map.get(st) == 99) {    // 값이 99인 경우
                result += st;           // 키(학생 이름)를 추가
                System.out.println(result + "는 99점을 맞은 학생입니다.");
                break;                 // 한 명만 찾을 경우, 효율적인 방법
            }
        }		
						
        // ============================================
        // 방법 2: entrySet을 이용하여 키와 값 모두 가져오기
        Set<Entry<String, Integer>> entrySet = map.entrySet();  // Map에서 EntrySet 추출
        for (Entry<String, Integer> entry : entrySet) {          // Entry형식으로 반복
            if (entry.getValue() == 99) {                        // 값이 99인 경우
                String key = entry.getKey();                    // 키 추출
                System.out.println(key + "가 99점을 맞은 학생입니다.");  
                break; // 한 명만 찾는 경우
            }
        }
		
        // ============================================
        // 방법 3: Iterator를 이용하여 키와 값 가져오기
        Set<String> kset = map.keySet();          // keySet 추출
        Iterator<String> iter = kset.iterator();  // Iterator로 분리
        String val = "";
        int ival = 0;
		
        while (iter.hasNext()) {           // 출력할 값이 있다면 반복
            val = iter.next();             // 키 가져오기
            ival = map.get(val);           // 값 가져오기
            if (ival == 99) {              // 값이 99인 경우
                System.out.println(val + "가 99점을 맞은 학생입니다.");
                break;                    // 여러 명을 출력하고 싶으면 주석 처리
            }
        }		
    }		
}
