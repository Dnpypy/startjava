package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
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
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        System.out.println("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();

        return new GuessNumber(name1, name2, name3);
    }
}