package Java_Study_06.test.Ex03;

public class Solution {
    public String solution(String mys_String, String letter){
        StringBuffer sb = new StringBuffer();
        // String reqplace사용 tkrehrk Qkfma
        String ans = mys_String.replace(letter,"");


        // 입력받은 문자 제거하기
        String[] arr = mys_String.split("");
        // my_string 배열화
        for(int i= 1; i<arr.length;i++){
            // 하나씩 꺼내서 letter와 비교
            if(!arr[i].equals(letter)){
                // 일치하지 않으면 추가
                sb.append(arr[i]);
            }
        }
        ans = sb.toString();
        return ans;
    }
}
