package Java_Study_08.Java_08.Ex06;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {
	
	public static void main(String[] args) {
		
		// 큐는 인터페이스이기 때문에 객체를 생성할 때 LinkedList를 사용한다.
		// LinkedList는 Queue 인터페이스를 구현하여 FIFO 구조를 제공하므로, 
		// 큐의 기능만 사용할 수 있게 된다.
		Queue<Job> queue = new LinkedList<Job>();
		
		// 큐에 할 일을 추가한다. 각 Job 객체는 명령과 대상을 포함한다.
		// offer() 메소드를 사용하여 큐에 새로운 Job을 추가한다.
		queue.offer(new Job("send SMS", "Alice")); // "Alice"에게 SMS 전송
		queue.offer(new Job("send Mail", "Bryan")); // "Bryan"에게 메일 전송
		queue.offer(new Job("send KATALK", "Criss")); // "Criss"에게 카카오톡 전송
		queue.offer(new Job("send Mail", "Denis")); // "Denis"에게 메일 전송
		queue.offer(new Job("send SMS", "Erick")); // "Erick"에게 SMS 전송
		
		// 큐에서 작업을 하나 꺼낸다. poll() 메소드는 큐에서 가장 먼저 들어온 Job을 반환하고 제거한다.
		Job job = queue.poll();
		System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		// 꺼낸 Job의 명령어와 대상을 출력하고, 현재 큐의 크기를 출력한다.
		
		// while 루프를 통해 큐의 모든 내용을 꺼내서 출력한다.
		// 큐가 비어있지 않은 동안 계속 반복한다.
		while (!queue.isEmpty()) {
			job = queue.poll(); // 큐에서 다음 Job을 꺼낸다.
			// 꺼낸 Job의 명령어와 대상을 출력하고, 현재 큐의 크기를 출력한다.
			System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		}
		// 모든 작업이 완료되면 큐는 비어있게 된다.
	}
}
