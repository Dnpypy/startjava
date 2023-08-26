package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int[] numsPlayers;
    private int count;
   
    public Player() {
        numsPlayers = new int[10];
    }

    public void setAttempts(int[] num) {
        numsPlayers = num;
    }

    public String getName() {
        return name;
    }

    public void add(int num) {
        if (count == numsPlayers.length) {
            int[] newAr = new int[numsPlayers.length * 2];
            System.arraycopy(numsPlayers, 0, newAr, 0, numsPlayers.length);
            numsPlayers = newAr;
        }
        numsPlayers[count++] = num;
    }

    public int size(){
        if (numsPlayers.length != 0) {
            return numsPlayers.length;    
        }
        return 0;
    }

    public int[] elementsArray() {
        return numsPlayers;
    }
}