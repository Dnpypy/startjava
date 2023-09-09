package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;

    // попытки игроков
    private int attempt; 
    
    public Player(String name) {
        this.name = name;
        nums = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void add(int num) {
        nums[attempt++] = num;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void clear() {
        attempt = 0;
        Arrays.fill(nums, attempt, nums.length, 0);
    }
}