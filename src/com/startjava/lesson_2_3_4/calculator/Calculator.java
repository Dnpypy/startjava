package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.math.BigInteger;

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
                case '/' -> num1 / num2;
                case '^' -> (double) Math.pow(num1, num2);
                case '%' -> num1 % num2;
                default -> {
                    throw new RuntimeException("Ошибка: знак " + sign + " не поддерживается");
                }
            };
        }
        return 0.0;
    }

    public static void initial(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            if (partsExpression.length > 3) { // проверка длины массива
                throw new RuntimeException("Длина мат. выражения превышает допустимого!");
            }
            if ((Integer.parseInt(partsExpression[0]) < 0) || (Integer.parseInt(partsExpression[2]) < 0)) {
                throw new RuntimeException("Число меньше нуля!");
            }
            num1 = Integer.parseInt(partsExpression[0]);
            num2 = Integer.parseInt(partsExpression[2]);
            sign = partsExpression[1].charAt(0);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static <T extends Number> boolean isNegative(T num) {
        try {
            if (num.doubleValue() <= 0) {
                throw new RuntimeException("Аргументы должны быть положительными");
            }
            return true;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

