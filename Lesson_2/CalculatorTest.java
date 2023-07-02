import java.util.*;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            calc.setNum1(checkNumber1(scanner));
            
            while (true) {
                System.out.println("Введите знак математической операции: ");
                if (calc.setSign(scanner.next().charAt(0))) {
                    break;
                } 
            }
            
            calc.setNum2(checkNumber2(scanner));
            calc.calculate();
            
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String word = scanner.nextLine().trim().toLowerCase();
                if (isNext(word)) {
                    System.exit(0);
                } 
                if (isNext(word) == false) {
                    break;
                }
            }
        }
    }

    // проверка на ответ yes/no
    private static boolean isNext(String word) {
        if (word == null || word.equals("")) {
            return false;
        } else if (word.equals("no")) {
            return true;
        } else if (word.equals("yes")) {
            return false;
        } 
        return false;
    }

    private static int checkNumber1(Scanner scanner) {
        var cycle = 0;
        var num = 0;
       
        do {
            try {
                System.out.println("Введите первое число: ");
                num = Integer.parseInt(scanner.nextLine());
                cycle = 0;
            } catch (NumberFormatException ex) {
                cycle = 1;
            } catch (NullPointerException ex) {
                cycle = 1;
            }
        } while(cycle == 1);
        return num;
    }

    private static int checkNumber2(Scanner scanner) {
        var cycle = 0;
        var num = 0;
        do {
            try {
                System.out.println("Введите второе число: ");
                num = Integer.parseInt(scanner.nextLine());
                cycle = 0;
            } catch (NumberFormatException ex) {
                cycle = 1;
            } catch (NullPointerException ex) {
                cycle = 1;
            }
        }while(cycle == 1);
        return num;
    }
}