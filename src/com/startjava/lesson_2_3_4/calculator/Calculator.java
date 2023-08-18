package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    public static double calculate(String expression) {
        try {
            String[] partsExpression = expression.split(" ");
            if (partsExpression.length > 3) { // проверка длины массива
                throw new RuntimeException("Длина мат. выражения превышает допустимого!");
            }
            int num1, num2 = 0;
            if (Integer.parseInt(partsExpression[0]) > 0) {
                num1 = Integer.parseInt(partsExpression[0]);
            } else {
                throw new RuntimeException("Число меньше нуля!");
            }
            char sign = partsExpression[1].charAt(0);
            if (Integer.parseInt(partsExpression[2]) > 0) {
                num2 = Integer.parseInt(partsExpression[2]);
            } else {
                throw new RuntimeException("Число меньше нуля!");
            }
            
            switch (sign) {
                case '+': return num1 + num2;
                case '-': return num1 - num2;
                case '*': return num1 * num2; 
                case '/': return num1 / num2; 
                case '^': return Math.pow(num1, num2); 
                case '%': return num1 % num2; 
                default: 
                    throw new RuntimeException("Ошибка: знак " + sign + " не поддерживается");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}

