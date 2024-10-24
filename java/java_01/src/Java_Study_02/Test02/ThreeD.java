package Java_Study_02.Test02;

public class ThreeD {
    public static void main(String[] args) {
        String[][][] royal = new String[4][4][3];

        royal[2][3][2] = "철수의 방";
        royal[0][0][0] = "영희의 방";

        for (int i = 0; i < royal.length; i++) {
            for (int j = 0; j < royal[i].length; j++) {
                for (int j2 = 0; j2 < royal[i][j].length; j2++) {
                    if (royal[i][j][j2] == null) {
                        royal[i][j][j2] = "빈방";
                    }
                    System.out.println("방 [" + i + "][" + j + "][" + j2 + "]: " + royal[i][j][j2]);
                }
            }
        }
    }
}
