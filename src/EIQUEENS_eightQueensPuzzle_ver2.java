import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EIQUEENS_eightQueensPuzzle_ver2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[][] chessBoard = new char[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            chessBoard[i] = sc.nextLine().toCharArray();
        }
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if (chessBoard[i][j] == '*') {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        if (row.size() != 8) {
            System.out.println("invalid");
            return;
        }
        if (col.size() != 8) {
            System.out.println("invalid");
            return;
        }
        ArrayList<Integer> rowList = new ArrayList<>(row);
        ArrayList<Integer> columnList = new ArrayList<>(col);
        for (int i = 1; i < rowList.size(); i++) {

            if (Math.abs(rowList.get(i) - rowList.get(i - 1)) == Math.abs(columnList.get(i) - columnList.get(i - 1))) {
                System.out.println("invalid");
                return;
            }
        }
        System.out.println("valid");
    }
}
