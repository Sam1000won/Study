package Java_Study_06.cass.Ex01;

public class StrStart {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = new String("abcdefg");
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String str3 = new String(alphabet);

        if(str1.equals(str2) && str2.equals(str3)){
            System.out.println("같음");
        }
    }
}
