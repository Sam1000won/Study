package Java_Study_08.Java_08.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // ArrayList 선언
        // ArrayList는 크기가 가변적인 배열로, 초기 용량을 3으로 설정합니다.
        List<String> list = new ArrayList<>(3); 
        
        // 데이터 추가
        list.add("collection");  // 0번 인덱스에 "collection" 추가
        list.add("thread");      // 1번 인덱스에 "thread" 추가
        list.add("java IO");     // 2번 인덱스에 "java IO" 추가
        list.add("network");     // 3번 인덱스에 "network" 추가 (크기를 초과해도 예외 발생하지 않음)

        // 특정 인덱스에 데이터 추가
        // 3번 인덱스에 "lambda"를 추가하며, 기존의 값은 뒤로 밀림
        list.add(3, "lambda");   
        
        // 리스트 출력
        System.out.println(list); // 현재 리스트의 내용을 출력
        
        // 리스트 크기 확인 및 인덱스별 값 출력
        // list.size() 메소드를 사용하여 현재 리스트의 크기를 확인
        for (int i = 0; i < list.size(); i++) {
            // 각 인덱스에 해당하는 값을 출력
            System.out.println("[" + i + "] " + list.get(i));
        }            
        
        // 데이터 삭제
        // 0번 인덱스의 값을 삭제하고, 삭제된 값을 변수에 저장
        String removedValue = list.remove(0); 
        System.out.println("삭제한 값: " + removedValue); // 삭제된 값을 출력
        System.out.println(list); // 삭제 후 리스트 상태 출력
        
        // 특정 문자열 삭제 여부 확인
        // "network"라는 문자열을 삭제하고, 삭제 성공 여부를 boolean으로 반환
        boolean isSuccess = list.remove("network"); 
        System.out.println("network 삭제 여부: " + isSuccess); // 삭제 성공 여부 출력
        
        // for-each문을 사용한 리스트 출력
        // 리스트의 모든 요소를 순회하며 출력
        for (String str : list) {
            System.out.println(str); // 각 요소를 출력
        }
        
        // =========================================================
        // 배열 출력
        // 길이 2의 문자열 배열을 선언
        String[] arr = new String[2]; 
        arr[0] = "array"; // 첫 번째 요소에 "array" 저장
        arr[1] = "thread"; // 두 번째 요소에 "thread" 저장
        
        // Arrays.toString() 메소드를 사용하여 배열의 내용을 출력
        System.out.println(Arrays.toString(arr)); 
    }
}
