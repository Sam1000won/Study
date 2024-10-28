package Java_Study_08.Test.Ex02;

import java.util.HashMap;

public class Solution {
    public long solution(String numbers) {
    	long answer = 0;
    	// zero~nine 총 10개밖에 안되므로 각각의 케이스를 만들 수 있다.
    	// 숫자는 일단 문자열 형태로붙이고 나중에 Long형태로 변환해야 한다.    	  	    	    
    	
    	// 방법1 : 맵을 이용해서 해결하는 방법. (0.11 ~0.18ms)
    	HashMap<String, String> numberMap = getMap();
    	 
    	for (String key : numberMap.keySet()) {				
			numbers = numbers.replace(key, numberMap.get(key));			
		}
        
        // =====================================================            
    	// 방법2 : 배열이용 (0.10 ~ 0.16ms)
    	String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	for(int i=0; i<number.length; i++) {
    		numbers = numbers.replace(number[i], String.valueOf(i));
    	}
    	
    	answer = Long.parseLong(numbers);
    	return answer;
    }
    
    
    // 코드가 길기 때문에 메서드를 생성하였다.
    private HashMap<String, String> getMap(){		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("zero", "0");
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		
		return map;    		
	}    
}
