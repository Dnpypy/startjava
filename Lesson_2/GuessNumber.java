import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber() {
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public GuessNumber initPlayers(Scanner scanner) {
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        GuessNumber guessNumPlayers = new GuessNumber(player1, player2);
        return guessNumPlayers;
    }

    public void initGuessGames(Scanner scanner,int computerNumber) {
        while (true) {
                System.out.println("Введите число первого игрока: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                if (num1 == computerNumber) {
                    System.out.println("Игрок1 отгадал число! " + "число : " + num1);
                    break;
                } else if (num1 < computerNumber) {
                    System.out.println(num1 + " число меньше того, что загадал компьтер");
                } else if (num1 > computerNumber) {
                    System.out.println(num1 + " число больше того, что загадал компьтер");
                }
                System.out.println("Введите число второго игрока: ");
                int num2 = Integer.parseInt(scanner.nextLine());
                if (num2 == computerNumber) {
                    System.out.println("Игрок1 отгадал число! " + "число : " + num2);
                    break;
                } else if (num2 < computerNumber) {
                    System.out.println(num2 + " число меньше того, что загадал компьтер");
                } else if (num2 > computerNumber) {
                    System.out.println(num2 + " число больше того, что загадал компьтер");
                }
            }
    }
}