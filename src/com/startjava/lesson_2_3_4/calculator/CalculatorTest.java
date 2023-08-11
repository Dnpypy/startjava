package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        do {
            if ("yes".equals(option)) {
                System.out.println("Введите математическое выражение : 2 ^ 10");
                String[] tempArray = scanner.nextLine().split(" "); // введенное мат.выражение
                double result = calc.calculate(tempArray);
                printResult(result, tempArray);
            }
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static void printResult(double result, String[] tempArray) {
        if (result != Double.MIN_VALUE) {
            if (result % 1 == 0) {
                System.out.println(tempArray[0] + " " + tempArray[1] + " " + tempArray[2] + " = " + (int) result);
            } else {
                DecimalFormat format = new DecimalFormat("0.00"); // 3 знака после запятой +
                System.out.println(tempArray[0] + " " + tempArray[1] + " " + tempArray[2] + 
                " = " + format.format(result));
            }
        } 
    }
}
