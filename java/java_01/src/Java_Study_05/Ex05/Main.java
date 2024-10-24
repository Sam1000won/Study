package Java_Study_05.Ex05;

public class Main {
    public static void main(String[] args) {
		
		// 다중 인터페이스 구현시 인터페이스들 끼리의 상속을 이용하면
		// 다형성을 활용할 때 제한되는 내용을 해결 할 수 있다.
		Child child = new Childlmpl();
		
		child.click(1);
		child.dblClick(1);
		child.wheel(0);
		
		child.keyUp(3);
		child.keyDown(3);
		
		child.textField("아무거나 입력");
		child.selectOne();
		child.checkOne();

	}
}
