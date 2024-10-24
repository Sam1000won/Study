package Java_Study_03.Ex06;

public class Inner {
    public static void main(String[] args) {
        st_msg("hello static member");
        {
            Inner i = new Inner();
            i.h_msg("hello member");
        }
    }
    static void st_msg(String msg){
        System.out.println(msg);
    }

    void h_msg(String msg){
        Inner.st_msg("hi");
        System.out.println(msg);
    }
}
