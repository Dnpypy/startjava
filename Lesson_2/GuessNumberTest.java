import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GuessNumber guessNumPlayers;
        int computerNumber = random.nextInt(100);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        guessNumPlayers = new GuessNumber(player1, player2);

        String option = "yes";
        while(!option.equals("no")) {

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
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}