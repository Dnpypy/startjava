package com.startjava.lesson_2_3.calculator;

import java.util.*;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while(!option.equals("no")) {
            System.out.println("Введите первое число: ");
            calc.setNum1(Integer.parseInt(scanner.nextLine()));
            System.out.println("Введите знак математической операции: ");
            calc.setSign(scanner.nextLine().charAt(0));
            System.out.println("Введите второе число: ");
            calc.setNum2(Integer.parseInt(scanner.nextLine()));
            calc.calculate();
                
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}