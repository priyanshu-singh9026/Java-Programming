import java.util.*;

public class RasikhBox {
    static char[][] applyGravity(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        for (int col = 0; col < n; col++) {
            int emptyRow = m - 1;
            for (int row = m - 1; row >= 0; row--) {
                if (box[row][col] == '*') {
                    if (row != emptyRow) {
                        box[emptyRow][col] = '*';
                        box[row][col] = '.';
                    }
                    emptyRow--;
                }
            }
        }
        return box;
    }

    static char[][] rotateRight(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] rotate = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][m - 1 - i] = box[i][j];
            }
        }
        return rotate;
    }

    static char[][] rotateLeft(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] rotate = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotate[n - 1 - j][i] = box[i][j];
            }
        }
        return rotate;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        char[][] box = new char[m][n];
        for (int i = 0; i < m; i++) {
            String row = sc.nextLine().trim();
            for (int j = 0; j < n; j++) {
                box[i][j] = row.charAt(j);
            }
        }

        int k = sc.nextInt();
        sc.nextLine();
        String[] instruction = new String[k];
        for (int i = 0; i < k; i++) {
            instruction[i] = sc.nextLine().trim();
        }

        box = applyGravity(box);

        for (String ins : instruction) {
            if (ins.equalsIgnoreCase("right")) {
                box = rotateRight(box);
            } else {
                box = rotateLeft(box);
            }
            box = applyGravity(box);
        }

        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                System.out.print(box[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
