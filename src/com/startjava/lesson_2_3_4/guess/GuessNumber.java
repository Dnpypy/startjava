package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

public class GuessNumber {

    private Player[] players;
    private int secretNum;

    public GuessNumber(String ... names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names);
        }
        
        // перетасовка массива(жребий игроков)
        players = shuffle(players);
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        secretNum = generateSecretNumber();
        int allAttempt = 10; // всего попыток
        
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        while (true) {
            try {
                if (inputNumsPlayers(scanner, "\nВведите число первого игрока: ") ||
                    inputNumsPlayers(scanner, "\nВведите число второго игрока: ") ||
                    inputNumsPlayers(scanner, "\nВведите число третьего игрока: ")) {
                    break;
                }
                if (checkAttempt(players) == 3) {
                    System.out.println("У игроков закончились попытки");
                    break;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Введите число!");
            }
        }
        printNums(players);
        clearNums(players);
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

    private boolean inputNumsPlayers(Scanner scanner, String str) {
        for (Player player : players) {
            if (isGuessed(inputNum(scanner, player), player)) {
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
        // тернарный оператор
        String smallNums = playerNum + " число меньше того, что загадал компьютер\n";
        String bigNums = playerNum + " число больше того, что загадал компьютер\n";
        System.out.print((playerNum < secretNum) ? smallNums : bigNums);
        
        if (player.getAttempt() == 10) { 
            System.out.println("У " + player.getName() + " закончились попытки\n");
        }
        return false;
    }

    private int inputNum(Scanner scanner, Player player) {
        int playerNum = 0;
        while (true) {
            playerNum = Integer.parseInt(scanner.nextLine());
            if (player.add(playerNum)) {
                break;
            }
        }
        return playerNum;
    }

    private int checkAttempt(Player[] players) {
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getAttempt() == 10) {
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
        for (int i = 0; i < players.length; i++) {
            players[i].clear();
        }
    }
}