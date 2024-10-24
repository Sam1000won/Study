package Java_Study_03.Ex01;

public class main {
    		/* 
			[OOP의 특징 4가지]
			1. 캡슐화
			2. 상속
			3. 추상화
			4. 다형성
			
			===================================================
			[클래스]
			Java의 파일은 최소 1개이상의 class를 가지고 있어야 한다.
			class는 하나의 자료형이 될 수 있다.
			class안에 class를 선언할 수 있다.
			클래스의 첫 클자는 대문자로 한다.
			
			main()이 있는 클래스 : 실행이 목적이다.
			main()이 없는 클래스 : 누군가가 가져다 쓰는 목적으로 만들어졌다.
			클래스명과 파일명이 일치해야한다.
			
			class는 파스칼 표기법 : 모든 단어의 첫번째 문자는 대문자, 나머지는 소문자. (예: Blackcolor)
			그외 변수나 메서드는 카멜표기법 : 의미가 있는 단어의 첫글자는 대문자로 표기. (예: blackColor)
			// 다른언어에서 많이 쓰이는 스네이크 표기법 : 의미가 있는 단어를 _로 구분한다.(예: black_color)

			class의 특정내용을 사용하기 위해서는 class를 객체화해야 한다.
			
			===================================================
			[Java API]
			API(Application Programming Interface)
			* 응용 프로그램에서 사용할 수 있도록, 운영체제나 프로그래밍언어가 제공하는 기능을 제어할 수 있게만든 인터페이스.
			
			
		*/
		
		// 1. Student 형태를 담을 변수를 준비.
		// 2. 새로(new)Student를 복사해서 가져온다.
        public static void main(String[] args) {
            Student std = new Student();
            Student std2 = new Student();
            System.out.println(std);
            System.out.println(std2);
        }
}
