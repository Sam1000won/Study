package Java_Study_10.Ex03;

public class Main {
    public static void main(String[] args) {
        
        // 쓰레드를 저장할 변수 선언
        Thread th = null;
        
        // 첫 번째 워크 쓰레드 생성 및 실행
        th = new WorkThread(); // 새로운 WorkThread 인스턴스를 생성
        th.setName("첫째 쓰레드"); // 쓰레드의 이름을 설정
        th.start(); // 쓰레드 시작
        
        // 두 번째 워크 쓰레드 생성 및 실행
        th = new WorkThread(); // 새로운 WorkThread 인스턴스를 생성
        th.setName("둘째 쓰레드"); // 쓰레드의 이름을 설정
        th.start(); // 쓰레드 시작
        
        // 세 번째 워크 쓰레드 생성 및 실행
        th = new WorkThread(); // 새로운 WorkThread 인스턴스를 생성
        th.setName("막내 쓰레드"); // 쓰레드의 이름을 설정
        th.start(); // 쓰레드 시작

    }
}
