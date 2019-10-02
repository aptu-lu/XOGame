public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Field.init();
        Field.showField();

        do {
            System.out.println("hodit igrok 1:");
            player1.getShot();
            Field.gameIsOver();
            Field.showField();
            if (Field.gameOver == true) {
                System.out.println("Game Is Over!");
                System.out.println("Pobedil pervii igrok!");
                break;
            }
            System.out.println("hodit igrok 2:");
            player1.getShot();
            Field.gameIsOver();
            Field.showField();
            if (Field.gameOver == true) {
                System.out.println("Game Is Over!");
                System.out.println("Pobedil vtoroi igrok!");
            }
            }while (!Field.gameOver) ;
    }
}
