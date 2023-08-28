package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name1;
    private String name2;
    private int[] nums;
    private int count;
    private int attempt1; // тут хранятся попытки игрока 1
    private int attempt2; // тут хранятся попытки игрока 2
   
    public Player(String name1) {
        this.name1 = name1;
        this.name2 = name2;
        nums = new int[10];
    }

    public void setAttempt1(int attempt1) {
        this.attempt1 += attempt1;
    }

    public int getAttempt1() {
        return attempt1;
    }

    public void setAttempt2(int attempt2) {
        this.attempt2 += attempt2;
    }

    public int getAttempt2() {
        return attempt2;
    }

    public void setAttempts(int[] num) {
        nums = num;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public void add(int num) {
        nums[count++] = num;
    }

    public int[] elementsArray() {
        int[] newNums = Arrays.copyOf(nums, nums.length);
        return newNums;
    }
}