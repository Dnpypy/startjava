import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");

        // создание объектов, инициализация
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerNumber = random.nextInt(100);
        GuessNumber guessNumber = new GuessNumber();

        // создание игроков(игровой процесс)
        GuessNumber guessNumPlayers = guessNumber.initPlayers(scanner);

        // запуск игры
        String option = "yes";
        while(!option.equals("no")) {
            // игровой процесс
            guessNumber.initGuessGames(scanner, computerNumber);

            // ввод и обработку ответа игрока о продолжении/завершении
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}