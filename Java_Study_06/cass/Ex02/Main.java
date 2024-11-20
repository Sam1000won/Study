package Java_Study_06.cass.Ex02;

public class Main {
    public static void main(String[] args) {
        String str = "문자열";
        str += "추가하면";
        str += "각 객체가 생성된다.";
        System.out.println(str);

        StringBuffer buffer = new StringBuffer("문자열을");
        buffer.append("추가하면");
        buffer.append("기존 객체의 내용을 바꿔준다.");
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
    }
}
