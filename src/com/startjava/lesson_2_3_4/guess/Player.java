package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;

    // счетчик для индекса массива nums
    private int count;

    // попытки игроков
    private int attempt; 
    
    public Player(String name) {
        name = name;
        nums = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int attempt) {
        this.attempt += attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public void add(int num) {
        System.out.println(" count: " + count);
        System.out.println(" attempt: " + attempt);
        nums[count++] = num;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void clear() {
        attempt = 0;
        Arrays.fill(nums, 0, attempt, 0);
    }
}