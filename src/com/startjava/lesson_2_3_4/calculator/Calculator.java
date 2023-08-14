package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    // вычисления
    public double calculate(String expression) {
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

