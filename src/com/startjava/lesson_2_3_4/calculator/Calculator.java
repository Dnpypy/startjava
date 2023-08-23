package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public static int getNum1() {
        return num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static char getSign() {
        return sign;
    }

    public static double calculate(String expression) {
        initial(expression);
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> throw new RuntimeException("Введённая математическая операция не поддерживается");
        };
        }

    private static void initial(String expression) {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length > 3) { // проверка длины массива
            throw new RuntimeException("Длина мат. выражения превышает допустимого!");
        }
        num1 = Integer.parseInt(partsExpression[0]);
        num2 = Integer.parseInt(partsExpression[2]);
        isPositive(num1);
        isPositive(num2);
        sign = partsExpression[1].charAt(0);
    }

    private static void isPositive(int num) {
        if (num <= 0) {
            throw new RuntimeException("Аргументы должны быть положительными");
        }
    }
}

