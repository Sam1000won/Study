package Java_Study_05.Ex03;

public class Main {
    public static void main(String[] args) {
		
		MouseEvent mouse = null;
		// 다형성은 부모-자식 관계가 아니고 구현관계에서도 사용가능하다.
		mouse = new Windows();
		mouse.click(1);
		mouse.dblClick(2);
		
		mouse = new Mac();
		mouse.click(0);
		mouse.dblClick(0);
		
		// default 메서드 사용.
		mouse.wheel(1);    
		mouse.wheel(2);
		
		// static 메서드 사용.
		MouseEvent.setDpi(75);
		
		// 다중구현한 인터페이스일 경우 다형성을 사용하면
		// 들어간 형태의 인터페이스의 메서드(오버라이드한 메서드 포함)만 사용가능하다.
		KeyEvent key = null;
		mouse = new Windows();
		key = new Windows();
		
	}
}
