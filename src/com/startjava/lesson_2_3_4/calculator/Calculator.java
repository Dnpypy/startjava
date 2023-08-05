package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private double num1;
    private double num2;
    private char sign;
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getSign() {
        return sign;
    }

    // проверка математической операции
    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign ==  '%') {
            this.sign = sign;
            return true;
        } 
        this.sign = sign; // любой знак записывается и для вывода ошибка нужно
        return false;
    }

    // вычисления
    // public void calculate() {
    //     double result = 0.0;
    //     switch (sign) {
    //         case '+' :
    //             result = num1 + num2;
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //             return result;
    //         case '-' :
    //             result = num1 - num2;
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //         case '*' :
    //             result = num1 * num2;
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //         case '/' :
    //             result = num1 / num2;
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //         case '^' :
    //             result = Math.pow(num1, num2);
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //         case '%' :
    //             result = num1 % num2;
    //             System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    //             break;
    //         default:
    //             System.out.println("Ошибка: знак " + sign + " не поддерживается");
    //             break;
    //     }
    // }

    // вычисления
    public double calculate() {
        if (sign == '+') {
            return num1 + num2;
        } else if (sign == '-') {
            return num1 - num2;
        } else if (sign == '*') {
            return num1 * num2;
        } else if (sign == '/') {
            return num1 / num2;
        } else if (sign == '^') {
            return Math.pow(num1, num2);
        } else if (sign == '%') {
            return num1 % num2;
        } else {
            System.out.println("Ошибка: знак " + sign + " не поддерживается");
            return -1.0;
        }
    }
}

