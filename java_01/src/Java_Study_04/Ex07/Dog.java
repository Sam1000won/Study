package Java_Study_04.Ex07;

public class Dog extends Mammal {
    // mammal의 특성 나만의 것으로 개조
    @Override
    public void birth() {
		System.out.println(" 낳는다.");
	}

    //개의 고유 특성
    public void bark(){
        System.out.println("멍멍하고 짖는다.");
    }
}