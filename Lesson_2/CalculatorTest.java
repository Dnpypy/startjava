import java.util.Scanner;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator(2);
        Scanner sc = new Scanner(System.in);
        
        while (calc.getCycle() > 1) {
            System.out.println("Введите первое число: ");
            calc.num1 = sc.nextInt();
            
            var cycle2 = 1;
            while (cycle2 == 1) {
                calc.textSign();
                cycle2 = calc.checkSign(sc.next().charAt(0));
            }
            
            System.out.println("Введите второе число: ");
            calc.num2 = sc.nextInt();
            
            calc.calculations(calc.num1, calc.num2);
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            var yesNo = sc.next();
            if (yesNo.equals("no")) {
                var temp = calc.getCycle();
                calc.setCycle(temp -= 1);
                sc.close();
            } 
        }
    }
}