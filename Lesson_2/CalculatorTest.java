import java.util.Scanner;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int cycle = 2;

        while (cycle > 1) {
            System.out.println("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            
            var cycle2 = true;
            while (cycle2) {
                System.out.println("Введите знак математической операции: ");
                cycle2 = calc.setSign(sc.next().charAt(0));
            }
            
            System.out.println("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            
            calc.calculate();
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            var yesNo = sc.next();
            if (yesNo.equals("no")) {
                cycle -= 1;
                sc.close();
            } 
        }
    }
}