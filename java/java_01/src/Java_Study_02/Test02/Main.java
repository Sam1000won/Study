package Java_Study_02.Test02;

public class Main {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] scores = {95, 75, 84, 38, 88};

        // 배열의 길이만큼 반복하며 인덱스를 출력
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]); // 점수를 출력
        }
        System.out.println("========");
        
        // 향상된 for문을 사용하여 점수를 출력
        for (int score : scores) {
            System.out.println(score); // 점수를 출력
        }
    }
}
