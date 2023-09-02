package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;
    private int count;
    private int attempt; // тут хранятся попытки игроков
    
    public Player(String name) {
        this.name = name;
        nums = new int[10];
    }

    public void setAttempt(int attempt) {
        this.attempt += attempt;
    }

    public void zeroAttempt() {
        this.attempt = 0;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempts(int[] num) {
        nums = num;
    }

    public String getName() {
        return name;
    }

    public void add(int num) {
        nums[count++] = num;
    }

    public int[] elementsArray() {
        int[] newNums = Arrays.copyOf(nums, nums.length);
        return newNums;
    }

    public void fillArray() {
        Arrays.fill(nums, 0, attempt, 0);
    }
}