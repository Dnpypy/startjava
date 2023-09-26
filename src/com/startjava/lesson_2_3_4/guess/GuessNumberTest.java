package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int NUMBER_PLAYERS = 3;

    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");
        Scanner scanner = new Scanner(System.in);
        
        // создание объектов, инициализация
        GuessNumber game = inputNames(scanner);

        // запуск игры
        String option = "yes";
        do {
            if ("yes".equals(option)) {
                game.play(); // игровой процесс
            }
            System.out.println("\nХотите продолжить игру? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    private static GuessNumber inputNames(Scanner scanner) {
        Player[] players = new Player[NUMBER_PLAYERS];
        
        for (Player player : players) {
            player = initPlayer(scanner);
        }
        return new GuessNumber(players);
    }

    private static Player initPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока: ");
        return new Player(scanner.nextLine());
    }
}