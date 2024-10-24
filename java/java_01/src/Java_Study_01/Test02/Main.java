package Test02;

public class Main {
    public static void main(String[] args) {
		int result = 0;
		
		Solution sol = new Solution();
		
		result = sol.solution(10);
		System.out.println("30 ==" + result);
		
		result = sol.solution(4);
		System.out.println("6 ==" + result);
		
		result = sol.solution(1);
		System.out.println("0 ==" + result);
		
		result = sol.solution(1000);
		System.out.println("? ==" + result);

	}
}
