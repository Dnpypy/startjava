package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;
    private int gameOver;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play() {
        
        secretNum = randomUtil();

        int allAttempt = 10; // всего попыток
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        int playerMove = 1;
        gameOver = 0;
        while (true) {
            try {
                System.out.println("Введите число первого игрока: ");
                int playerNum = Integer.parseInt(scanner.nextLine());
                if (playerMove % 2 != 0) { // нечет то ходит перв игрок
                    playerMove(playerNum, player1);
                } else if (playerMove % 2 == 0) {
                    playerMove(playerNum, player2);
                }
                if (gameOver == 1) {
                    break;
                } 
                playerMove++;
                System.out.println("Введите число второго игрока: ");
                playerNum = Integer.parseInt(scanner.nextLine());
                if (playerMove % 2 != 0) { // нечет то ходит перв игрок
                    playerMove(playerNum, player1);
                } else if (playerMove % 2 == 0) {
                    playerMove(playerNum, player2);
                }
                if (gameOver == 1) {
                    break;
                }
                playerMove++;

            } catch (NumberFormatException ex) {
                    System.out.println("Введите число!");
            }
        }
    }

    // набросок метода
    private void playerMove(int playerNum, Player player) {
        int temp = 0;
        player.add(playerNum);
        temp += 1;
        player.setAttempt(temp);
        if (playerNum == secretNum) {
            System.out.println(infoName() + " отгадал число : " + playerNum + " c " + 
                player.getAttempt() + " попытки\n");
            finishAttempts(player.elementsArray(), player.getAttempt());
            gameOver = 1;
        } 
        if (playerNum < secretNum) {
            System.out.println(playerNum + " число меньше того, что загадал компьютер");
        } else if (playerNum > secretNum) {
            System.out.println(playerNum + " число больше того, что загадал компьютер");
        }  
        if (player.getAttempt() == 10) { 
            System.out.println("У " + infoName() + " закончились попытки\n");
            finishAttempts(player.elementsArray(), player.getAttempt());
            gameOver = 1;
        }

    }

    private String infoName() {
        return player1.getName();
    }

    private void finishAttempts(int[] array, int num) {
        int[] outputArray = Arrays.copyOf(array, num);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(i == 4 ? outputArray[i] + "\n" : outputArray[i] + " ");
        }
    }

    private int randomUtil() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;
    }
}