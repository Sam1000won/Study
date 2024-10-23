package Java_Study_04.Ex09;

public class Light extends Spell{
    @Override
    public String Casting(){
        return "빛이여" + super.Casting();
    }
}
