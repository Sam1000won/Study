package Java_Study_06.test.Ex01;

public class Solution {
    public String solution(String my_String){
        StringBuffer sb = new StringBuffer();

        int len = my_String.length(); //입력받은 문자열의 길이
        // 배열을 0부터 시작하므로 -1을 해준다

        // 1. String과 charAt으로 문자열 뒤집기.
        // 문자열 마지막 부터 첫문자 StringBuffer에 append
        for (int i = len; i>=0; i--){
            sb.append(my_String.charAt(i));
        }

        // 2. char[]으로 뒤집기
        sb.setLength(0);    // StringBuffer의 길이름0으로 안의 내용 초기화
        char[] arr = my_String.toCharArray(); // String 클래스 메소드 toCharArray 사용하여 String -> Char 변경

        for(int i = len; i >=0; i--){
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}
