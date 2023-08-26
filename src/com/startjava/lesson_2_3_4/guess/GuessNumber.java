package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private String name1;
    private String name2;
    public int numsPlayer1[] = new int[10];
    public int numsPlayer2[] = new int[10];

    public GuessNumber(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        player1 = new Player();
        player2 = new Player();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int secretNum = random.nextInt(diff + 1) + min;
        
        int[] attemptPlay = new int[2];
        int allAttempt = 10;
       // int attempt = 0;
        System.out.println("Игра началась! У каждого игрока по " + allAttempt + " попыток.");
        
        while (true) {
            System.out.println("Введите число первого игрока: ");
            int playerNum1 = Integer.parseInt(scanner.nextLine());
            //attempt = attemptPlay[0];
            
            int count1 = 0;
            numsPlayer1[count1] = playerNum1;
            count1++;
            attemptPlay[0] += 1;
            if (playerNum1 == secretNum) {
                System.out.println(name1 + " отгадал число : " + playerNum1 + " c " + 
                    (attemptPlay[0]) + " попытки");
                break;
            } 
            if (playerNum1 < secretNum) {
                System.out.println(playerNum1 + " число меньше того, что загадал компьютер");
            } else if (playerNum1 > secretNum) {
                System.out.println(playerNum1 + " число больше того, что загадал компьютер");
            }  
            //attempt++;
            
            //System.out.println(attemptPlay);
            if (attemptPlay[0] == 10) { break; }

            System.out.println("Введите число второго игрока: ");
            //attempt = attemptPlay[1];
            //attempt++;
            var playerNum2 = Integer.parseInt(scanner.nextLine());
            int count2 = 0;
            numsPlayer2[count2] = playerNum2;
            count2++;
            attemptPlay[1] += 1;
            if (playerNum2 == secretNum) {
                System.out.println(name2 + " отгадал число : " + playerNum2 + " c " + 
                    (attemptPlay[1]) + " попытки");
                break;
            } 
            if (playerNum2 < secretNum) {
                System.out.println(playerNum2 + " число меньше того, что загадал компьютер");
            } else if (playerNum2 > secretNum) {
                System.out.println(playerNum2 + " число больше того, что загадал компьютер");
            }
            //attempt++;
            
            if (attemptPlay[1] == 10) { break; }
        }
    }
}