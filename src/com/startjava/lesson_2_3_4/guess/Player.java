package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int numsPlayers[];
    private int attempt = 0; //попытки игроков
    
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int attempt) {
        this.name = name;
        this.attempt = attempt;
    }

    public void setAttempts(int[] num) {
        numsPlayers = num;
    }

    public String getName() {
        return name;
    }

    public void add(int num) {
        for (Integer i : nums) {
            nums[i] = num;
        }
    }

    public int size(){
        if (nums.length != 0) {
            return nums.length;    
        }
        return 0;
    }
}