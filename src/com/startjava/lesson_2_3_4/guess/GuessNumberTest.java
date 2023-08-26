package com.startjava.lesson_2_3_4.guess;

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
        do {
            if ("yes".equals(option)) {
                //System.out.println("Игра началась! У каждого игрока по + " + Player.attempt + " + попыток.");
                game.play(); // игровой процесс
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }
}