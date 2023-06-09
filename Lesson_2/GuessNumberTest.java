import java.util.Scanner;

public class GuessNumberTest {
    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");

        // создание объектов, инициализация
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);

        // запуск игры
        String option = "yes";
        while(!option.equals("no")) {
            // игровой процесс
            game.play();

            // ввод и обработка ответа игрока о продолжении/завершении
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}