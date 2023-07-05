import java.util.*;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while(!option.equals("no")) {
            while (true) {
                try {
                    System.out.println("Введите первое число: ");
                    calc.setA(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Введите знак математической операции: ");
                    calc.setSign(scanner.nextLine().charAt(0));
                    System.out.println("Введите второе число: ");
                    calc.setB(Integer.parseInt(scanner.nextLine()));
                    calc.calculate();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка вводите все заново!");
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Ошибка вводите все заново!");
                }
            }
             
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}