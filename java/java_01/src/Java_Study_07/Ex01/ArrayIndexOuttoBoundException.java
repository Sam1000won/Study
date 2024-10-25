package Java_Study_07.Ex01;

public class ArrayIndexOuttoBoundException{
    public static void main(String[] args) {
        
        String[] arr = new String[2]; // 배열 크기 2

        arr[0] = "data1";
        arr[1] = "data2";
        arr[2] = "data3"; // 이 줄에서 ArrayIndexOutOfBoundsException 발생

        System.out.println(arr[2]); // 이 줄에서 출력 시도, 3번째 index는 존재하지 않음.
    }
}
