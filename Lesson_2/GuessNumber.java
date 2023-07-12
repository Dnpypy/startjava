import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var computerNumber = random.nextInt(100);
        while (true) {
                System.out.println("Введите число первого игрока: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                if (num1 < computerNumber) {
                    System.out.println(num1 + " число меньше того, что загадал компьютер");
                } else if (num1 > computerNumber) {
                    System.out.println(num1 + " число больше того, что загадал компьютер");
                } else if (num1 == computerNumber) {
                    System.out.println("Игрок 1 отгадал число! " + "число : " + num1);
                    break;
                }

                System.out.println("Введите число второго игрока: ");
                int num2 = Integer.parseInt(scanner.nextLine());
                if (num2 < computerNumber) {
                    System.out.println(num2 + " число меньше того, что загадал компьютер");
                } else if (num2 > computerNumber) {
                    System.out.println(num2 + " число больше того, что загадал компьютер");
                } else if (num2 == computerNumber) {
                    System.out.println("Игрок 2 отгадал число! " + "число : " + num2);
                    break;
                }
            }
    }
}