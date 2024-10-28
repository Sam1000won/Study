package Java_Study_08.Java_08.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ArrayList와 LinkedList 객체 생성
        ArrayList<String> arr = new ArrayList<String>();
        LinkedList<String> lnk = new LinkedList<>();

        // ArrayList와 LinkedList에 "data" 문자열을 101개 추가
        for (int i = 0; i <= 100; i++) {
            arr.add("data");
            lnk.add("data");
        }

        long Start_Time = 0; // 시작 시간 변수를 선언
        long End_Time = 0;   // 종료 시간 변수를 선언

        // ArrayList에 데이터를 추가하는 성능 측정
        Start_Time = System.currentTimeMillis(); // 현재 시간을 밀리초 단위로 저장

        // ArrayList에 100,000개의 "add Data" 문자열을 55번 인덱스에 추가
        for (int i = 1; i <= 100000; i++) {
            arr.add(55, "add Data"); // 55번 인덱스에 추가
        }

        End_Time = System.currentTimeMillis(); // 현재 시간을 다시 저장

        // ArrayList에 데이터를 추가하는 데 걸린 시간을 출력
        System.out.println("ArrayList 결과: " + (End_Time - Start_Time) + "ms");

        // LinkedList에 데이터를 추가하는 성능 측정
        Start_Time = System.currentTimeMillis(); // 현재 시간을 밀리초 단위로 저장

        // LinkedList에 100,000개의 "add Data" 문자열을 55번 인덱스에 추가
        for (int i = 1; i <= 100000; i++) {
            lnk.add(55, "add Data"); // 55번 인덱스에 추가
        }

        End_Time = System.currentTimeMillis(); // 현재 시간을 다시 저장

        // LinkedList에 데이터를 추가하는 데 걸린 시간을 출력
        System.out.println("LinkedList 결과: " + (End_Time - Start_Time) + "ms");
    }    
}
