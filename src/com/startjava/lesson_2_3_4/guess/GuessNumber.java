package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

public class GuessNumber {

    // всего попыток
    private static final int ATTEMPTS = 10; 

    private Player[] players;
    private int secretNum;

    public GuessNumber(Player... players) {
        this.players = players;
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        secretNum = generateSecretNumber();
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.\n");
        while (true) {
            try {
                if (isGuessed(scanner)) {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Введите число!");
            }
        }
        printNums();
        clearNums();
        }

    private int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private boolean isGuessed(Scanner scanner) {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " введите число : ");
            if (checkNums(inputNum(scanner, player), player)) {
                return true;
            }
            if (checkAttempt(players) == ATTEMPTS) {
                System.out.println("У " + player.getName() + " закончились попытки\n");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                return false;
            }
        }
        return false;
    }

    // ходы игроков
    private boolean checkNums(int playerNum, Player player) {
        // if (playerNum == 0) {
        //     return false;
        // }
        if (playerNum == secretNum) {
            System.out.println(player.getName() + " отгадал число : " + playerNum + " c " + 
                player.getAttempt() + " попытки\n");
            return true;
        } 
        String lessOrMore = playerNum < secretNum ? "меньше" : "больше";
        System.out.println(playerNum + " число " + lessOrMore + " того, что загадал компьютер\n");

        return false;
    }

    private int inputNum(Scanner scanner, Player player) {
        System.out.println("Введите число в диапазоне чисел от 1 до 100!");
        int playerNum = 0;
        while (true) {
            playerNum = Integer.parseInt(scanner.nextLine());
            if (player.add(playerNum)) {
                break;
            } else {
                return 0;
            }
        }
        return playerNum;
    }

    private int checkAttempt(Player[] players) {
        int count = 0;
        for (Player player : players) {
            if (player.getAttempt() == ATTEMPTS) {
                count = 10;
            }
        }
        // проверка попыток временный код: 
        for (Player player : players) {
            System.out.println("player.getAttempt()  " + player.getAttempt());
        }
        //System.out.println("player.getAttempt()  " + player.getAttempt());
        return count;
    }

    private void printNums() {
        for (Player player : players) {
            System.out.print("Игрок " + player.getName() + " назвал числа: " );
            for (int n : player.getNums()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private void clearNums() {
        for (Player player : players) {
            player.clear();
        }
    }
}