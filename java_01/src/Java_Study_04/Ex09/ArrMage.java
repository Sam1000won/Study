package Java_Study_04.Ex09;

public class ArrMage {
    public static void main(String[] args) {
		
		// 다형성을 이용하면 아래와 같이 배열등을 활용할 때 유용하다.
		// 일반적인 변수(필드)에 활용하므로 필드다형성이라고 한다.
		Spell[] sp = new Spell[3];
		
		sp[0] = new Fire();
		sp[1] = new Ice();
		sp[2] = new Light();
		
		for(int i=0; i<sp.length; i++) {
			System.out.println(sp[i].Casting());
			
		}
	}
}
