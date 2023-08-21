package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public static double calculate(String expression) {
        initial(expression);
        if (isNegative(num1) && isNegative(num2)) {
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
        return 0;
    }

    public static void initial(String expression) {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length > 3) { // проверка длины массива
            throw new RuntimeException("Длина мат. выражения превышает допустимого! 2 + 2 2");
        }
        num1 = Integer.parseInt(partsExpression[0]);
        num2 = Integer.parseInt(partsExpression[2]);
        sign = partsExpression[1].charAt(0);
    }

    public static boolean isNegative(int num) {
        if (num <= 0) {
            throw new RuntimeException("Аргументы должны быть положительными");
        }
        return true;
    }
}

