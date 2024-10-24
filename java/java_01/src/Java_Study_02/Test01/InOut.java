package Java_Study_02.Test01;

public class InOut {
    public static void main(String[] args) {
        int[] score = new int[10];

        score[0] = 10;
        score[1] = 50;
        score[2] = 70;

        int len = score.length;
        System.out.println(len);

        int sum = 0;

        for (int i = 0; i <score.length; i++){
            sum += 1;
            score[i] = sum;
            System.out.println(i+"빈방"+score[i]);
        }

    }
}
