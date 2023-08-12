package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    // вычисления
    public double calculate(String exp) {
        double num1;
        double num2;
        char sign;
        String[] tempArray = exp.split(" ");
        num1 = Double.parseDouble(tempArray[0]);
        sign = tempArray[1].charAt(0);
        num2 = Double.parseDouble(tempArray[2]);
        
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

