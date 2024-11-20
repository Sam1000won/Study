package Java_Study_08.Test.Ex03;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int []a, int []b){
        int answer = 0;
        
        /* Arrays.sort()를 사용한 방법.        
        Arrays.sort()는 원본을 변경시킨다. (1.45 ~ 2.05ms)               
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++) {
        	answer += a[i] * b[(a.length-1)-i];
        }
        */
        
        // =======================================================
        // priority Queue를 사용한 방법.
        // 효율성 통과실패.       
        PriorityQueue<Integer> asc = new PriorityQueue<Integer>(); // 오름차순 정렬
        PriorityQueue<Integer> desc = new PriorityQueue<Integer>(Comparator.reverseOrder()); // 내림차순 정렬
        for(int i=0; i<a.length; i++) {
        	asc.add(a[i]);
        	desc.add(b[i]);
        }        
        
        for(int i=0; i<b.length; i++) {
        	answer += asc.poll() * desc.poll();
        }                
        
        return answer;
    }
}