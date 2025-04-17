import java.util.Scanner;

public class EIQUEENS_eightQueensPuzzle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        int queenCount = 0;
        int[] rows = new int[8];
        int[] cols = new int[8];
        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == '*') {
                    queenCount++;
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        if (queenCount != 8) {
            System.out.println("invalid");
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (rows[i] > 1 || cols[i] > 1) {
                System.out.println("invalid");
                return;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == '*') {
                    for (int k = i + 1, l = j + 1; k < 8 && l < 8; k++, l++) {
                        if (board[k][l] == '*') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                    for (int k = i + 1, l = j - 1; k < 8 && l >= 0; k++, l--) {
                        if (board[k][l] == '*') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("valid");
    }
}
