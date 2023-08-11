package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

import static com.startjava.lesson_2_3_4.calculator.Calculator.expression;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        do {
            if ("yes".equals(option)) {
                System.out.println("Введите математическое выражение : 2 ^ 10");
                expression = scanner.nextLine().split(" ");
                System.out.println(expression);
                double result = calc.calculate(expression);
                printResult(result, calc);
            }
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static void printResult(double result, Calculator calc) {
        if (result != Double.MIN_VALUE) {
            if (result % 1 == 0) {
                System.out.println(expression[0] + " " + expression[1] + " " + expression[2] + " = " + (int) result);
            } else {
                DecimalFormat format = new DecimalFormat("0.00"); // 3 знака после запятой +
                System.out.println(calc.getNum1() + " " + calc.getSign() + " " + calc.getNum2() + 
                " = " + format.format(result));
            }
        } 
    }
}
