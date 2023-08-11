package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;
    private char sign;
   
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    // проверка математической операции
    public void setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign ==  '%') {
            this.sign = sign;
        } 
        this.sign = sign; // любой знак записывается и для вывода ошибок нужен
    }

    public char getSign() {
        return sign;
    }

    // вычисления
    public double calculate(String[] array) {
        setNum1(Double.parseDouble(array[0]));
        setSign(array[1].charAt(0));
        setNum2(Double.parseDouble(array[2]));

        System.out.println("sign : " + sign);
        switch (sign) {
            case '+':  return num1 + num2; 
            case '-':  return num1 - num2; 
            case '*':  return num1 * num2; 
            case '/':  return num1 / num2; 
            case '^':  return Math.pow(num1, num2); 
            case '%':  return num1 % num2; 
            default: 
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.MIN_VALUE;
        }
    }
}

