package Java_Study_05.Ex03;

public class Mac implements MouseEvent{
    
    @Override
	public void click(int btn) {
		System.out.println("버튼을 클릭 한다.");

	}

	@Override
	public void dblClick(int btn) {
		System.out.println("버튼을 더블클릭 한다.");

	}

	@Override
	public double[] move() {
		return null;
		
	}
}
