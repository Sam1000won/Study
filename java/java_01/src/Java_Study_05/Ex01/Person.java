package Java_Study_05.Ex01;

public class Person  extends Mammal{
    public Person(String name){
        super(name);
    }
    
    // name은 부모한테 넘어갔지만 부모를 상속받았기에
	// 자식입장에서는 나한테 없는 name을 원래 있는 것처럼 사용한다.
    
	public void useTool() {
		System.out.println(name + "가 도구를 사용한다.");
	}
	
	public void social() {
		System.out.println(name + "가 사회생활을 한다.");
	}
	
	public void talk() {
		System.out.println(name + "가 이야기를 한다.");
	}

}
