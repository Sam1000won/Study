package Java_Study_04.Ex06;

/*
			Vertbrate
			/       \
		Birds        Mamal
		/   \        /   \
	Duck  Chicken  Dog   Cat
*/

class Vertbrate{} // 척추동물
class Birds extends Vertbrate{} // 조류
class Mamal extends Vertbrate{} // 포유류

class Duck extends Birds{};
class Chicken extends Birds{};

class Dog extends Mamal{};
class Cat extends Mamal{};

public class Promotion {

	public static void main(String[] args) {
		
		// 척추동물안에는 모든 동물이 들어갈 수 있다.
		Vertbrate 척추동물;
		척추동물 = new Dog();
		척추동물 = new Cat();
		척추동물 = new Chicken();
		척추동물 = new Duck();
		
		// 고양이는 조류에 들어갈 수 없다.
		// Birds cat = new Cat();
		// 오리는 포유류에 들어갈 수 없다.
		// Mamal mal = new Duck();		
		
	}
}