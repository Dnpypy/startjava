package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums;
    private int count;
    private int attempt1; // тут хранятся попытки игрока 1
    private int attempt2; // тут хранятся попытки игрока 2
   
    public Player(String name) {
        this.name = name;
        nums = new int[10];
    }

    public void setAttempt(int attempt1) {
        this.attempt1 += attempt1;
    }

    public int getAttempt() {
        return attempt1;
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
}