package Java_Study_06.cass.Ex01;

public class StringArrUtils {
    public static void main(String[] args) {
		// 문자열 = 문자배열임을 확인해 만든 기능들.
		String string = "abcdefg";
		
		String strResult;
		int intResult;
		boolean boolResult;
		
		// 문자길이 알아보기
		intResult = string.length();
		System.out.println(string + "의 길이 : " + intResult);
		
		// 특정 인덱스의 값 가져오기
		char charResult = string.charAt(3);
		System.out.println("3번 인덱스의 값 : " + charResult);
		
		// 문자열 -> 배열
		char[] arr = string.toCharArray();
		System.out.println(arr);
		
		// 배열 -> 문자열
		arr = new char[]{'가', '나', '다', '라'};
		
		// 문자배열을 문자열로
		string = new String(arr);
		System.out.println(string);
				
		string = String.valueOf(arr);
		System.out.println(string);				
		
		// 검색 : 특정 문자열에 있는 위치를 알려준다.(처음만)
		string = "abcdabcdabcd";
		intResult = string.indexOf("c");
		System.out.println("c의 index : " + intResult);
		
		// 특정 문자열을 뒤에서부터 찾기.
		intResult = string.lastIndexOf("c");
		System.out.println("c의 index : " + intResult);
		
		// 3개의 c를 모두 찾는 방법은?
		// 1. 전통적인 방법
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) == 'c') {
				System.out.println("c의 index : " + i);
			}
		}
		
		// 2. 자바의 메서드를 활용하는 방법. (코드리뷰)
		intResult = 0;                                       // 문자열에서 0번 index부터 문자를 찾아야하기때문에 초깃값을 0으로 세팅.
		while(intResult > -1) {                              // indexOf 메소드는 찾고자하는 문자열이 없는경우 -1을 반환한다. -> 따라서, -1인경우 반복문을 돌지 않도록 한다.
			intResult = string.indexOf("c", intResult);      // 어디서부터 어떤 값을 찾을 것인지 값을 넣어준다.
			
			if(intResult > -1) {                             // indexOf의 값이 정상적으로 반환된 경우에는, 반환된 index값을 출력. 														     
				System.out.println("c의 위치 : " + intResult);   
				intResult++;                                 // 발견된'c' 문자의 다음 index부터 'c'를 찾을 수 있도록 1을 증가시켜준다. 
			}
															 // indexOf로 -1이 반환된 경우에는 더이상 찾을 문자가 없다는 의미이므로 while문을 돌지않도록 값이 증가되지 않도록한다.
		}
	}
}
