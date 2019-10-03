import java.util.Scanner;

public class Player {
    private int shotX;
    private int shotY;
    static int count = 1;

    Point getPoint() {
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
        Point.count++;
        return new Point(shotX,shotY);
    }

    void setPoint(Point point){
        count++;
        if (count % 2 == 1) {
            Field.cells[point.x][point.y] = 'X';
        } else {
            Field.cells[point.x][point.y] = 'O';
        }
    }
}
