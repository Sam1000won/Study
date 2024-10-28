package Java_Study_08.Java_08.Ex06;

public class Job {
    // Job 클래스는 작업을 나타내는 데이터 구조입니다.
    // 각 Job 객체는 실행할 명령(command)과 해당 명령의 대상(to)을 포함합니다.

    // Queue는 FIFO(First In, First Out) 구조로, 먼저 넣은 값이 먼저 나옵니다.
    // 큐는 LinkedList와 비슷한 구조로 되어 있으며, 데이터는 offer()로 넣고 poll()로 빼냅니다.
    
    private String command = ""; // 실행할 명령어를 저장하는 변수
    private String to; // 명령어의 대상(예: 파일, 사용자 등)을 저장하는 변수
    
    // 생성자: Job 객체를 생성할 때 명령어와 대상을 초기화합니다.
    public Job(String command, String to) {
        this.command = command; // 명령어를 초기화
        this.to = to; // 대상을 초기화
    }
    
    // 명령어를 반환하는 getter 메소드
    public String getCommand() {
        return command; // 현재 Job의 명령어를 반환
    }
    
    // 대상을 반환하는 getter 메소드
    public String getTo() {
        return to; // 현재 Job의 대상을 반환
    }
}
