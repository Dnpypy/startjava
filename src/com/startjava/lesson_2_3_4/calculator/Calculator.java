package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    // вычисления
    public static double calculate(String expression) {
        if (!(expression.length() < 15)) { // длина вводимого мат. выражения
            System.out.println("Длина мат. выражения превышает допустимого!");
            return 0.0;
        }
        String[] partsExpression = expression.split(" ");
        double num1 = Double.parseDouble(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        double num2 = Double.parseDouble(partsExpression[2]);
        
        switch (sign) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2; 
            case '/': return num1 / num2; 
            case '^': return Math.pow(num1, num2); 
            case '%': return num1 % num2; 
            default: 
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.MIN_VALUE;
        }
    }
}

