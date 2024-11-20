package Java_Study_08.Test.Ex02;

public class Main {
    public static void main(String[] args) {
		Solution sol = new Solution();
		long result = 0;
		
		result = sol.solution("onetwothreefourfivesixseveneightnine");
		System.out.println("123456789 == " + result);
		
		result = sol.solution("onefourzerosixseven");
		System.out.println("14067 == " + result);				
				
	}
}
