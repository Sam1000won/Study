package Java_Study_04.Ex08;

public class Mage {
    public static void main(String[] args) {
        
        Fire fire = new Fire();
        Ice ice = new Ice();
        Light light = new Light();

        System.out.println(fire.Casting());
        System.out.println(ice.Casting());
        System.out.println(light.Casting());
    }
}
