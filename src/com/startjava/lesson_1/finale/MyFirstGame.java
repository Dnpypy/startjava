package com.startjava.lesson_1.finale;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("\nИгра Угадай число : ");

        int computerNumber = 3;
        bSearch(computerNumber);
    }

    public static void bSearch(int computerNumber) {
        int min = 0;
        int max = 100;
        int middle = 0;
        
        while (min <= max) {
            middle = (min + max) / 2; 
            if (middle == computerNumber) {
                System.out.printf(computerNumber + " число найдено ");
                break;
            } else if (middle < computerNumber) {
                min = middle + 1;
                System.out.println(middle + " число меньше того, что загадал компьютер");
            } else {
                max = middle - 1;
                System.out.printf(middle + " число больше того, что загадал компьютер\n");
            }
        }
    }
}