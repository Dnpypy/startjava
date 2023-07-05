import java.util.*;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while(true) {
            System.out.println("Введите первое число: ");
            calc.setA(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calc.setSign(scanner.nextLine().charAt(0));
            System.out.println("Введите второе число: ");
            calc.setB(scanner.nextInt());
            calc.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }

    // проверка на ответ yes/no
    // private static boolean isNext(String word) {
    //     if (word.equals("no")) {
    //         return true;
    //     } else if (word.equals("yes")) {
    //         return false;
    //     } 
    //     return false;
    // }

    // private static int checkNum(Scanner scanner) {
    //     var cycle = 0;
    //     var num = 0;
       
    //     do {
    //         try {
    //             num = Integer.parseInt(scanner.nextLine());
    //             cycle = 0;
    //         } catch (NumberFormatException ex) {
    //             cycle = 1;
    //         } catch (NullPointerException ex) {
    //             cycle = 1;
    //         }
    //     } while(cycle == 1);
    //     return num;
    // }
}