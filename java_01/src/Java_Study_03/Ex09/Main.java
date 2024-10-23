package Java_Study_03.Ex09;

import Java_Study_03.Ex08.Calculator;

public class Main {
    public static void main(String[] args) {
       
        // 같은 패키지에서는 import문을 사용하지 않아도 된다.
        Info info = new Info();
        System.out.println(info.age);
        System.out.println(info.job);

		// 다른 패키지의 경우에는 import문을 사용하여 불러와야한다. 
		// 불러올 메서드는 public키워드가 있어야 불러올 수 있다.        
        Calculator cal = new Calculator();
        System.out.println(cal.plus(1,2));

        /* 
			[캡슐화]
			public : 접근허용
			protected : 같은 패키지에서만 접근 허용.
			default : 같은 패키지에서만 접근 허용.
			private : 같은 클래스에서만 접근 허용.
		*/
    }
}
