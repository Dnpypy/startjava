package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void  main(String[] args) {
        System.out.println("\nИгра Угадай число : ");

        // создание объектов, инициализация
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        GuessNumber game = new GuessNumber(name1, name2);

        // запуск игры
        String option = "yes";
        do {
            if ("yes".equals(option)) {
                game.play(); // игровой процесс
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }
}