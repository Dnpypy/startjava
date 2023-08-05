package com.startjava.lesson_2_3_4.calculator;

import java.util.*;
import java.text.DecimalFormat;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while(!option.equals("no")) {
            String[] expression = new String[3];
            System.out.println("Введите математическое выражение : 2 ^ 10");
            expression = scanner.nextLine().split(" ");
            calc.setNum1(Double.parseDouble(expression[0]));
            System.out.println("expression[1].charAt(0) : " + expression[1].charAt(0));
            calc.setSign(expression[1].charAt(0));
            calc.setNum2(Double.parseDouble(expression[2]));
            double result = 0.0;
            result = calc.calculate();
            if (result == 0.0) { // 1.0 - 1.0 = 0  +
                System.out.println(calc.getNum1() + " " + calc.getSign() + " " + calc.getNum2() + " = " + (int)result);
            } else if (!(result == -1.0)) { // "Ошибка: знак " + sign + " не поддерживается" +
                DecimalFormat format = new DecimalFormat("#.000"); // 3 знака после запятой +
                System.out.println(calc.getNum1() + " " + calc.getSign() + " " + calc.getNum2() + 
                    " = " + format.format(result));
            } 
            clearArray(expression);
            calc.setSign(' ');
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();

            } while(!option.equals("yes") && !option.equals("no"));
        }
    }

    private static void clearArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "";
        }
    }
}