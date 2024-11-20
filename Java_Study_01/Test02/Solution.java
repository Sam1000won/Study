package Test02;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // i 변수를 선언하고 초기화
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i; // 짝수일 경우 answer에 더함
            }
        }
        
        return answer; // 루프가 끝난 후 answer를 반환
    }
}
