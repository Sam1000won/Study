package Java_Study_08.Java_08.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

    // List와 Array는 비슷한 자료구조로, 배열을 List로 변환
    
    // 1. 문자열 배열을 초기화합니다.
    String[] arr = {"List", "Set", "Map"};
    
    // 2. 배열을 List(인터페이스)로 변환합니다.
    // Arrays.asList() 메소드를 사용하여 배열을 List로 변환할 수 있습니다.
    // 이때, 배열의 데이터 타입은 클래스 형태여야 합니다.
    List<String> list = Arrays.asList(arr);
    
    // 3. 변환된 List의 크기를 출력합니다.
    System.out.println(list.size()); // 출력: 3 (배열의 요소 개수)
    
    // 4. List에서 인덱스 1의 요소를 가져와 출력합니다.
    System.out.println(list.get(1)); // 출력: Set (인덱스 1의 요소)
    
    // 5. List의 인덱스 2에 있는 요소를 "HashMap"으로 변경합니다.
    list.set(2, "HashMap");
    // 주의: list는 Arrays.asList()로 생성된 고정 크기의 List이기 때문에
    // 요소를 변경할 수는 있지만 요소를 추가하거나 삭제할 수는 없습니다.
    
    // 6. 요소를 추가하려고 시도하면 UnsupportedOperationException이 발생합니다.
    // list.add("test"); // 주석 처리된 이유는 위의 설명과 같습니다.
    
    // 7. 진짜 ArrayList로 변환하기 위해, List의 값을 ArrayList에 넣습니다.
    // ArrayList를 생성합니다.
    ArrayList<String> arrList = new ArrayList<String>();
    
    // 8. addAll() 메소드를 사용하여 list의 모든 요소를 arrList에 추가합니다.
    arrList.addAll(list);
    
    // 9. "collection"이라는 새로운 요소를 arrList에 추가합니다.
    arrList.add("collection");
    
    // 10. 최종적으로 arrList의 내용을 출력합니다.
    System.out.println(arrList); // 출력: [List, Set, HashMap, collection]
}

}
