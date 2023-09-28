package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private static final int ARRAY_LENGTH = 10;
    private static final int ZERO_NUMS = 0;
    private static final int ONE_HUNDRED = 100;
    private int[] nums;

    // попытки игроков
    private int attempt; 
    
    public Player(String name) {
        this.name = name;
        nums = new int[ARRAY_LENGTH];
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public boolean add(int num) {
        if (num > ZERO_NUMS && num <= ONE_HUNDRED) {
            nums[attempt++] = num;
            return true;
        } 
        System.out.println("Введите число в диапазоне чисел от 0 до 100!");
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