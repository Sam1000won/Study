package Java_Study_06.test.Ex04;

public class Solution {
    public String solution(String cipher, int code){
        StringBuffer sb = new StringBuffer();

        String arr[] = cipher.split("");

        // 문자열의 길이 만큼 반복하면서 code번째 문자를 추출한다

        for(int i=0; i<arr.length; i++){
            // 배열의 index는 0부터 시작하기 때문에 1을 더한뒤 배수를 나눈다.
            // 나머지가 0인경우 code의 배수를 보고 append해준다
            if((i+1)% code ==0){
                sb.append(arr[i]);
            }
        }
        ///----
        // String 그대로 사용하는 방법
        sb.setLength(0);    
        for(int n=1; n<= cipher.length(); n++){
            if(n%code==0){
                sb.append(cipher.charAt(n-1));
            }
        }
        // 
        // 입력받은 값의 배수식 도는 법
        for(int j=1; j<=cipher.length(); j=j*code){
            if(j%code==0){
                sb.append(cipher.charAt(j-1));
            }
        }
        String ans = sb.toString();
        return ans;
    }
}
