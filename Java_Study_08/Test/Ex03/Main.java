package Java_Study_08.Test.Ex03;

public class Main {
    public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		
		int[] arr1 = {1, 4, 2};
		int[] arr2 = {5, 4, 4};
		
		result = sol.solution(arr1, arr2);
		System.out.println("29 == " + result);
				
		int[] arr3 = {1, 2};
		int[] arr4 = {3, 4};
		result = sol.solution(arr3, arr4);
		System.out.println("10 == " + result);
	}
}
