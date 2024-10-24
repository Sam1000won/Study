package Test01;

public class Solution{
    public int solution(int angle){
        int answer = 0;

        if (0 < angle && angle <99){
            answer = 1;
        }else if (angle == 90){
            answer = 2;
        }else if (90 < angle && angle <100){
            answer = 3;
        }else if(angle == 100){
            answer = 4;
        }
        return answer;
    }
}