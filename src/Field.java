public class Field {
    private static final int SIZE = 3;
    static boolean gameOver = false;

    static char[][] cells = new char[SIZE][SIZE];

    static void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    static void showField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void gameIsOver() {
        if ((cells[0][0] == cells[0][1] && cells[0][1] == cells[0][2] && cells[0][1] != '.') ||
                (cells[1][0] == cells[1][1] && cells[1][1] == cells[1][2] && cells[1][1] != '.') ||
                (cells[2][0] == cells[2][1] && cells[2][1] == cells[2][2] && cells[2][1] != '.') ||
                (cells[0][0] == cells[1][0] && cells[1][0] == cells[2][0] && cells[1][0] != '.') ||
                (cells[0][1] == cells[1][1] && cells[1][1] == cells[2][1] && cells[1][1] != '.') ||
                (cells[0][2] == cells[1][2] && cells[1][2] == cells[2][2] && cells[1][2] != '.') ||
                (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2] && cells[1][1] != '.') ||
                (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0] && cells[1][1] != '.')) {
            gameOver = true;
        } else {
            gameOver = false;
        }
    }
}
