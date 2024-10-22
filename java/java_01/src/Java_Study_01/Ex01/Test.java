package Ex01;

import Test01.Solution;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        Solution sol = new Solution();

        result = sol.solution(70);
        System.out.println(result); // 예각: 1

        result = sol.solution(91);
        System.out.println(result); // 둔각: 3

        result = sol.solution(90);
        System.out.println(result); // 직각: 2

        result = sol.solution(100);
        System.out.println(result); // 둔각: 3
    }
}
