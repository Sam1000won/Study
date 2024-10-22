package Java_Study_03.Ex06;

public class Main {
    public static void main(String[] args) {

		// 일반멤버들은 객체화해서 사용한다.
		Sub sb = new Sub();
		
		System.out.println(Sub.plus(1, 2));
		System.out.println(Sub.minus(3, 4));
		
		// static멤버는 객체화해서 사용하지 않는다.
		System.out.println(sb.multi(5, 6));
		
		// static멤버는 어떻게 사용하나?
		// 원본으로 직접 가져온다.
		System.out.println(Sub.sField);
		System.out.println(Sub.plus(5, 4));
		System.out.println(Sub.minus(6, 3));
		
		// 사실은 객체에서도 불러올 수는 있다.
		// 사람들이 실수를 자주하는 부분이라 허용은 하지만 경고를 한다.
		// 객체를 통해 원본을 찾아서 원본영역에 접근하는 것이라 효율성이 떨어진다.
		System.out.println(sb.sField);
		System.out.println(sb.plus(1, 2));
		System.out.println(sb.minus(4, 3));
		
		// static과 일반변수의 차이.
		Sub sb2 = new Sub();
		
		// 일반필드는 어느 한곳에서 변경해도 다른쪽에 영향을 받지 않는다.
		sb2.field = 1000;
		System.out.println("sub.field = " + sb.field);
		System.out.println("sub.field = " + sb2.field);
		
		// 스태틱 필드는 해당객체의 원본을 건드리므로 모두에게 영향을 준다.
		sb2.sField = 3000;
		System.out.println("sub.field = " + sb.sField);
		System.out.println("sub.field = " + sb2.sField);

    }
}