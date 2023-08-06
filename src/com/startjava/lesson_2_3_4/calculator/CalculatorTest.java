package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while(!option.equals("no")) {
            System.out.println("Введите математическое выражение : 2 ^ 10");
            String[] expression = calc.splittingArray(scanner);
            calc.setNum1(Double.parseDouble(expression[0]));
            System.out.println("expression[1].charAt(0) : " + expression[1].charAt(0));
            calc.setSign(expression[1].charAt(0));
            calc.setNum2(Double.parseDouble(expression[2]));
            double result = calc.calculate();
            calc.printResult(result);
            clearArray(expression);
            calc.setSign(' ');
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            option = scanner.nextLine();
            if (!option.equals("yes")) {
                break;
            }
        }
    }

    private static void clearArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "";
        }
    }
}