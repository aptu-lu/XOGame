import java.util.Scanner;

public class Player {
    private int shotX;
    private int shotY;
    static int count = 1;

    void getShot() {
        do {
            do {
                System.out.println("koordinata po X");
                shotX = Integer.parseInt(new Scanner(System.in).nextLine());
            } while (shotX < 0 | shotX > Field.cells.length - 1);

            do {
                System.out.println("koordinata po Y");
                shotY = Integer.parseInt(new Scanner(System.in).nextLine());
            } while (shotY < 0 | shotY > Field.cells.length - 1);
        } while (Field.cells[shotX][shotY] == 'X' || Field.cells[shotX][shotY] == 'O');

        count++;
        if (count % 2 == 1) {
            Field.cells[shotX][shotY] = 'X';
        } else {
            Field.cells[shotX][shotY] = 'O';
        }
    }
}
