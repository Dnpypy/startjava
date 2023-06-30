import java.util.Scanner;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            
            do {
                System.out.println("Введите знак математической операции: ");
            } while (calc.setSign(sc.next().charAt(0)));
            
            System.out.println("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            
            calc.calculate();
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            } while(answered(sc.next()));
    }

    // проверка на ответ yes/no
    public static boolean answered(String str) {
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
        if (str.equals("no") || str.equals(" ")) {
            return false;
        }
        return true;
    }
}