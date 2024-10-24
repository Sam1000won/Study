package Java_Study_05.Ex05;

public class Childlmpl implements Child {
    
    @Override
	public void keyDown(int key) {
		System.out.println(key+" 번 키가 눌림");
	}
	@Override
	public void keyUp(int key) {
		System.out.println(key+" 번 키가 뗌");
	}
	@Override
	public void click(int btn) {
		System.out.println(btn+" 번 버튼 클릭");
	}
	@Override
	public void dblClick(int btn) {
		System.out.println(btn+" 번 더블 버튼 클릭");
	}
	@Override
	public double[] move() {
		return null;
	}
	@Override
	public void textField(String text) {
		System.out.println("입력내용 : "+text);
	}
	@Override
	public void selectOne() {
		System.out.println("아이템 선택");
	}
	@Override
	public void checkOne() {
		System.out.println("아이템 체크");
	}
}
