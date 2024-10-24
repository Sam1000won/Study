package Java_Study_04.Ex01;

public class Main {
    public static void main(String[] args) {
		
		// Person을 객체화했지만
		// Mamal의 기능도 사용가능하다.
		Person p = new Person();
        
		p.birth(); // Mamal
		p.eat();   // Mamal
		
		p.useTool(); // Person
		p.social();  // Person
		p.talk();    // Person
	}
}
