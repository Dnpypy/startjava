package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

public class GuessNumber {

    private static final int ROUNDS = 3;    // раунды игроков
    private static final int ATTEMPTS = 10; // всего попыток
    private static final int ALL_ATTEMPTS_PLAYERS = 3; // попытки всех игроков
    private Player[] players;
    private int secretNum;

    public GuessNumber(Player... players) {
        this.players = players;
        
        // перетасовка массива(жребий игроков)
        players = shuffle(players);
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ROUNDS; i++) {
            secretNum = generateSecretNumber();
            System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");
            while (true) {
                try {
                    if (inputNumsPlayers(scanner)) {
                        break;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Введите число!");
                }
                printNums(players);
                clearNums(players);
            }
        }
    }

    private Player[] shuffle(Player[] players) {
        Random random = new Random();
        for(int i = 0; i < players.length - 1; i++) {
            int index = (int) Math.random() * 3;
            Player temp = players[i];
            players[i] = players[index];
            players[index] = temp;
        }
        return players;
    }

    private int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private boolean inputNumsPlayers(Scanner scanner) {
        String str1 = "первого";
        String str2 = "второго";
        String str3 = "третьего";
        for (int j = 0; j < players.length; j++) {
            if (j == 0) {
                System.out.println("\nВведите число " + str1 + " игрока: ");
            }
            if (j == 1) {
                System.out.println("\nВведите число " + str2 + " игрока: ");
            }
            if (j == 2) {
                System.out.println("\nВведите число " + str3 + " игрока: ");
            }
            if (isGuessed(inputNum(scanner, players[j]), players[j])) {
                return true;
            }
            if (checkAttempt(players) == ALL_ATTEMPTS_PLAYERS) {
                System.out.println("У игроков закончились попытки");
                return true;
            }
        }
        return false;
    }

    // ходы игроков
    private boolean isGuessed(int playerNum, Player player) {
        if (playerNum == secretNum) {
            System.out.println(player.getName() + " отгадал число : " + playerNum + " c " + 
                player.getAttempt() + " попытки\n");
            return true;
        } 
        String wordSmallLong = playerNum < secretNum ? "меньше" : "больше";
        System.out.println(playerNum + " число + " + wordSmallLong + " того, что загадал компьютер\n");

        
        if (player.getAttempt() == ATTEMPTS) { 
            System.out.println("У " + player.getName() + " закончились попытки\n");
        }
        return false;
    }

    private int inputNum(Scanner scanner, Player player) {
        int playerNum = 0;
        while (true) {
            playerNum = Integer.parseInt(scanner.nextLine());
            System.out.println("Число : " + playerNum);
            if (player.add(playerNum)) {
                break;
            }
        }
        return playerNum;
    }

    private int checkAttempt(Player[] players) {
        int count = 0;
        for (Player player : players) {
            if (player.getAttempt() == ATTEMPTS) {
                count++;
            }
        }
        return count;
    }

    private void printNums(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Игрок " + players[i].getName() + " назвал числа: " );
            for (int n : players[i].getNums()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }    
    }

    private void clearNums(Player[] players) {
        for (Player player : players) {
            player.clear();
        }
    }
}