package Ex01;

public class StmtCon {
    /* 1~10까지 반복하고 %3 ==0 인것은 출력에서 제외 */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
