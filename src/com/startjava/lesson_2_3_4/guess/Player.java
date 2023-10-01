package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    // размер массива с числами
    private static final int CAPACITY = 10;
    
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;

    private final String name;
    private int[] nums;

    // попытки игроков, изначально равно 0!
    private int attempt; 
    
    public Player(String name) {
        this.name = name;
        nums = new int[CAPACITY];
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public boolean add(int num) {
        if (num >= START_RANGE && num <= END_RANGE) {
            System.out.println("Переполнение массива?????");
            System.out.println("attempt : " + attempt);
            if (attempt == 10) {
                return false; // тут затык
            } else {
                nums[attempt++] = num;
            }
            return true;
            // //временная проверка
            // if (attempt == 10) {
            //     System.out.println("У игроков закочились попытки!!!");
            //     return false;
            // }
        } 
        return false;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}