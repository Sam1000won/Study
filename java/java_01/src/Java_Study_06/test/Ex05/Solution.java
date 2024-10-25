package Java_Study_06.test.Ex05;

public class Solution {
    
    public String solution(String rsp) {		
		StringBuffer sb = new StringBuffer();
		
		// 정수형 배열에 값 담기.
		for(int i=0; i<rsp.length(); i++) {			
			switch (rsp.charAt(i)) {     // String의 문자값을 확인하여 StringBuffer에 값 대입.
			case '2' :                   // 가위 2 < 0 바위 
				sb.append("0");
				break;
				
			case '0' :                   // 바위는 0 < 5 보
				sb.append("5");
				break;
				
			case '5' :                   // 보는  5 < 2 가위	
				sb.append("2");
				break;
			} 			
		}		

		String answer = sb.toString();					
		return answer;
	}
}
