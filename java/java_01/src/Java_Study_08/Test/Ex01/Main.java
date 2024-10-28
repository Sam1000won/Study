package Java_Study_08.Test.Ex01;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String res = "";

        res = sol.solution("..... ..-.. -... ---");
        System.out.println(res);

        res = sol.solution(".--. -.-- - .... --- -.");
        System.out.println(res);
    }
}
