package Java_Study_05.Ex03;

public interface MouseEvent {
    
	// interface에서는 기본이 추상 메서드이다.
	public abstract void click(int i);
	public abstract void dblClick(int i);
	public abstract double[] move();
	
	// default메서드 - Java 8(1.8)부터 가능.
	// default : 같은 패키지에서 사용가능.
	public default void wheel(int i) {
		if(i==1) {
			System.out.println("윗방향으로 스크롤");
		}else {
			System.out.println("아랫방향으로 스크롤");
		}
	}
	
	// static메서드 - Java 8부터 가능.
	public static void setDpi(int dpi) {
		System.out.println("강도 조절 : " + dpi);
	}
	
}
