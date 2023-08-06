package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {

    private double num1;
    private double num2;
    private char sign;
    private String[] expression;
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // помещаю в массив
    public String[] splittingArray(Scanner scanner) {
        expression = scanner.nextLine().split(" ");
        return expression;
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

    // вычисления
    public double calculate() {
        double result = 0.0;
        switch (sign) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 * num2; break;
            case '^': result = Math.pow(num1, num2); break;
            case '%': result = num1 % num2; break;    
            default: 
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                result = -1.0;
                break;
        }
        return result;
    }

    public void printResult(double result) {
        if (!(result == -1.0)) {
            if (result % 1 == 0) {
                System.out.println(num1 + " " + sign + " " + num2 + " = " + (int)result);
                System.out.println("Число является целым.");
            } else {
                DecimalFormat format = new DecimalFormat("0.00"); // 3 знака после запятой +
                System.out.println(num1 + " " + sign + " " + num2 + 
                " = " + format.format(result) + 0);
                System.out.println("Число не является целым.");
            }
        } 
    }
}

