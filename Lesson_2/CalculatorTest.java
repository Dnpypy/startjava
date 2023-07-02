import java.util.*;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите первое число: ");
            calc.setNum1(checkNum(scanner));
            
            while (true) {
                System.out.println("Введите знак математической операции: ");
                var word = scanner.nextLine();
                if (word.isEmpty()) {
                    continue;
                } else {
                    if (calc.setSign(word.charAt(0))) {
                        break;
                    } 
                }
                
            }
            System.out.println("Введите второе число: ");
            calc.setNum2(checkNum(scanner));
            calc.calculate();
            
            while(true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                var word = scanner.nextLine().trim().toLowerCase();
                if (word.equals("yes") || word.equals("no")) {
                   if (isNext(word)) {
                        System.exit(0);
                    } else if (isNext(word) == false) {
                        break;
                    } 
                }
            }
        }
    }

    // проверка на ответ yes/no
    private static boolean isNext(String word) {
        if (word.equals("no")) {
            return true;
        } else if (word.equals("yes")) {
            return false;
        } 
        return false;
    }

    private static int checkNum(Scanner scanner) {
        var cycle = 0;
        var num = 0;
       
        do {
            try {
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
}