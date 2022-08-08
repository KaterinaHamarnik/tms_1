package lesson4.ChessBoard;

import java.util.Random;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] nameArray = new String[8][8];
        Random random = new Random();
        for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < nameArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    nameArray[i][j] = "W";
                } else {
                    nameArray[i][j] = "B";
                }
                System.out.print(nameArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
