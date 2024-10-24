package Java_Study_05.Ex01;

public class Mammal {
    public String name = "";

    public Mammal(String name){ // Mammal 객체화시 반드시 이름을 넣어야한다.
        this.name = name;
    }

    public void birth(){
        System.out.println(name +"born to name");
    }

    public void eat(){
        System.out.println(name+"eating food");
    }
}
