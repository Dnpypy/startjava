package com.startjava.lesson_2_3_4.array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = i + "1";
        }

        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();
        String[] str_2 = new String[3];

        for (String s : str_2) {
            System.out.println(s);
        }

    }
}