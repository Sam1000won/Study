package Java_Study_06.test.Ex05;

public class Main {
    public static void main(String[] args) {
		
		Solution sol = new Solution();
		String result = "";
		
		result = sol.solution("2");
		System.out.println("0".equals(result));
		
		result = sol.solution("205");
		System.out.println("052".equals(result));		

	}
}
