package Java_Study_04.Ex09;

public class Fire extends Spell {
    @Override
    public String Casting(){
        return "불이야" + super.Casting();
    }
}
