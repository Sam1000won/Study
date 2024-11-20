package Java_Study_06.test.Ex04;

public class Main {
    public static void main(String[] args) {
        // 문자열에서 원하는 문자를 추출해서 사용하는 방법
        Solution sol = new Solution();

        String res = "";

        res = sol.solution("asdfasdfasdfasdf", 4);
        System.out.println(res);
        System.out.println("asd".equals(res));

        res = sol.solution("pfqallllabwaoclk", 2);
		System.out.println("fallback".equals(res));
    }
}
