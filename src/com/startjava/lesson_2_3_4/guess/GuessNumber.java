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

        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        int exit = 0;
        while (true) {
            System.out.println("Введите число первого игрока: ");
            exit = inputNumsPlayers(player1, name1);
            System.out.println("Введите число второго игрока: ");
            exit = inputNumsPlayers(player2, name2);
            System.out.println("\nexit : " + exit);
            if (exit == 1) { 
                break; 
            }
        }
    }

    private int inputNumsPlayers(Player player, String name) {
        Scanner scanner = new Scanner(System.in);
        int[] attemptPlay1 = new int[2]; // тут хранятся попытки игроков
        
        try {
            int playerNum = Integer.parseInt(scanner.nextLine());
            player.add(playerNum);
            if (player.getName() == "player1") {
                attemptPlay1[0] += 1;
            } 
            if (player.getName() == "player2") {
                attemptPlay1[1] += 1;
            }
            
            if (playerNum == secretNum) {
                System.out.println(name + " отгадал число : " + playerNum + " c " + 
                    (attemptPlay1[0]) + " попытки");
                finishAttempts(player.elementsArray());
                return 1;
            } 
            if (playerNum < secretNum) {
                System.out.println(playerNum + " число меньше того, что загадал компьютер");
            } else if (playerNum > secretNum) {
                System.out.println(playerNum + " число больше того, что загадал компьютер");
            }  
            if (attemptPlay1[0] == 10 || attemptPlay1[1] == 10) { 
                System.out.println("У " + name + " закончились попытки");
                finishAttempts(player.elementsArray());
                return 1;
            }
        } catch (NumberFormatException ex) {
                System.out.println("Введите число!");
        }
        return 0;
    }

    private void finishAttempts(int[] array) {
        int[] outputArray = Arrays.copyOf(array, array.length);
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