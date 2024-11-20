package Java_Study_04.Ex05;

public class Main {
    public static void main(String[] args) {
        // 1. 자식들은 각각 객체화 하여 useRoom 메서드 사용.

        Child child = new Child();
        child.useRoom();

        ChildOne child1 = new ChildOne();
		child1.useRoom();
		
		ChildTwo child2 = new ChildTwo();
		child2.useRoom();
		
		ChildThree child3 = new ChildThree();
		child3.useRoom();
		
		System.out.println();

        ParenHouse house;
        // 객체가 4개가 아니라 30~40개라면 일일히 30~40개 변수를 선언해줘야한다.
		// 다형성을 활용하면, 하나의 변수만 선언하고 여러객체를 사용할 수 있다.

        house = new Child(); // 변수 형태의 변수 하나
        house.useRoom();
        house = new ChildOne();
        house.useRoom();
        house = new ChildTwo();
        house.useRoom();
        house = new ChildThree();
        house.useRoom();

    }
}
