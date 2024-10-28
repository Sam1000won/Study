package Java_Study_08.Java_08.Ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // HashMap 객체 생성, 키는 String, 값은 Integer 타입
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        // 데이터를 추가 (put 메소드를 사용)
        map.put("kim", 23);  // 이름과 나이
        map.put("lee", 26);  
        map.put("park", 26); // 값의 중복 허용
        map.put("kim", 30);  // 키의 중복, 이전 값이 30으로 업데이트됨
        
        // 현재 맵의 크기 출력
        System.out.println("map size : " + map.size());
        System.out.println(map); // 전체 내용 출력
        
        // 특정 키에 해당하는 값 가져오기
        System.out.println("lee의 나이 : " + map.get("lee"));
        
        // 특정 키의 값을 삭제하고 삭제된 값을 변수에 저장
        int age = map.remove("park"); 
        System.out.println("내가 지운 값 : " + age); // 삭제된 값 출력
        
        /* 맵의 모든 값 하나씩 뽑아오기 */
        // ====================================================
        // 1. 키만 Set 형태로 뽑아오기
        Set<String> keySet = map.keySet();
        
        // 2. Set을 Iterator로 쪼개기
        Iterator<String> iter = keySet.iterator();        
        
        // 3. 각 키에 대해 해당하는 값을 가져와서 출력
        while(iter.hasNext()) {
            String key = iter.next(); // 다음 키 가져오기
            int val = map.get(key);   // 해당 키의 값 가져오기
            System.out.println(key + " : " + val); // 키와 값 출력
        }
        
        // ====================================================
        // Entry(키:값)을 Set 형태로 뽑아오기        
        // 1. Entry를 Set 형태로 가져온다
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        
        // 2. Iterator를 사용하여 하나씩 쪼갠다
        Iterator<Entry<String, Integer>> entry = entrySet.iterator();
        
        // 3. 하나씩 Entry(키:값)를 가져와 키와 값을 각각 추출하여 출력
        while (entry.hasNext()) {
            Entry<String, Integer> en = entry.next(); // 다음 Entry 가져오기
            String key = en.getKey(); // 키 가져오기
            int val = en.getValue();   // 값 가져오기
            System.out.println(key + " = " + val); // 키와 값 출력
        }
        
        // ====================================================
        // keySet과 향상된 for문을 이용한 방법
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key)); // 각 키에 대한 값을 출력
        }
    }
}

/* 
map size : 3
{lee=26, kim=30, park=26}
lee의 나이 : 26
내가 지운 값 : 26
lee : 26
kim : 30
lee = 26
kim = 30
lee : 26
kim : 30 출력
 */