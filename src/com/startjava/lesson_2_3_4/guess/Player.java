package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
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

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public boolean add(int num) {
        if (num > 0 && num <= 100) {
            nums[attempt++] = num;
            return true;
        } 
        System.out.println("Введите число в диапазоне чисел от 0 до 100!");
        return false;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}