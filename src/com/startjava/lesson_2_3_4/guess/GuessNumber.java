package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;
    private int gameOver;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }
    
    public void play() {
        secretNum = randomNums();

        int allAttempt = 10; // всего попыток
        
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        int playerMove = 1;
        gameOver = 0;
        while (true) {
            try {
                System.out.println("Введите число первого игрока: ");
                inputNumsPlayers(player1);
                if (gameOver == 1) {
                    break;
                } 
                playerMove++;
                System.out.println("Введите число второго игрока: ");
                inputNumsPlayers(player2);
                if (gameOver == 1) {
                    break;
                }
                playerMove++;

            } catch (NumberFormatException ex) {
                    System.out.println("Введите число!");
            }
        }
    }

    private int randomNums() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;
    }

    private void inputNumsPlayers(Player player) {
        Scanner scanner = new Scanner(System.in);
        int playerNum = Integer.parseInt(scanner.nextLine());
        playerMove(playerNum, player);
    }

    // ходы игроков
    private void playerMove(int playerNum, Player player) {
        int temp = 0;
        player.add(playerNum);
        temp += 1;
        player.setAttempt(temp);
        if (playerNum == secretNum) {
            System.out.println(player.getName() + " отгадал число : " + playerNum + " c " + 
                player.getAttempt() + " попытки\n");
            printNums(player.getNums(), player.getAttempt(), player);
            gameOver = 1;
        } 
        if (playerNum < secretNum) {
            System.out.println(playerNum + " число меньше того, что загадал компьютер\n");
        } else if (playerNum > secretNum) {
            System.out.println(playerNum + " число больше того, что загадал компьютер\n");
        }  
        if (player.getAttempt() == 10) { 
            System.out.println("У " + player.getName() + " закончились попытки\n");
            printNums(player.getNums(), player.getAttempt(), player);
            gameOver = 1;
        }
    }

    private void printNums(int[] array, int num, Player player) {
        for (Integer n : array) {
            System.out.print(n == 4 ? n + "\n" : n + " ");
        }
        player.clear();
    }
}