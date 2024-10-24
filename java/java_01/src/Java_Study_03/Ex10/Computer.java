package Java_Study_03.Ex10;

public class Computer {
    private boolean power;
    private int penSpeed;
    private int temp;

    public Computer(Boolean b, int i, int j){
        this.power = b;
        this.penSpeed = i;
        this.temp = j;

        System.out.println(b+""+(i*j));
    }
    public boolean getComP(){
        return power;
    }
    public int getComPS(){
        return penSpeed;
    }
    public int getCompT(){
        return temp;
    }
}
