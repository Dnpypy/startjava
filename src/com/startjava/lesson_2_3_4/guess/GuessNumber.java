package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private String name1;
    private String name2;
    private int secretNum;
    
    public GuessNumber(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
    
    public void play() {
        
        player1 = new Player();
        player2 = new Player();
        
        secretNum = randomUtil();

        int allAttempt = 10;
        Scanner scanner = new Scanner(System.in);
        int[] attemptPlay = new int[2]; // тут хранятся попытки игроков
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        
        while (true) {
            try {
                System.out.println("Введите число первого игрока: ");
                int playerNum = Integer.parseInt(scanner.nextLine());
                player1.add(playerNum);
                attemptPlay[0] += 1;
                if (playerNum == secretNum) {
                    System.out.println(name1 + " отгадал число : " + playerNum + " c " + 
                        (attemptPlay[0]) + " попытки");
                    finishAttempts(player1.elementsArray(), attemptPlay[0]);
                    break;
                } 
                if (playerNum < secretNum) {
                    System.out.println(playerNum + " число меньше того, что загадал компьютер");
                } else if (playerNum > secretNum) {
                    System.out.println(playerNum + " число больше того, что загадал компьютер");
                }  
                if (attemptPlay[0] == 10) { 
                    System.out.println("У " + name1 + " закончились попытки");
                    finishAttempts(player1.elementsArray(), attemptPlay[0]);
                    break;
                }

                System.out.println("Введите число второго игрока: ");
                playerNum = Integer.parseInt(scanner.nextLine());
                player2.add(playerNum);
                attemptPlay[1] += 1;
                if (playerNum == secretNum) {
                    System.out.println(name2 + " отгадал число : " + playerNum + " c " + 
                        (attemptPlay[1]) + " попытки");
                    finishAttempts(player2.elementsArray(), attemptPlay[1]);
                    break;
                } 
                if (playerNum < secretNum) {
                    System.out.println(playerNum + " число меньше того, что загадал компьютер");
                } else if (playerNum > secretNum) {
                    System.out.println(playerNum + " число больше того, что загадал компьютер");
                }  
                if (attemptPlay[1] == 10) { 
                    System.out.println("У " + name2 + " закончились попытки");
                    finishAttempts(player2.elementsArray(), attemptPlay[1]);
                    break;
                }
            } catch (NumberFormatException ex) {
                    System.out.println("Введите число!");
            }
        }
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