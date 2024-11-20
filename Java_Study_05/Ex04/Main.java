package Java_Study_05.Ex04;

public class Main {
    public static void main(String[] args) {

		// 인터페이스는 실체가 없기 때문에 객체화 되지 않는다.
		// 그래서 인터페이스르 구현해줄 클래스가 필요하다.(클래스에 기생)
        Common comm = new Commonlmpl();

        comm.test1();
        comm.test2();

		// 인터페이스를 강제로 객체화 하려고 한다면?
		// 여기서 익명은 인터페이스를 구현해줄 클래스 이름이 없다는 뜻이다.
		// 왜 이름이 없나? -> 여기서 일회성으로 사용되고 없어질 거니깐
        
        Common anony = new Common() {
            
            @Override
            public void test2(){
                System.out.println("anony inner type");
            }

            @Override
            public void test1(){
                System.out.println("anony inner ype 1");
            }


        };
        anony.test1();
        anony.test2();
    }
}
