package Java_Study_04.Ex05;

public class Child extends ParenHouse {
    public Child(){

    }
    @Override
    public void useRoom(){
        System.out.println("1");
    }
}

class ChildOne extends ParenHouse{
    public ChildOne(){

    }
    @Override
    public void useRoom(){
        System.out.println("2");
    }
} 

class ChildTwo extends ParenHouse{
    public ChildTwo(){
    }
    public void useRoom(){
        System.out.println("3");
    }
}

class ChildThree extends ParenHouse{

	public ChildThree() {
		
	}

	@Override
	public void useRoom() {
		System.out.println("4");
	}
}