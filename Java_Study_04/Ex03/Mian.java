package Java_Study_04.Ex03;

public class Mian {
    public static void main(String[] args) {
        /* 사용자 입장에서는 사용하고 싶은 메서드에 따라 각각 객체화해야한다.
		
		// plus
		Operator1 o1 = new Operator1();
		int plus = o1.plus(4, 3);
		System.out.println(plus);
		
		// minus
		Operator2 o2 = new Operator2();
		int minus = o2.minus(4, 3);
		System.out.println(minus);
		
		// multi
		Operator3 o3 = new Operator3();
		int multi = o3.multi(3, 2);
		System.out.println(multi);
		
		// devide
		Operator4 o4 = new Operator4();
		int devide = o4.devide(8, 4);
		System.out.println(devide);
		*/
		
		// 상속을 받으면 사용자 입장에서는 Operator1하나만 객체화해도 많은 메서드를 사용할 수 있다.
        Operaor1 op = new Operaor1();
        System.out.println(op.plus(4,3));
		System.out.println(op.minus(4,3));
		System.out.println(op.multi(3,2));
		System.out.println(op.devide(8,4));
    }
}
