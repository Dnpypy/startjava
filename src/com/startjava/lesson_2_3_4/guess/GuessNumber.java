package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play() {
        
        secretNum = randomUtil();

        int allAttempt = 10; // всего попыток
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        
        while (true) {
            int temp1 = 0;
            int temp2 = 0;
            try {
                System.out.println("Введите число первого игрока: ");
                int playerNum = Integer.parseInt(scanner.nextLine());
                player1.add(playerNum);
                temp1 += 1;
                player1.setAttempt1(temp1);
                if (playerNum == secretNum) {
                    System.out.println(infoName1() + " отгадал число : " + playerNum + " c " + 
                        player1.getAttempt1() + " попытки");
                    finishAttempts(player1.elementsArray(), player1.getAttempt1());
                    break;
                } 
                if (playerNum < secretNum) {
                    System.out.println(playerNum + " число меньше того, что загадал компьютер");
                } else if (playerNum > secretNum) {
                    System.out.println(playerNum + " число больше того, что загадал компьютер");
                }  
                if (player1.getAttempt1() == 10) { 
                    System.out.println("У " + infoName1() + " закончились попытки");
                    finishAttempts(player1.elementsArray(), player1.getAttempt1());
                    break;
                }

                System.out.println("Введите число второго игрока: ");
                playerNum = Integer.parseInt(scanner.nextLine());
                player2.add(playerNum);
                temp2 += 1;
                player2.setAttempt2(temp2);
                if (playerNum == secretNum) {
                    System.out.println(infoName2() + " отгадал число : " + playerNum + " c " + 
                        (player2.getAttempt2()) + " попытки");
                    finishAttempts(player2.elementsArray(), player2.getAttempt2());
                    break;
                } 
                if (playerNum < secretNum) {
                    System.out.println(playerNum + " число меньше того, что загадал компьютер");
                } else if (playerNum > secretNum) {
                    System.out.println(playerNum + " число больше того, что загадал компьютер");
                }  
                if (player2.getAttempt2() == 10) { 
                    System.out.println("У " + infoName2() + " закончились попытки");
                    finishAttempts(player2.elementsArray(), player2.getAttempt2());
                    break;
                }
            } catch (NumberFormatException ex) {
                    System.out.println("Введите число!");
            }
        }
    }

    private String infoName1() {
        return player1.getName1();
    }

    private String infoName2() {
        return player2.getName2();
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