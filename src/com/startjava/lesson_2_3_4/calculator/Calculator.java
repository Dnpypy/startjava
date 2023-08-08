package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;
    private char sign;
    private String[] expression;
    
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
    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign ==  '%') {
            this.sign = sign;
            return true;
        } 
        this.sign = sign; // любой знак записывается и для вывода ошибок нужен
        return false;
    }

    public char getSign() {
        return sign;
    }

    // помещаю в массив
    public String[] splittingArray(Scanner scanner) {
        expression = scanner.nextLine().split(" ");
        return expression;
    }

    

    // вычисления
    public double calculate(String[] array) {
        setNum1(Double.parseDouble(array[0]));
        setSign(array[1].charAt(0));
        setNum2(Double.parseDouble(array[2]));

        double result = 0.0;
        switch (sign) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            case '^': result = Math.pow(num1, num2); break;
            case '%': result = num1 % num2; break;    
            default: 
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                result = -1.0;
                break;
        }
        return result;
    }
}

