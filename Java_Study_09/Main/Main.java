package Java_Study_09.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름");
        String inpuStr = sc.nextLine();
        System.out.println(inpuStr);
        

        int age = sc.nextInt();
        System.out.println(age);
    }
}