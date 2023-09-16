package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    //private Player player1;
    //private Player player2;
    //private Player player3;
    private Player[] players;
    private int secretNum;

    public GuessNumber(String name1, String name2, String name3) {
        players =  new Player[] {new Player(name1), new Player(name1), new Player(name1)};
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        secretNum = generateSecretNumber();
        int allAttempt = 10; // всего попыток
        
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        while (true) {
            try {
                System.out.println("\nВведите число первого игрока: ");
                if (isGuessed(inputNum(scanner, players[0]), players[0])) {
                    break;
                }
                System.out.println("\nВведите число второго игрока: ");
                if (isGuessed(inputNum(scanner, players[1]), players[1])) {
                    break;
                }
                System.out.println("\nВведите число третьего игрока: ");
                if (isGuessed(inputNum(scanner, players[2]), players[2])) {
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
        }

    private int checkAttempt(Player[] players) {
        int count = 0;
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i].getAttempt() == 10) {
                count++;
            }
        }
        return count;
    }

    private int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private int inputNum(Scanner scanner, Player player) {
        int playerNum = 0;
        while (true) {
            playerNum = Integer.parseInt(scanner.nextLine());
            if(player.add(playerNum)) {
                break;
            }
        }
        
        return playerNum;
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

    // private void printNums(Player player) {
    private void printNums(Player[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            System.out.print("Игрок " + players[i].getName() + " назвал числа: " );
            System.out.println();
            for (int n : players[i].getNums()) {
                System.out.print(n + " ");
            }
            System.out.println();
            players[i].clear();
        }    
        // System.out.print("Игрок " + player.getName() + " назвал числа: " );
        // System.out.println();
        // for (int n : player.getNums()) {
        //     System.out.print(n + " ");
        // }
        // System.out.println();
    }
}