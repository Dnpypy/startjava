package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    // размер массива с числами
    private static final int CAPACITY = 10;
    
    private static final int STARTRANGE = 1;
    private static final int ENDRANGE = 100;

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
        if (num > STARTRANGE && num <= ENDRANGE) {
            nums[attempt++] = num;
            return true;
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