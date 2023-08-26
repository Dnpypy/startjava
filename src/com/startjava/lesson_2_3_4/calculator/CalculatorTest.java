package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculatorTest {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        System.out.println("Старт калькулятора!");
        do {
            if ("yes".equals(option)) {
                System.out.println("Введите математическое выражение, пример : 2 ^ 10");
                String expression = scanner.nextLine();// введенное мат.выражение
                try {
                    double result = Calculator.calculate(expression);
                    printResult(result, expression);
                } catch (RuntimeException ex) {
                    System.out.println("!!!" + ex.getMessage());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
        System.out.println("Калькулятор выключается!");
    }

    private static void printResult(double result, String expression) {
        DecimalFormat df = new DecimalFormat("0.000"); // 3 знака после запятой 
        System.out.print(expression + " = ");
        System.out.println(result % 1 == 0 ? (int) result : df.format(result));
    }
}
