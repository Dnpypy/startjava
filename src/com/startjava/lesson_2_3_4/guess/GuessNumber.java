package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        secretNum = generateSecretNumber();
        int allAttempt = 10; // всего попыток
        
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        while (true) {
            try {
                System.out.println("\nВведите число первого игрока: ");
                if (isGuessed(inputNum(scanner, player1), player1)) {
                    break;
                }
                System.out.println("\nВведите число второго игрока: ");
                if (isGuessed(inputNum(scanner, player2), player2)) {
                    break;
                }
                if (player1.getAttempt() == 10 && player2.getAttempt() == 10) {
                    System.out.println("У игроков закончились попытки");
                    break;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Введите число!");
            }
        }
        System.out.print("Игрок " + player1.getName() + " назвал числа: " );
        printNums(player1);
        System.out.println();
        System.out.print("Игрок " + player2.getName() + " назвал числа: " );
        printNums(player2);
        player1.clear();
        player2.clear();
    }

    private int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private int inputNum(Scanner scanner, Player player) {
        int playerNum = Integer.parseInt(scanner.nextLine());
        player.add(playerNum);
        return playerNum;
    }

    // ходы игроков
    private boolean isGuessed(int playerNum, Player player) {
        if (playerNum == secretNum) {
            System.out.println(player.getName() + " отгадал число : " + playerNum + " c " + 
                player.getAttempt() + " попытки\n");
            return true;
        } 
        if (playerNum < secretNum) {
            System.out.println(playerNum + " число меньше того, что загадал компьютер\n");
        } else if (playerNum > secretNum) {
            System.out.println(playerNum + " число больше того, что загадал компьютер\n");
        }  
        if (player.getAttempt() == 10) { 
            System.out.println("У " + player.getName() + " закончились попытки\n");
            //return true;
        }
        return false;
    }

    private void printNums(Player player) {
        for (int n : player.getNums()) {
            System.out.print(n + " ");
        }
    }
}