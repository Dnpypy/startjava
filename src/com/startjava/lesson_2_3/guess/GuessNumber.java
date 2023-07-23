package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var min = 1;
        var max = 100;
        var diff = max - min;
        var secretNum = random.nextInt(diff + 1) + min;

        while (true) {
            System.out.println("Введите число первого игрока: ");
            var playerNum1 = Integer.parseInt(scanner.nextLine());
            if (playerNum1 == secretNum) {
                System.out.println("Игрок 1 отгадал число! " + "число : " + playerNum1);
                break;
            } 
            if (playerNum1 < secretNum) {
                System.out.println(playerNum1 + " число меньше того, что загадал компьютер");
            } else if (playerNum1 > secretNum) {
                System.out.println(playerNum1 + " число больше того, что загадал компьютер");
            }  

            System.out.println("Введите число второго игрока: ");
            var playerNum2 = Integer.parseInt(scanner.nextLine());
            if (playerNum2 == secretNum) {
                System.out.println("Игрок 1 отгадал число! " + "число : " + playerNum2);
                break;
            } 
            if (playerNum2 < secretNum) {
                System.out.println(playerNum2 + " число меньше того, что загадал компьютер");
            } else if (playerNum2 > secretNum) {
                System.out.println(playerNum2 + " число больше того, что загадал компьютер");
            }
        }
    }
}