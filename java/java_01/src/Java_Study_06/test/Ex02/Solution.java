package Java_Study_06.test.Ex02;

public class Solution {
    public String solution(String my_string, int n) {
        if (n <= 0) return my_string;  // n이 0 이하인 경우 원래 문자열 반환
        
        StringBuilder sb = new StringBuilder();  // StringBuilder 사용
        
        // 각 문자를 n번 반복하여 추가
        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                sb.append(c);  // 각 문자를 n번 추가
            }
        }
        
        return sb.toString();  // StringBuilder를 String으로 변환하여 반환
    }
}
