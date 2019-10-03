public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Field.init();
        Field.showField();

        do {
            System.out.println("hodit igrok 1:");
            player.setPoint(player.getPoint());
            Field.gameOver();
            Field.showField();
            if (Field.gameIsOver) {
                System.out.println("Game Is Over!");
                System.out.println("Pobedil pervii igrok!");
                break;
            }
            System.out.println("hodit igrok 2:");
            player.setPoint(player.getPoint());
            Field.gameOver();
            Field.showField();
            if (Field.gameIsOver) {
                System.out.println("Game Is Over!");
                System.out.println("Pobedil vtoroi igrok!");
            }
            }while (!Field.gameIsOver) ;
        System.out.println("Za " + Point.count + " hodov!");
    }
}
