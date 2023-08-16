package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        do {
            try {
                if ("yes".equals(option)) {
                    System.out.println("Введите математическое выражение, пример : 2 ^ 10");
                    String expression = scanner.nextLine();// введенное мат.выражение
                    double result = Calculator.calculate(expression);
                    printResult(result, expression);
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } catch (NumberFormatException ex) {
                System.out.println("Введите число!");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Введите два числа и математический знак!");
            }
        } while(!"no".equals(option));
    }

    public static void printResult(double result, String expression) {
        if (result != Double.MIN_VALUE && result > 0) {
            if (result % 1 == 0) {
                System.out.println(expression + " = " + (int) result);
            } else {
                DecimalFormat format = new DecimalFormat("0.000"); // 3 знака после запятой +
                System.out.println(expression + " = " + format.format(result));
            }
        } 
    }
}
